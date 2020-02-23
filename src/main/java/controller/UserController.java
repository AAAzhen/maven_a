package controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import pojo.User;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	@RequestMapping("/login")
	public String login(String username, String password,HttpServletRequest request,HttpServletResponse response,Model model) {
		
		
		User user = userService.selectUserByUsername(username);
		
		if(user != null && user.getPassword().equals(password)) {
			model.addAttribute("loginResult", "��½�ɹ�");
			Cookie cookie1 = new Cookie("username", username);
			Cookie cookie2 = new Cookie("password", password);
			cookie1.setMaxAge(60*60*24);
			cookie2.setMaxAge(60*60*24);
			//cookie1.setPath(request.getContextPath() + "/user/");
			//cookie2.setPath(request.getContextPath() + "/user1/");
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			return "user/home";
		}else {
			model.addAttribute("loginResult", "�û������������");
			return "forward:/WEB-INF/jsp/login.jsp";
		}
	}
	
	
	
	@RequestMapping("/regist")
	public String regist(User user, String repassword,Model model) {
		
		if(user.getPassword().equals(repassword)) {
			try {
				userService.registUser(user);
			} catch (Exception e) {
				e.printStackTrace();
				model.addAttribute("msg", "�û�ע��ʧ�ܣ�");
				return"forward:WEB-INF/jsp/error/error";
			}
			model.addAttribute("registResult", "ע��ɹ�������");
			return "regist";
		}
		else {
			model.addAttribute("registResult", "������������벻��ͬ������������");
			return "regist";
		}
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user,MultipartFile headpicpath,Model model) {
		
		if(headpicpath != null) {
			
			String headpath = "G:/ssm_workspace/picture/";
			
			String originalFilename = headpicpath.getOriginalFilename();
			
			String newHeadPath = headpath + UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File newFile = new File(newHeadPath);
			
			try {
				headpicpath.transferTo(newFile);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			user.setHeadpath(newHeadPath);
		}
		
		try {
			userService.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "�û���Ϣ����ʧ��");
			return "forward:/WEB-INF/jsp/error/error.jsp";
		}
		
		model.addAttribute("msg", "�û���Ϣ�޸ĳɹ�");
		
		return "forward:/WEB-INF/jsp/user/updateUser.jsp";
	}
	
	
	
	
	
	@RequestMapping("testCookie")
	public void testCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+"======"+cookie.getValue()+"======"+cookie.getPath());
		}
	}

}
