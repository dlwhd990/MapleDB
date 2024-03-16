package com.maple.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maple.back.service.MonsterService;

import lombok.RequiredArgsConstructor;

import com.maple.back.entity.Monster;
import com.maple.back.mappingInterface.MonsterSimple;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MonsterController {
  @Autowired
  MonsterService monsterService;

  // 모든 몬스터 출력
  @GetMapping("/monster/all")
  public List<Monster> getAllMonster() {
    return monsterService.findAll();
  }

  // 아이디로 몬스터 상세 정보 출력
  @GetMapping(path="/monster", params="id")
  public Monster getMonsterInfoById(@RequestParam Long id) {
    return monsterService.findMonsterInfoById(id);
  }

  @GetMapping(path="/monster", params="search")
  public List<MonsterSimple> searchMonster (@RequestParam String search) {
    return monsterService.searchMonster(search);
  }
  
  @GetMapping(path="/monster/drop",params="itemid")
  public List<Monster> searchDropMonster (@RequestParam Long itemid) {
    return monsterService.searchDropMonster(itemid);
  }
}
