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
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no_borrowed_books;
	private String no_reserved_books;
	private String no_returned_books;
	private String no_lost_booksfine_amount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student student;

	

}
