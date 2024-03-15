import React from "react";
import styles from "../styles/Mainpage.module.css";

const Mainpage = () => {
  return (
    <main>
      <div className={styles.top}>
        <div className={styles.filter}>
          <h1>메이플랜드 DB</h1>
        </div>
      </div>
    </main>
  );
};

export default Mainpage;
