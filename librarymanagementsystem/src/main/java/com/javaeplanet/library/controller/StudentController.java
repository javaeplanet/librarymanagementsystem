package com.javaeplanet.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaeplanet.library.entity.Student;
import com.javaeplanet.library.service.LibraryService;

@Controller
public class StudentController {

	private static final Logger LOGGER=LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private LibraryService ls;

	@RequestMapping(value = "/showStudentReg", method = RequestMethod.GET)
	public String showStudentReg() {
		LOGGER.info("inside showStudentReg");
		return "login/studentReg";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(Student student) {
		LOGGER.info("inside saveStudent"+student);
		Student saveStudent = ls.saveStudent(student);
		return "login/successful";
	}
}
