package com.example.bookaop.controllers;

import com.example.bookaop.models.Book;
import com.example.bookaop.models.Card;
import com.example.bookaop.service.BookService;
import com.example.bookaop.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CardService cardService;

    @GetMapping("/")
    public ModelAndView getList() {
        return new ModelAndView("list", "listBook", this.bookService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate() {
        return new ModelAndView("create", "book", new Book());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("book") Book book) {
        this.bookService.save(book);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        this.bookService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable("id") int id) {
        Book book = this.bookService.findById(id);
        Card card = new Card();

        book.setAmount(book.getAmount() - 1);
        this.bookService.save(book);

        card.setId((int) (Math.random() * (99999 - 10000) + 10000));
        card.setBook(book);
        this.cardService.save(card);
        return "redirect:/";
    }

    @GetMapping("/managerCard")
    public ModelAndView getListCard() {
        return new ModelAndView("listCard", "listCard", this.cardService.findAll());
    }

    @GetMapping("/rent/{id}")
    public String rentBook(@PathVariable("id") int id) {
        Book book = this.cardService.findById(id).getBook();
        book.setAmount(book.getAmount() + 1);
        this.bookService.save(book);
        this.cardService.delete(id);
        return "redirect:/";
    }
}
