package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class MonsterItem {
  @Id
  @GeneratedValue
  private Integer id;
  private Integer monster_id;
  private Integer item_id;

  @ManyToOne
  @JoinColumn(name="item", nullable = false)
  private Item item;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getMonster_id() {
    return monster_id;
  }
  public void setMonster_id(Integer monster_id) {
    this.monster_id = monster_id;
  }
  public Integer getItem_id() {
    return item_id;
  }
  public void setItem_id(Integer item_id) {
    this.item_id = item_id;
  }

  
}
