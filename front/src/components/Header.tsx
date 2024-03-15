import styles from "../styles/Header.module.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars, faHome } from "@fortawesome/free-solid-svg-icons";
import SearchBox from "./SearchBox";

const Header = () => {
  return (
    <header className={styles.header}>
      <button className={styles.outer_button}>
        <FontAwesomeIcon icon={faHome} className={styles.icon} />
      </button>
      <SearchBox />
      <button className={styles.outer_button}>
        <FontAwesomeIcon icon={faBars} className={styles.icon} />
      </button>
    </header>
  );
};

export default Header;
