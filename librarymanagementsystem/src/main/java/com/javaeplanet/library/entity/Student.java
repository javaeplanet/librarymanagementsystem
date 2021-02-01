package com.javaeplanet.library.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	private String studentName;
	private String studentClass;
	private String email;
	private String phoneNumber;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Students_Books", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private Set<Book> books;
	
	@OneToOne(mappedBy = "student")
	private Account account;
	
	
}
