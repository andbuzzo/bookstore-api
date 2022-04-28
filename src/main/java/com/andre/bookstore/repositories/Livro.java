package com.andre.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Livro extends JpaRepository<com.andre.bookstore.domain.Livro, Integer> {

}
