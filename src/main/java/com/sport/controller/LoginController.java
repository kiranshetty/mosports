package com.sport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sport.domain.LoginForm;

@Controller
public class LoginController {

   @RequestMapping(value="/Login", method = RequestMethod.GET)
   public String loginAccess(ModelMap model) {
	   LoginForm loginForm = new LoginForm();    
       model.put("loginForm", loginForm);
      return "login";
   }
   
   @RequestMapping(value="/LoginSubmit", method = RequestMethod.POST)
   public String loginSubmit(LoginForm loginForm) {
	   
	  System.out.println(loginForm.getEmailAddress());
	  System.out.println(loginForm.getPassword());
	  System.out.println(loginForm.isRememberMe());
      return "login";
   }
   
}