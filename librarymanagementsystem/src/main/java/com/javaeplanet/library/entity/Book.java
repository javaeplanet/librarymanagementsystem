package com.javaeplanet.library.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String author;
	private String isbn;
	private String publication;

	@ManyToMany(mappedBy = "books")
	private Set<Student> students;

	

	@ManyToOne
	@JoinColumn(name = "librarian_id")
	private Librarian librarian;
}
