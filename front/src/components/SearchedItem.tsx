import styles from "../styles/SearchedItem.module.css";

const SearchedItem = () => {
  return (
    <div className={styles.box}>
      <img
        src="https://maplestory.io/api/gms/62/mob/100101/render/move"
        alt="searched_item"
      />
      <p>파란 달팽이</p>
    </div>
  );
};

export default SearchedItem;
