package com.maple.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class MonsterInfo {
  @Id
  private Integer id;
  private Integer level;
  private Integer hp;
  private Integer mp;
  private Integer exp;
  private Integer max_meso;
  private Integer min_meso;
  private Integer phy_defense;
  private Integer mag_defense;
  
  @OneToOne
  @JoinColumn(name="monster_id",nullable=false)
  private Monster monster;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }
  public Integer getHp() {
    return hp;
  }
  public void setHp(Integer hp) {
    this.hp = hp;
  }
  public Integer getMp() {
    return mp;
  }
  public void setMp(Integer mp) {
    this.mp = mp;
  }
  public Integer getExp() {
    return exp;
  }
  public void setExp(Integer exp) {
    this.exp = exp;
  }
  public Integer getMax_meso() {
    return max_meso;
  }
  public void setMax_meso(Integer max_meso) {
    this.max_meso = max_meso;
  }
  public Integer getMin_meso() {
    return min_meso;
  }
  public void setMin_meso(Integer min_meso) {
    this.min_meso = min_meso;
  }
  public Integer getPhy_defense() {
    return phy_defense;
  }
  public void setPhy_defense(Integer phy_defense) {
    this.phy_defense = phy_defense;
  }
  public Integer getMag_defense() {
    return mag_defense;
  }
  public void setMag_defense(Integer mag_defense) {
    this.mag_defense = mag_defense;
  }

  

  // private Integer monster_id;  
}
