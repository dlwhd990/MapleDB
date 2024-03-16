import styles from "../styles/ItemBox.module.css";
import { Item } from "../types/interface";
import InfoBox from "./InfoBox";

const ItemBox: React.FC<{ item: Item }> = ({ item }) => {
  return (
    <div className={styles.box}>
      <div className={styles.simple}>
        <img src={`${item.image}`} alt="item_image" />
        <p className={styles.name}>{item.name}</p>
        <p className={styles.price}>{`${item.price.toLocaleString()} 메소`}</p>
      </div>
      <div className={styles.data_container}>
        {item.kind !== "장비" && (
          <div className={styles.not_equip}>
            <p className={styles.desc}>{`${item.description}`}</p>
          </div>
        )}
        {item.itemAbility && (
          <div className={styles.equip}>
            <div className={styles.ability}>
              <h3>능력치</h3>
              {item.itemAbility.attack > 0 && (
                <InfoBox title="공격력" value={`${item.itemAbility?.attack}`} />
              )}
              {item.itemAbility.magic > 0 && (
                <InfoBox title="마력" value={`${item.itemAbility?.magic}`} />
              )}
              {item.itemAbility.strong > 0 && (
                <InfoBox title="STR" value={`${item.itemAbility?.strong}`} />
              )}
              {item.itemAbility.dex > 0 && (
                <InfoBox title="DEX" value={`${item.itemAbility?.dex}`} />
              )}
              {item.itemAbility.intel > 0 && (
                <InfoBox title="INT" value={`${item.itemAbility?.intel}`} />
              )}
              {item.itemAbility.luk > 0 && (
                <InfoBox title="LUK" value={`${item.itemAbility?.luk}`} />
              )}
              {item.itemAbility.move_speed > 0 && (
                <InfoBox
                  title="이동 속도"
                  value={`${item.itemAbility?.move_speed}`}
                />
              )}
              {item.itemAbility.jump > 0 && (
                <InfoBox title="점프력" value={`${item.itemAbility?.jump}`} />
              )}
              {item.itemAbility.acc > 0 && (
                <InfoBox title="명중률" value={`${item.itemAbility?.acc}`} />
              )}
              {item.itemAbility.avoid > 0 && (
                <InfoBox title="회피율" value={`${item.itemAbility?.avoid}`} />
              )}
              {item.itemAbility.attack_speed > 0 && (
                <InfoBox
                  title="공격 속도"
                  value={`${item.itemAbility?.attack_speed}`}
                />
              )}
              {item.itemAbility.upgrade_cnt > 0 && (
                <InfoBox
                  title="업그레이드 횟수"
                  value={`${item.itemAbility?.upgrade_cnt}`}
                />
              )}
            </div>
            <div className={styles.require}>
              <h3>요구치</h3>
              <InfoBox title="레벨" value={`${item.itemRequire?.req_level}`} />
              <InfoBox title="STR" value={`${item.itemRequire?.req_strong}`} />
              <InfoBox title="DEX" value={`${item.itemRequire?.req_dex}`} />
              <InfoBox title="INT" value={`${item.itemRequire?.req_intel}`} />
              <InfoBox title="LUK" value={`${item.itemRequire?.req_luk}`} />
              <InfoBox title="POP" value={`${item.itemRequire?.req_pop}`} />
            </div>
          </div>
        )}
      </div>
    </div>
  );
};

export default ItemBox;
