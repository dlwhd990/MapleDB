package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;

@Entity
public class Item {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String kind;
  private Integer price;
  private String image;
  private String description;

  @OneToOne(mappedBy = "item")
  private ItemRequire itemRequire;

  @OneToOne(mappedBy = "item")
  private ItemAbility itemAbility;

  @OneToMany(mappedBy = "item")
  private List<MonsterItem> monsterItem; 

  @Override
  public String toString() {
    return "Item [id=" + id + ", name=" + name + ", kind=" + kind + ", price=" + price + ", image=" + image
        + ", description=" + description + ", itemRequire=" + itemRequire + ", itemAbility=" + itemAbility + "]";
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

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemRequire getItemRequire() {
    return itemRequire;
  }

  public void setItemRequire(ItemRequire itemRequire) {
    this.itemRequire = itemRequire;
  }

  public ItemAbility getItemAbility() {
    return itemAbility;
  }

  public void setItemAbility(ItemAbility itemAbility) {
    this.itemAbility = itemAbility;
  }

  
}
