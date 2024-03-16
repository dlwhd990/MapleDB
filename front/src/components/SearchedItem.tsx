import { useNavigate } from "react-router-dom";
import styles from "../styles/SearchedItem.module.css";
import { Item, Monster } from "../types/interface";

const SearchedItem: React.FC<{ type: String; item: Monster | Item }> = ({
  type,
  item,
}) => {
  const navigate = useNavigate();

  const moveToDetail = () => {
    navigate(`/${type}/detail/${item.id}`);
  };

  return (
    <div className={styles.box} onClick={moveToDetail}>
      <img src={`${item.image}`} alt="searched_item" />
      <p>{item.name}</p>
    </div>
  );
};

export default SearchedItem;
