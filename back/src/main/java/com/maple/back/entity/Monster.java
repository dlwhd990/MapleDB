package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;

@Entity
public class Monster {
  @Id
  @GeneratedValue
  
  private Integer id;
  private String name;
  private String image;

  @OneToOne(mappedBy = "monster")
  private MonsterInfo monster_info;

  @OneToMany(mappedBy = "monster")
  private List<MonsterItem> monsterItem; 

  
  @Override
  public String toString() {
    return "Monster [id=" + id + ", name=" + name + ", image=" + image + ", monsterinfo=" + monster_info + "]";
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

  public MonsterInfo getMonster_info() {
    return monster_info;
  }

  public void setMonster_info(MonsterInfo monster_info) {
    this.monster_info = monster_info;
  }



  

  
}
