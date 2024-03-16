package com.maple.back.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.maple.back.entity.Monster;
import com.maple.back.mappingInterface.MonsterSimple;

import java.util.List;

public interface MonsterRepository extends CrudRepository<Monster, Long> {
  List<Monster> findByNameContaining(String name);

  // 몬스터 이름으로 검색 (JPQL 사용하여 일부 컬럼만 조회하기)
  @Query("SELECT m.id as id, m.name as name, m.image as image FROM Monster m WHERE m.name LIKE CONCAT('%',:name,'%')")
  List<MonsterSimple> searchMonster(@Param("name") String name);
}
