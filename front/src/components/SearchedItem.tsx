import styles from "../styles/SearchedItem.module.css";
import { Monster } from "../types/interface";

// 3월 16일 monster, item 인터페이스 작성 후 여기 채워넣기부터 시작
const SearchedItem: React.FC<{ item: Monster }> = ({ item }) => {
  return (
    <div className={styles.box}>
      <img src={`${item.image}`} alt="searched_item" />
      <p>{item.name}</p>
    </div>
  );
};

export default SearchedItem;
