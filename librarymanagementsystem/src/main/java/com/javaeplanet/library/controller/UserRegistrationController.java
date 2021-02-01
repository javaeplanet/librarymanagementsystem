package com.javaeplanet.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaeplanet.library.entity.LibraryManagementSystem;
import com.javaeplanet.library.service.LibraryService;

@Controller
public class UserRegistrationController {
	private static final Logger LOGGER=LoggerFactory.getLogger(UserRegistrationController.class);
	@Autowired
	private LibraryService ls;

	@RequestMapping(value = "/showReg", method = RequestMethod.GET)
	public String showReg() {
		LOGGER.info("inside show Page");
		return "login/registerPage";
	}

	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("lms")LibraryManagementSystem lms) {
		LOGGER.info("inside registerUser "+lms);
		Integer registerUser = ls.registerUser(lms);
		return "redirect:/getAllBooks";
	}

}
