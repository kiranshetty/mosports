package com.sport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {

   @RequestMapping(value="/sayHello", method = RequestMethod.GET)
   public String welcome(ModelMap model) {
      model.addAttribute("msgArgument", "Maven Java Web Application Project: Success!");

      return "index";
   }

   @RequestMapping(value="/Print/{arg}", method = RequestMethod.GET)
   public String welcomeName(@PathVariable String arg, ModelMap model) {
	   System.out.println("this is arg value:" + arg);
      model.addAttribute("msgArgument", "Maven Java Web Application Project, input variable: " + "Kiran");

      return "index";
   }
}