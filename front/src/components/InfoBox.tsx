import styles from "../styles/InfoBox.module.css";

const InfoBox: React.FC<{ title: String; value: String }> = ({
  title,
  value,
}) => {
  return (
    <div className={styles.box}>
      <p className={styles.title}>{title}</p>
      <p className={styles.value}>{value}</p>
    </div>
  );
};

export default InfoBox;
