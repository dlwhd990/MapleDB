package com.maple.back.repository;

import org.springframework.data.repository.CrudRepository;

import com.maple.back.entity.Monster;
import java.util.List;

public interface MonsterRepository extends CrudRepository<Monster, Long> {
  List<Monster> findByNameContaining(String name);
}
