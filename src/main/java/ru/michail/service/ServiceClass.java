package ru.michail.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.michail.model.Book;
import ru.michail.repo.Repositorum;

import java.util.List;

/**
 * Created by Admin on 10/5/16.
 */
@Service
public class ServiceClass {
    @Autowired
    public Repositorum  repositorum;
    public Book getBook(Integer id){
      return   repositorum.getBook(id);
    }
    public Integer saveBook(Book book){
        return   repositorum.saveBook(book);
    }
    public void modifyBook(Book book){
          repositorum.modifyBook(book);
    }
    public List<Book> getAll(){
        return repositorum.getBooks();
    }
    public void deleteBook(Integer id){
        repositorum.deleteBook(id);
    }

}
