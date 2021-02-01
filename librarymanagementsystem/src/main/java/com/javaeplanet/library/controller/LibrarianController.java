package com.javaeplanet.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaeplanet.library.entity.Librarian;
import com.javaeplanet.library.service.LibraryService;
import com.javaeplanet.library.service.SecurityService;

@Controller
public class LibrarianController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LibrarianController.class);
	@Autowired
	private LibraryService ls;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private SecurityService service;

	@RequestMapping(value = "/showLibrarianReg", method = RequestMethod.GET)
	public String showReg() {
		LOGGER.info("inside showReg");
		return "login/registerLibrary";
	}

	@RequestMapping(value = "/saveLibrarian", method = RequestMethod.POST)
	public String saveLibrarian(Librarian lib, ModelMap modelMap) {
		LOGGER.info("inside saveLibrarian" + lib);
		lib.setPassword(encoder.encode(lib.getPassword()));
//		boolean loginResponse = service.login(email, password);
		Librarian librarian = ls.registerLibrarian(lib);
////		if (librarian != null && librarian.getPassword().equals(password)) {
//		if (loginResponse == true) {
//			return "login/studentReg";
//		} else {
//			modelMap.addAttribute("msg", "invalid username or password please try again");
//		}
		return "redirect:/loginPage";
	}

	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public String loginPage() {
		return "login/logincred";
	}

	@RequestMapping(value="/getLogged",method=RequestMethod.POST)
	public String getLogged(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		boolean loginResponse = service.login(email, password);
		if (loginResponse) {
			
		}
		return "redirect:/getAllBooks";
	}

	@RequestMapping(value = "/showLibrarianPage", method = RequestMethod.GET)
	public String showLibrarianPage() {
		LOGGER.info("inside showLibrarianPage");
		return "login/librarianPage";
	}

}
