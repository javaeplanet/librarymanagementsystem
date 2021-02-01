package com.javaeplanet.library.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class LibraryDatabase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer List_of_books;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "librarian_id")
	private Librarian librarian;
}
