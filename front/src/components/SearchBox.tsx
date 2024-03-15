import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import styles from "../styles/SearchBox.module.css";
import { faSearch } from "@fortawesome/free-solid-svg-icons";
import SearchedItem from "./SearchedItem";

const SearchBox = () => {
  return (
    <div className={styles.box}>
      <input type="text" />
      <button>
        <FontAwesomeIcon icon={faSearch} className={styles.icon} />
      </button>
      <div className={styles.search_result_box}>
        <SearchedItem />
        <SearchedItem />
        <SearchedItem />
      </div>
    </div>
  );
};

export default SearchBox;
