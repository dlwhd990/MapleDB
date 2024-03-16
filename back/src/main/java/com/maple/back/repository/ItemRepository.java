package com.maple.back.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.maple.back.entity.Item;
import com.maple.back.mappingInterface.ItemSimple;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Long> {
  // 이름으로 아이템 검색
  @Query("SELECT i.id as id, i.name as name, i.image as image FROM Item i WHERE i.name LIKE CONCAT('%',:name,'%') ")
  List<ItemSimple> searchItem(String name);

  // 몬스터 아이디로 드랍 아이템 목록 불러오기
  @Query("Select i FROM Item i INNER JOIN MonsterItem mi ON i.id = mi.item_id WHERE mi.monster_id = :monster_id")
  List<Item> searchDropItem(@Param("monster_id") Long monster_id);
}
