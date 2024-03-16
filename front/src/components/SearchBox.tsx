import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import styles from "../styles/SearchBox.module.css";
import { faSearch } from "@fortawesome/free-solid-svg-icons";
import SearchedItem from "./SearchedItem";
import { useEffect, useState } from "react";
import axios from "axios";
import { Monster } from "../types/interface";

const SearchBox = () => {
  const [query, setQuery] = useState("");
  const [resultList, setResultList] = useState([]);

  const changeQuery = (newQuery: string) => {
    setQuery(newQuery);
  };

  const loadSearchResult = () => {
    if (query === "") {
      setResultList([]);
      return;
    }

    axios
      .get(`/monster?search=${query}`)
      .then((res) => setResultList(res.data))
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
      {resultList.length > 0 && (
        <div className={styles.search_result_box}>
          {resultList.map((item: Monster) => (
            <SearchedItem item={item} />
          ))}
        </div>
      )}
    </div>
  );
};

export default SearchBox;
