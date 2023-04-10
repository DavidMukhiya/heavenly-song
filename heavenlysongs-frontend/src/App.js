import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./components/Header";
import Songs from "./pages/Songs";
import Search from "./pages/Search";
import About from "./pages/About";
import More from "./pages/More";
import Home from "./pages/Home";
import Login from "./pages/Login";
import Footer from "./components/Footer";

const App = () => {
  return (
    <div className="container">
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="Songs" element={<Songs />} />
        <Route path="Search" element={<Search />} />
        <Route path="About" element={<About />} />
        <Route path="More" element={<More />} />
        <Route path="Login" element={<Login/>} />
      </Routes>
      <Footer/>
    </BrowserRouter>
    </div>
  );
};

export default App;
