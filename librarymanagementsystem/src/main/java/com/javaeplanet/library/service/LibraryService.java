package com.javaeplanet.library.service;

import java.util.List;

import com.javaeplanet.library.entity.Account;
import com.javaeplanet.library.entity.Book;
import com.javaeplanet.library.entity.Librarian;
import com.javaeplanet.library.entity.LibraryManagementSystem;
import com.javaeplanet.library.entity.Student;

public interface LibraryService {
	public Integer registerUser(LibraryManagementSystem lms);

	public Book addBook(Book book);

	public List<Book> getAllBooks();

	public Librarian registerLibrarian(Librarian lib);

	public Account registerAccount(Account account);
	
	public Student saveStudent(Student student);
	
	public List<Account> getAccountDetails();
}
