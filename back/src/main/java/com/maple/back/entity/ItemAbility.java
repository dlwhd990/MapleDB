package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ItemAbility {
  @Id
  @GeneratedValue
  private Integer id;
  private Integer attack;
  private Integer magic;
  private Integer strong;
  private Integer dex;
  private Integer intel;
  private Integer luk;
  private Integer move_speed;
  private Integer jump;
  private Integer acc;
  private Integer avoid;
  private Integer attack_speed;
  private Integer upgrade_cnt;

  @OneToOne
  @JoinColumn(name="item_id",nullable = false)
  private Item item;
  
  @Override
  public String toString() {
    return "ItemAbility [id=" + id + ", attack=" + attack + ", magic=" + magic + ", strong=" + strong + ", dex=" + dex
        + ", intel=" + intel + ", luk=" + luk + ", move_speed=" + move_speed + ", jump=" + jump + ", acc=" + acc
        + ", avoid=" + avoid + ", attack_speed=" + attack_speed + ", upgrade_cnt=" + upgrade_cnt + "]";
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getAttack() {
    return attack;
  }
  public void setAttack(Integer attack) {
    this.attack = attack;
  }
  public Integer getMagic() {
    return magic;
  }
  public void setMagic(Integer magic) {
    this.magic = magic;
  }
  public Integer getStrong() {
    return strong;
  }
  public void setStrong(Integer strong) {
    this.strong = strong;
  }
  public Integer getDex() {
    return dex;
  }
  public void setDex(Integer dex) {
    this.dex = dex;
  }
  public Integer getIntel() {
    return intel;
  }
  public void setIntel(Integer intel) {
    this.intel = intel;
  }
  public Integer getLuk() {
    return luk;
  }
  public void setLuk(Integer luk) {
    this.luk = luk;
  }
  public Integer getMove_speed() {
    return move_speed;
  }
  public void setMove_speed(Integer move_speed) {
    this.move_speed = move_speed;
  }
  public Integer getJump() {
    return jump;
  }
  public void setJump(Integer jump) {
    this.jump = jump;
  }
  public Integer getAcc() {
    return acc;
  }
  public void setAcc(Integer acc) {
    this.acc = acc;
  }
  public Integer getAvoid() {
    return avoid;
  }
  public void setAvoid(Integer avoid) {
    this.avoid = avoid;
  }
  public Integer getAttack_speed() {
    return attack_speed;
  }
  public void setAttack_speed(Integer attack_speed) {
    this.attack_speed = attack_speed;
  }
  public Integer getUpgrade_cnt() {
    return upgrade_cnt;
  }
  public void setUpgrade_cnt(Integer upgrade_cnt) {
    this.upgrade_cnt = upgrade_cnt;
  }

  
}
