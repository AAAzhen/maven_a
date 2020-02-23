package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Bank;
import service.BankService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired 
	private BankService bankService;
	 
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/toRegist")
	public String toRegist() {
		return "regist";
	}

	@RequestMapping("/toUpdateUser")
	public String toUpdateUser() {
		return "user/updateUser";
	}

	@RequestMapping("/toOpenAccount")
	public String toOpenAccount(Model model) {
		List<Bank> bankList = bankService.selectAllBank();
		model.addAttribute("bankList", bankList);
		return "user/openAccount";
	}

	@RequestMapping("/toHome")
	public String toHome() {
		return "user/home";
	}
}
