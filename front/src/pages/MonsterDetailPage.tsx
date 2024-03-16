import Header from "../components/Header";
import styles from "../styles/MonsterDetailPage.module.css";

const MonsterDetailPage = () => {
  return (
    <main className={styles.monster_page}>
      <Header />
      <section className={styles.monster_info}></section>
      <section className={styles.item_info}></section>
    </main>
  );
};

export default MonsterDetailPage;
