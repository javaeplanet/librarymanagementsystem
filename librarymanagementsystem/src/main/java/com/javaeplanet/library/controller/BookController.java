package com.javaeplanet.library.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaeplanet.library.entity.Book;
import com.javaeplanet.library.service.LibraryService;

@Controller
//@RequestMapping("/book")
public class BookController {
private static final Logger LOGGER=LoggerFactory.getLogger(BookController.class);
	@Autowired
	private LibraryService ls;

	@RequestMapping(value = "/showBookPage", method = RequestMethod.GET)
	public String showPage() {
		LOGGER.info("showPage");
		return "login/saveBook";
	}

	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		LOGGER.info("inside saveBook"+book);
		Book bk = ls.addBook(book);
		return "redirect:/getAllBooks";

	}

	@RequestMapping(value = "/getAllBooks", method = RequestMethod.GET)
	public String getAllBooks(ModelMap modelMap) {
		LOGGER.info("inside getAllBooks ");
		List<Book> books = ls.getAllBooks();
		modelMap.addAttribute("books", books);
		return "login/displaybooks";
	}

	

}
