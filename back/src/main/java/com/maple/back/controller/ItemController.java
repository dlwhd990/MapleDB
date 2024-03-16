package com.maple.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.maple.back.entity.Item;
import com.maple.back.mappingInterface.ItemSimple;
import com.maple.back.service.ItemService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class ItemController {
  @Autowired
  ItemService itemService;
  
  // 아이디로 상세 정보 불러오기
  @GetMapping(path="/item", params="id")
  public Item getItemInfoById(@RequestParam Long id) {
    return itemService.getItemInfoById(id);
  }

  // 이름으로 검색한 결과
  @GetMapping(path = "/item", params = "search")
  public List<ItemSimple> searchItem(@RequestParam String search) {
      return itemService.searchItem(search);
  }
  
  
}
