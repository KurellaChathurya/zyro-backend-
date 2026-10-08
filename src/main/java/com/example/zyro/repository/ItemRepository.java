package com.example.zyro.repository;

import com.example.zyro.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByAvailableTrue();
    List<Item> findByCategory(String category);
}
