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
}
