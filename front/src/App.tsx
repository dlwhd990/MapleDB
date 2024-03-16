import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import Header from "./components/Header";
import Mainpage from "./pages/Mainpage";
import MonsterDetailPage from "./pages/MonsterDetailPage";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Mainpage />} />
        <Route path="/monster/detail/:id" element={<MonsterDetailPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
