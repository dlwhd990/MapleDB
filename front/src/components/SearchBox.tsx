import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import styles from "../styles/SearchBox.module.css";
import { faSearch } from "@fortawesome/free-solid-svg-icons";
import SearchedItem from "./SearchedItem";
import { useEffect, useState } from "react";
import axios from "axios";
import { Item, Monster } from "../types/interface";

const SearchBox = () => {
  const [query, setQuery] = useState("");
  const [monsterList, setMonsterList] = useState([]);
  const [itemList, setItemList] = useState([]);

  const changeQuery = (newQuery: string) => {
    setQuery(newQuery);
  };

  const clearQuery = () => {
    setQuery("");
  };

  const loadSearchResult = () => {
    if (query === "") {
      setMonsterList([]);
      setItemList([]);
      return;
    }

    axios
      .get(`/monster?search=${query}`)
      .then((res) => setMonsterList(res.data))
      .then(() => axios.get(`/item?search=${query}`))
      .then((res) => setItemList(res.data))
      .catch((err) => console.error(err));
  };

  useEffect(() => {
    const debounceHandler = setTimeout(() => {
      loadSearchResult();
    }, 200);
    return () => clearTimeout(debounceHandler);
  }, [query]);

  return (
    <div className={styles.box}>
      <input
        type="text"
        value={query}
        onChange={(e) => changeQuery(e.target.value)}
      />
      <button>
        <FontAwesomeIcon icon={faSearch} className={styles.icon} />
      </button>
      {(monsterList.length > 0 || itemList.length > 0) && (
        <div className={styles.search_result_box}>
          {monsterList.slice(0, 3).map((item: Monster) => (
            <SearchedItem
              key={item.id.toString()}
              type="monster"
              item={item}
              clearQuery={clearQuery}
            />
          ))}
          {monsterList.length > 0 && itemList.length > 0 && (
            <div className={styles.divide_line}></div>
          )}
          {itemList.slice(0, 3).map((item: Item) => (
            <SearchedItem
              key={item.id.toString()}
              type="item"
              item={item}
              clearQuery={clearQuery}
            />
          ))}
        </div>
      )}
    </div>
  );
};

export default SearchBox;
