import axios from "axios";
import Header from "../components/Header";
import ItemBox from "../components/ItemBox";
import styles from "../styles/ItemDetailPage.module.css";
import { useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import { Item, Monster } from "../types/interface";
import MonsterBox from "../components/MonsterBox";

const ItemDetailPage = () => {
  const { id } = useParams();
  const [detail, setDetail] = useState<Item>();
  const [dropList, setDropList] = useState<Monster[]>([]);

  const loadItemDetail = () => {
    axios
      .get(`/item?id=${id}`)
      .then((res) => setDetail(res.data))
      .then(() => axios.get(`/monster/drop?itemid=${id}`))
      .then((res) => setDropList(res.data))
      .catch((err) => console.error(err));
  };

  useEffect(() => {
    loadItemDetail();
  }, [id]);

  return (
    <main className={styles.item_page}>
      <Header />
      <div className={styles.container}>
        <section className={styles.item_info}>
          {detail && <ItemBox item={detail} color="white" />}
        </section>
        <section className={styles.monster_info}>
          <h3>드랍 몬스터</h3>
          <div className={styles.monster_container}>
            {dropList.map((monster) => (
              <MonsterBox monster={monster} />
            ))}
          </div>
        </section>
      </div>
    </main>
  );
};

export default ItemDetailPage;
