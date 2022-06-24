package com.example.joinedTable.repository;

import com.example.joinedTable.model.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemrepo extends JpaRepository<Item, Integer> {



}
