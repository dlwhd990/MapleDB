package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Monster {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String image;

  @OneToOne(mappedBy = "monster")
  private MonsterInfo monsterinfo;
  
  @Override
  public String toString() {
    return "Monster [id=" + id + ", name=" + name + ", image=" + image + ", monsterinfo=" + monsterinfo + "]";
  }



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public MonsterInfo getMonsterinfo() {
    return monsterinfo;
  }

  public void setMonsterinfo(MonsterInfo monsterinfo) {
    this.monsterinfo = monsterinfo;
  }

  

  
}
