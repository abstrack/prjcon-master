package ru.michail.view;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.michail.model.Book;
import ru.michail.service.ServiceClass;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 10/5/16.
 */
@Controller
public class ControllerClass {
    @Autowired
    ServiceClass serviceClass;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getTable(Model model) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listatt", serviceClass.getAll());
        return modelAndView;
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteBook(@RequestParam("id") Integer id){
        serviceClass.deleteBook(id);
        return "redirect:/list";
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createBook(Model model){
        model.addAttribute("book", new Book());
        return "crupdate";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editBook(Model model,@RequestParam("id") Integer id ){
        model.addAttribute("book",serviceClass.getBook(id));
        return "crupdate";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editBook(@ModelAttribute("book") Book book){
        if(book.getId()!=null){
            serviceClass.modifyBook(book);
        }
        else serviceClass.saveBook(book);
        return "redirect:/list";
    }
}
