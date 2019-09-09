package com.example.sjp.service;

import com.example.sjp.model.Book;
import com.example.sjp.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBooks(Book book) {
        createBookWithRequiredPropagation(book);

        createBookWithSupportsPropagation(book);

        createBookWithMandatoryPropagation(book);

        createBookWithRequiresNewPropagation(book);

        createBookWithNotSupportedPropagation(book);

        createBookWithNeverPropagation(book);

        createBookWithNestedPropagation(book);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    private void createBookWithRequiredPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    private void createBookWithSupportsPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    private void createBookWithMandatoryPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    private void createBookWithRequiresNewPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    private void createBookWithNotSupportedPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.NEVER)
    private void createBookWithNeverPropagation(Book book) {
        bookRepository.save(book);
    }

    @Transactional(propagation = Propagation.NESTED)
    private void createBookWithNestedPropagation(Book book) {
        bookRepository.save(book);
    }
}
