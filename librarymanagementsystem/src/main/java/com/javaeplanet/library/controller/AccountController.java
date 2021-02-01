package com.javaeplanet.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaeplanet.library.entity.Account;
import com.javaeplanet.library.service.LibraryService;

@Controller
public class AccountController {

	private static final Logger LOGGER=LoggerFactory.getLogger(AccountController.class);
	@Autowired
	private LibraryService ls;

	@RequestMapping(value = "/showAccountPage", method = RequestMethod.GET)
	public String showAccountPage() {
		LOGGER.info("inside showAccountPage");
		return "login/accountDetails";
	}

	@RequestMapping(value = "/saveAccountDetails", method = RequestMethod.POST)
	public String saveAccountDetails(Account account) {
		LOGGER.info("inside saveAccountDetails"+account);
		ls.registerAccount(account);
		return "redirect:/getAccountDetails";
	}

	@RequestMapping(value="/getAccountDetails",method= RequestMethod.GET)
	public String getAccountDetails(ModelMap modelMap) {
		LOGGER.info("inside getAccountDetails");
		List<Account> accounts = ls.getAccountDetails();
		modelMap.addAttribute("accounts", accounts);
		return "login/displayaccountDetails";
	}
}
