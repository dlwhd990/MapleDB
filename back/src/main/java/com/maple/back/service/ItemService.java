package com.maple.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.back.entity.Item;
import com.maple.back.repository.ItemRepository;
import java.util.List;

@Service
public class ItemService {
  @Autowired
  private ItemRepository itemRepo;

  // 아이디로 아이템 상세 정보 불러오기
  public Item getItemInfoById(Long id) {
    return itemRepo.findById(id).orElse(null);
  }

  // 아이템 검색
  public List<Item> searchItem(String query) {
    return itemRepo.findByNameContaining(query);
  }
  
}
