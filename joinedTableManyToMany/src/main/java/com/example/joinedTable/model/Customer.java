package com.example.joinedTable.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;


    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_item",
        joinColumns ={@JoinColumn(name="customer_fk")},
        inverseJoinColumns = {@JoinColumn(name = "item_fk")}

    )
    private Set<Item> items = new HashSet<>();

    public Customer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
