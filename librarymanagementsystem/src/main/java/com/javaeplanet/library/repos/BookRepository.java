package com.javaeplanet.library.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaeplanet.library.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
