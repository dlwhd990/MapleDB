import React from "react";
import styles from "../styles/Mainpage.module.css";
import Header from "../components/Header";

const Mainpage = () => {
  return (
    <main className={styles.main_page}>
      <Header />
      <div className={styles.top}>
        <div className={styles.filter}>
          <h1>메이플랜드 DB</h1>
        </div>
      </div>
    </main>
  );
};

export default Mainpage;
