package com.example.joinedTable.repository;

import com.example.joinedTable.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<Customer, Integer> {
}
