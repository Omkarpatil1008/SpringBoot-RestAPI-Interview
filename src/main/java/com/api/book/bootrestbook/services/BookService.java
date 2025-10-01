package com.api.book.bootrestbook.services;
import com.api.book.bootrestbook.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(123,"Omkar","Billiniore"));  
        list.add(new Book(456,"Sarang","Tilliniore")); 
        list.add(new Book(789,"Rishika","Milliniore"));  
    }

    //get all books
    public List<Book>getAllBooks(){
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        Book book=null;
        book = list.stream().filter(e ->e.getId()==id).findFirst().get();
        return book;
    }

    //adding the book
    public Book addBook(Book b){
        list.add(b);
        return b;
    }
    
    //delete book by id
    public void deleteBookById(int bid) {
        list = list.stream()
                  .filter(b -> b.getId() != bid)
                  .collect(Collectors.toList());
    }
    
    //delete all books
    public void deleteAllBooks() {
        list.clear();
    }
    
    //update book
    public Book updateBook(Book book) {
        list = list.stream()
                  .map(b -> {
                      if(b.getId() == book.getId()) {
                          b.setTitle(book.getTitle());
                          b.setAuthor(book.getAuthor());
                      }
                      return b;
                  })
                  .collect(Collectors.toList());
        return book;
    }
    
}
