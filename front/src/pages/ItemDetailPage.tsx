import Header from "../components/Header";
import styles from "../styles/ItemDetailPage.module.css";

const ItemDetailPage = () => {
  return (
    <main className={styles.item_page}>
      <Header />
      <section className={styles.item_info}></section>
      <section className={styles.monster_info}></section>
    </main>
  );
};

export default ItemDetailPage;
