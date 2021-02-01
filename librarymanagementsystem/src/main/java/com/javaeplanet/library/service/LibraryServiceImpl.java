package com.javaeplanet.library.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaeplanet.library.entity.Account;
import com.javaeplanet.library.entity.Book;
import com.javaeplanet.library.entity.Librarian;
import com.javaeplanet.library.entity.LibraryManagementSystem;
import com.javaeplanet.library.entity.Student;
import com.javaeplanet.library.repos.AccountRepository;
import com.javaeplanet.library.repos.BookRepository;
import com.javaeplanet.library.repos.LibrarianRepository;
import com.javaeplanet.library.repos.LibraryManagementSystemRepository;
import com.javaeplanet.library.repos.StudentRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
	private static final Logger LOGGER=LoggerFactory.getLogger(LibraryServiceImpl.class);
	@Autowired
	private LibraryManagementSystemRepository lm;

	@Autowired
	private BookRepository bk;

	@Autowired
	private LibrarianRepository lr;

	@Autowired
	private AccountRepository ac;

	@Autowired
	private StudentRepository sr;

	@Override
	public Integer registerUser(LibraryManagementSystem lms) {
		LOGGER.info("inside registerUser"+lms);
		return lm.save(lms).getId();

	}

	@Override
	public Book addBook(Book book) {
		LOGGER.info("inside addBook"+book);
		return bk.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		LOGGER.info("inside getAllBooks");
		return (List<Book>) bk.findAll();
	}

	@Override
	public Librarian registerLibrarian(Librarian lib) {
		LOGGER.info("inside registerLibrarian"+lib);
		return lr.save(lib);
	}

	@Override
	public Account registerAccount(Account account) {
		LOGGER.info("inside registerAccount"+account);
		return ac.save(account);
	}

	@Override
	public Student saveStudent(Student student) {
		LOGGER.info("inside saveStudent"+student);
		return sr.save(student);
	}

	@Override
	public List<Account> getAccountDetails() {
		LOGGER.info("inside getAccountDetails");
		Iterable<Account> findAll = ac.findAll();
		return (List<Account>) findAll;
	}
	
	

}
