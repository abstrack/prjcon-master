package repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.michail.model.Book;
import ru.michail.repo.Repositorum;
import ru.michail.service.ServiceClass;


import javax.persistence.EntityNotFoundException;

import static org.junit.Assert.*;

/**
 * Created by Admin on 10/5/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring.xml")
public class RepositorumTest {
    @Autowired
    Repositorum repositorum;
    @Autowired
    ServiceClass serviceClass;
    @Test
    public void getBook(){
    serviceClass.getBook(603);
    }
    @Test
    public void saveBook(){
        assertTrue(repositorum.saveBook(new Book("Korovi", "Staccow", 1488))!=0);

    }


}