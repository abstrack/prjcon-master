package ru.michail.repo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.michail.model.Book;

import java.util.List;

/**
 * Created by Admin on 10/5/16.
 */
@Repository
public class Repositorum {
    final
    SessionFactory sf;

    @Autowired
    public Repositorum(SessionFactory sf) {
        this.sf = sf;
    }


    public Book getBook(Integer id) {

        return sf.openSession().get(Book.class, id);
    }
    public List<Book> getBooks(){
       return sf.openSession().createQuery("from Book").list();
    }
    @Transactional
    public Integer saveBook(Book book) {
        return (Integer) sf.getCurrentSession().save(book);
    }

    @Transactional
    public void deleteBook(Integer id) {
        sf.getCurrentSession().remove(sf.getCurrentSession().load(Book.class, id));
    }

    @Transactional
    public void modifyBook(Book book) {
        sf.getCurrentSession().update(book);
    }
}
