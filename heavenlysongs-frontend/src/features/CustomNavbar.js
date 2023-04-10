import React, { useState } from "react";
import {
  Navbar,
  NavbarBrand,
  Nav,
  NavItem,
  NavLink,
  NavbarToggler,
  Collapse,
} from "reactstrap";
import { NavLink as ReactLink } from "react-router-dom";
import { IoIosHome } from "react-icons/io";

const CustomNavbar = () => {
  const [isOpen, setIsOpen] = useState(false);

  const toggle = () => setIsOpen(!isOpen);

  return (
    <Navbar
      expand="md"
      light
      style={{ backgroundColor: "#fff", color: "#2F3B69", fontFamily: "Klima" }}
    >
      <NavbarBrand
        tag={ReactLink}
        to="/"
        style={{ display: "flex", alignItems: "center" }}
      >
        <IoIosHome
          style={{ fontSize: "50px", marginRight: "10px" }}
          color="#2F3B69"
        />
      </NavbarBrand>
      <NavbarToggler onClick={toggle} />
      <Collapse isOpen={isOpen} navbar>
        <Nav
          className="ml-auto"
          navbar
          style={{
            width: "100%",
            justifyContent: "space-between",
            color: "#2F3B69",
          }}
        >
          <NavItem>
            <NavLink
              tag={ReactLink}
              to="/songs"
              style={{ fontWeight: "bold", color: "#2F3B69" }}
            >
              Songs
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink
              tag={ReactLink}
              to="/search"
              style={{ fontWeight: "bold", color: "#2F3B69" }}
            >
              Search
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink
              tag={ReactLink}
              to="/about"
              style={{ fontWeight: "bold", color: "#2F3B69" }}
            >
              About
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink
              tag={ReactLink}
              to="/more"
              style={{ fontWeight: "bold", color: "#2F3B69" }}
            >
              More
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink
              tag={ReactLink}
              to="/login"
              style={{ fontWeight: "bold", color: "#2F3B69" }}
            >
              Login/Sign Up
            </NavLink>
          </NavItem>
        </Nav>
      </Collapse>
    </Navbar>
  );
};

export default CustomNavbar;
