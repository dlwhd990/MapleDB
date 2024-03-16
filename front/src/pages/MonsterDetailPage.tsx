import { useParams } from "react-router-dom";
import Header from "../components/Header";
import styles from "../styles/MonsterDetailPage.module.css";
import axios from "axios";
import { useEffect, useState } from "react";
import { Item, Monster } from "../types/interface";
import InfoBox from "../components/InfoBox";
import ItemBox from "../components/ItemBox";

const MonsterDetailPage = () => {
  const { id } = useParams();
  const [detail, setDetail] = useState<Monster>();
  const [dropList, setDropList] = useState<Item[]>([]);

  const loadMonsterDetail = () => {
    axios
      .get(`/monster?id=${id}`)
      .then((res) => setDetail(res.data))
      .then(() => axios.get(`/item/drop?monsterid=${id}`))
      .then((res) => setDropList(res.data))
      .catch((err) => console.error(err));
  };

  useEffect(() => {
    loadMonsterDetail();
  }, [id]);

  return (
    <main className={styles.monster_page}>
      <Header />
      <div className={styles.container}>
        <section className={styles.monster_info}>
          {detail && (
            <>
              <img src={`${detail.image}`} alt="monster_image" />
              <p className={styles.name}>{detail.name}</p>
              <InfoBox
                title="레벨"
                value={detail.monster_info.level.toString()}
              />
              <InfoBox title="HP" value={detail.monster_info.hp.toString()} />
              <InfoBox title="MP" value={detail.monster_info.mp.toString()} />
              <InfoBox title="EXP" value={detail.monster_info.exp.toString()} />
              <InfoBox
                title="물리방어력"
                value={detail.monster_info.phy_defense.toString()}
              />
              <InfoBox
                title="마법방어력"
                value={detail.monster_info.mag_defense.toString()}
              />
              <InfoBox
                title="드랍메소"
                value={`${detail.monster_info.min_meso} ~ ${detail.monster_info.max_meso}`}
              />
            </>
          )}
        </section>
        <section className={styles.item_info}>
          <h2>드랍 아이템</h2>
          <div className={styles.item_container}>
            {dropList &&
              dropList.map((item) => (
                <ItemBox key={item.id.toString()} item={item} color="#fcd5de" />
              ))}
          </div>
        </section>
      </div>
    </main>
  );
};

export default MonsterDetailPage;
