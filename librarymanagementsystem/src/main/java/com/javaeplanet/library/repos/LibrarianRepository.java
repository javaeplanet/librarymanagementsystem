package com.javaeplanet.library.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaeplanet.library.entity.Librarian;

public interface LibrarianRepository extends CrudRepository<Librarian, Integer> {

	Librarian findByemail(String username);

}
