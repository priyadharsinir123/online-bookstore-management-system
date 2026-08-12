package com.fxec.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fxec.bookstore.entity.Book;
import com.fxec.bookstore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> searchBooks(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Book> getBooksByCategory(String category) {
        return bookRepository.findByCategoryIgnoreCase(category);
    }

    public List<Book> getBooksByPriceRange(double min, double max) {
        return bookRepository.findByPriceBetween(min, max);
    }

    public Book updateBook(Long id, Book book) {

        Optional<Book> existingBook = bookRepository.findById(id);

        if (existingBook.isPresent()) {

            Book oldBook = existingBook.get();

            oldBook.setTitle(book.getTitle());
            oldBook.setAuthor(book.getAuthor());
            oldBook.setCategory(book.getCategory());
            oldBook.setPrice(book.getPrice());

            return bookRepository.save(oldBook);
        }

        return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}