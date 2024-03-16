package com.maple.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.back.repository.MonsterRepository;
import com.maple.back.entity.Monster;
import com.maple.back.mappingInterface.MonsterSimple;

import java.util.List;

@Service
public class MonsterService {
  @Autowired
  private MonsterRepository monsterRepo;

  // 모든 몬스터 출력
  public List<Monster> findAll() {
    return (List<Monster>) monsterRepo.findAll();
  }

  // 아이디로 몬스터 상세 정보 출력
  public Monster findMonsterInfoById(Long id) {
    return monsterRepo.findById(id).orElse(null);
  }

  // 이름으로 몬스터 기본 정보 출력
  public List<MonsterSimple> searchMonster (String query) {
    return monsterRepo.searchMonster(query);
  }
}
