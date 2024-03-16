import { useNavigate } from "react-router-dom";
import styles from "../styles/MonsterBox.module.css";
import { Monster } from "../types/interface";

const MonsterBox: React.FC<{ monster: Monster }> = ({ monster }) => {
  const navigate = useNavigate();
  return (
    <div
      className={styles.box}
      onClick={() => navigate(`/monster/detail/${monster.id}`)}
    >
      <img src={`${monster.image}`} alt="monster_image" />
      <div className={styles.data_container}>
        <p className={styles.name}>{monster.name}</p>
        <p className={styles.level}>{`LV.${monster.monster_info.level}`}</p>
      </div>
    </div>
  );
};

export default MonsterBox;
