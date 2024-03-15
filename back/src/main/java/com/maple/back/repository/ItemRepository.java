package com.maple.back.repository;

import org.springframework.data.repository.CrudRepository;

import com.maple.back.entity.Item;
import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Long> {
  List<Item> findByNameContaining(String name);
}
