package com.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dashboard.bean.LoginBean;

import com.dashboard.service.FetchUserList;
import com.dashboard.utility.OauthAuthentication;

@Controller
public class HomeController {
	@Autowired
	private FetchUserList fetchUserList;
	@Autowired
	private OauthAuthentication oauthAuthentication;
	
	

	@RequestMapping("/login")
	public ModelAndView displaylogin() {
		ModelAndView mv = new ModelAndView("login");
		// System.out.println("test");

		mv.addObject("log", new LoginBean());
		return mv;
	}

	@RequestMapping(value = "/programpage", method = RequestMethod.POST)
	public ModelAndView user(LoginBean log) {
		ModelAndView mv = new ModelAndView("programpage");
		String user_email = log.getEmail();
		String user_password = log.getPassword();
		System.out.println(user_email);
		System.out.println(user_password);
		return new ModelAndView("programpage");
	}
	@RequestMapping(value = "/userlist", method = RequestMethod.POST)
	public ModelAndView programpage() {
		ModelAndView mv = new ModelAndView("userlist");
		
		return new ModelAndView("userlist");
	}
	
	
	  @RequestMapping(value="/userDetailsList",method = RequestMethod.GET)
	  
	  @ResponseBody 
	  public String handleMM() {
		
		
		String token = oauthAuthentication.createOauthToken("mithilesh@stylopay.com", "W@llet123",
				"http://developer.sandbox.stylopay.com:8081");
		return fetchUserList.fetchcustomer("1", "15", token, "Agent_Code", "Sub_Agent_code", null, null,
				"http://developer.sandbox.stylopay.com:8081/api-mm");

	}

	/*
	 * @RequestMapping(value="/userDetailsList2",method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String handleNIUM( HttpServletRequest request) { String
	 * token = oauthAuthentication.createOauthToken("mithilesh@stylopay.com",
	 * "W@llet123", "http://developer.sandbox.stylopay.com:8081"); return
	 * fetchNiumCustomers.fetchcustomer("1", "5", token, "Agent_Code",
	 * "Sub_Agent_code", request,
	 * "http://developer.sandbox.stylopay.com:8081/NISG");
	 * 
	 * }
	 */
}
