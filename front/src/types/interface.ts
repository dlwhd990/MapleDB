export interface Monster {
  id: Number;
  name: String;
  image: String;
  monster_info: MonsterInfo;
}

export interface MonsterInfo {
  id: Number;
  level: Number;
  hp: Number;
  mp: Number;
  exp: Number;
  max_meso: Number;
  min_meso: Number;
  phy_defense: Number;
  mag_defense: Number;
  monster_id: Number;
}

export interface Item {
  id: Number;
  name: String;
  kind: String;
  price: Number;
  image: String;
  description: String;
  itemAbility?: ItemAbility;
  itemRequire?: ItemRequire;
}

export interface ItemAbility {
  id: Number;
  attack: Number;
  magic: Number;
  strong: Number;
  dex: Number;
  intel: Number;
  luk: Number;
  move_speed: Number;
  jump: Number;
  acc: Number;
  avoid: Number;
  attack_speed: Number;
  upgrade_cnt: Number;
}

export interface ItemRequire {
  id: Number;
  req_level: Number;
  req_strong: Number;
  req_dex: Number;
  req_intel: Number;
  req_luk: Number;
  req_pop: Number;
  poss_beginner: Boolean;
  poss_warrior: Boolean;
  poss_bowman: Boolean;
  poss_magician: Boolean;
  poss_thief: Boolean;
}
