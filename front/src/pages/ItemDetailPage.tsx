import Header from "../components/Header";
import styles from "../styles/ItemDetailPage.module.css";

const ItemDetailPage = () => {
  return (
    <main className={styles.item_page}>
      <Header />
      <div className={styles.container}>
        <section className={styles.item_info}></section>
        <section className={styles.monster_info}></section>
      </div>
    </main>
  );
};

export default ItemDetailPage;
