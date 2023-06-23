import React from 'react'
import "./Header.css"

const MenuItem = ({ actions, children, to }) => (
    <div className='menu-item'>{children}</div>
)

const Header = () => {
  return (
    <div>
        <div className="logo">Baner</div>
        <div className="menu">
            <MenuItem>홈</MenuItem>
            <MenuItem>소개</MenuItem>
            <MenuItem>포스트</MenuItem>
        </div>
    </div>
  )
}

export default Header;