package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ItemRequire {
  @Id
  @GeneratedValue
  private Integer id;
  private Integer req_level;
  private Integer req_strong;
  private Integer req_dex;
  private Integer req_intel;
  private Integer req_luk;
  private Integer req_pop;
  private Boolean poss_beginner;
  private Boolean poss_warrior;
  private Boolean poss_bowman;
  private Boolean poss_magician;
  private Boolean poss_thief;

  @OneToOne
  @JoinColumn(name="item_id",nullable = false)
  private Item item;

  @Override
  public String toString() {
    return "ItemRequire [id=" + id + ", req_level=" + req_level + ", req_strong=" + req_strong + ", req_dex=" + req_dex
        + ", req_intel=" + req_intel + ", req_luk=" + req_luk + ", req_pop=" + req_pop + ", poss_beginner="
        + poss_beginner + ", poss_warrior=" + poss_warrior + ", poss_bowman=" + poss_bowman + ", poss_magician="
        + poss_magician + ", poss_thief=" + poss_thief + "]";
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getReq_level() {
    return req_level;
  }

  public void setReq_level(Integer req_level) {
    this.req_level = req_level;
  }

  public Integer getReq_strong() {
    return req_strong;
  }

  public void setReq_strong(Integer req_strong) {
    this.req_strong = req_strong;
  }

  public Integer getReq_dex() {
    return req_dex;
  }

  public void setReq_dex(Integer req_dex) {
    this.req_dex = req_dex;
  }

  public Integer getReq_intel() {
    return req_intel;
  }

  public void setReq_intel(Integer req_intel) {
    this.req_intel = req_intel;
  }

  public Integer getReq_luk() {
    return req_luk;
  }

  public void setReq_luk(Integer req_luk) {
    this.req_luk = req_luk;
  }

  public Integer getReq_pop() {
    return req_pop;
  }

  public void setReq_pop(Integer req_pop) {
    this.req_pop = req_pop;
  }

  public Boolean getPoss_beginner() {
    return poss_beginner;
  }

  public void setPoss_beginner(Boolean poss_beginner) {
    this.poss_beginner = poss_beginner;
  }

  public Boolean getPoss_warrior() {
    return poss_warrior;
  }

  public void setPoss_warrior(Boolean poss_warrior) {
    this.poss_warrior = poss_warrior;
  }

  public Boolean getPoss_bowman() {
    return poss_bowman;
  }

  public void setPoss_bowman(Boolean poss_bowman) {
    this.poss_bowman = poss_bowman;
  }

  public Boolean getPoss_magician() {
    return poss_magician;
  }

  public void setPoss_magician(Boolean poss_magician) {
    this.poss_magician = poss_magician;
  }

  public Boolean getPoss_thief() {
    return poss_thief;
  }

  public void setPoss_thief(Boolean poss_thief) {
    this.poss_thief = poss_thief;
  }

  

}
