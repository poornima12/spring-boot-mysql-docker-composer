package com.littlebit_extra.springbootmysqldockercompose.controller;

import com.littlebit_extra.springbootmysqldockercompose.entity.Book;
import com.littlebit_extra.springbootmysqldockercompose.repo.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * by @author poornima on 2019-05-28
 **/
@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PutMapping("/book/{book_id}")
    public Book updateBook(@PathVariable("book_id") Long bookId, @RequestBody Book book)
    {
        Book existingBook = bookRepository.findById(bookId).get();
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        return bookRepository.save(existingBook);
    }

    @GetMapping("/books/{book_id}")
    @ResponseBody
    public Book findByUserId(@PathVariable("book_id") Long bookId)
    {
        return bookRepository.findById(bookId).get();
    }
}
