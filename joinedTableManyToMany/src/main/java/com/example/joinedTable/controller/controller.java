package com.example.joinedTable.controller;


import com.example.joinedTable.model.Customer;
import com.example.joinedTable.model.Item;
import com.example.joinedTable.repository.itemrepo;
import com.example.joinedTable.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Controller
public class controller {

    @Autowired
    private itemrepo itemR;

    @Autowired
    private repository cusrepo;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/")
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView("index");
        Item item = new Item();

        item.setName("item1");
        Item item2 = new Item();
        item2.setName("item2");
        Customer cus = new Customer();

        cus.setName("yuri");



        cus.getItems().add(item);
        cus.getItems().add(item2);


        this.cusrepo.save(cus);
        System.out.println("added");

        return mv;
    }

}
