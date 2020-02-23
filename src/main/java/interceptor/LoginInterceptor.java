package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import pojo.User;

public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String url = request.getRequestURI();
		if(url.indexOf("index/index")>=0 || url.indexOf("toLogin")>=0 || url.indexOf("toRegist")>=0
				|| url.indexOf("login")>=0 || url.indexOf("regist")>=0) {
			return true;
		}
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			return true;
		}
		else {
			request.setAttribute("msg", "还没有登录，请先登录");
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
			return false;
		}
	}

}
