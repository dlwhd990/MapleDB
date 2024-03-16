package com.maple.back.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.maple.back.entity.Item;
import com.maple.back.mappingInterface.ItemSimple;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Long> {
  List<Item> findByNameContaining(String name);

  @Query("SELECT i.id as id, i.name as name, i.image as image FROM Item i WHERE i.name LIKE CONCAT('%',:name,'%') ")
  List<ItemSimple> searchItem(String name);
}
