import React from "react";
import { FaInstagram, FaFacebook, FaTwitter, FaLinkedin } from "react-icons/fa";

const SocialSiteIcon = () => {
  return (
    <div
      className="social-site-icon-style justify-content-center mt-3 mb-3 d-flex"
      style={{ width: "100%", justifyContent: "center" }}
    >
      <a
        href="https:/instagram.com"
        target="_blank"
        rel="noopener noreferrer"
      >
        <FaInstagram size="2rem" color="#2F3B69" />
      </a>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="https:/instagram.com" target="_blank" rel="noopener noreferrer">
        <FaFacebook size="2rem" color="#2F3B69" />
      </a>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="https:/instagram.com" target="_blank" rel="noopener noreferrer">
        <FaTwitter size="2rem" color="#2F3B69" />&nbsp;
      </a>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="https:/linkedin.com" target='_blank' rel="noopener noreferrer">
        <FaLinkedin size="2rem" color="#2F3B69" />&nbsp;
      </a>
    </div>
  );
};

export default SocialSiteIcon;
