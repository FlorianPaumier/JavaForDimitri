package fr.iialaval.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.iialaval.eshop.repositories.Customer_Repository;

@Controller
public class HelloController {

    /**
     * Persistant manager of customer auto instanciation
     */
    @Autowired
    private Customer_Repository repo;


    @RequestMapping("/hello")
    public String index() {

        return "index";
    }
}
