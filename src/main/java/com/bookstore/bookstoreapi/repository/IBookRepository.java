package com.bookstore.bookstoreapi.repository;

import com.bookstore.bookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
