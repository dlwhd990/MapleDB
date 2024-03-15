package com.maple.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.back.repository.MonsterRepository;
import com.maple.back.entity.Monster;
import java.util.List;

@Service
public class MonsterService {
  @Autowired
  private MonsterRepository monsterRepo;

  // 모든 몬스터 출력
  public List<Monster> findAll() {
    return (List<Monster>) monsterRepo.findAll();
  }

  // 아이디로 몬스터 상세 정보 출력 (기본 => 상세로 수정 필요)
  // join => mapping
  public Monster findMonsterInfoById(Long id) {
    return monsterRepo.findById(id).orElse(null);
  }

  // 이름으로 몬스터 기본 정보 출력
  public List<Monster> searchMonster (String query) {
    return monsterRepo.findByNameContaining(query);
  }
}
