<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Ice Cream Shop</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    header, nav, section, footer {
      padding: 20px;
    }

    header {
      background-color: #FFC300;
      text-align: center;
    }

    nav ul {
      list-style-type: none;
      padding: 0;
      margin: 0;
    }

    nav ul li {
      display: inline;
      margin-right: 10px;
    }

    nav ul li a {
      text-decoration: none;
      color: #333;
    }

    section#content {
      display: flex;
      flex-wrap: wrap;
      justify-content: space-around;
    }

    .flavor {
      width: 300px;
      padding: 10px;
      margin-bottom: 20px;
      text-align: center;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    footer {
      background-color: #333;
      color: #FFF;
      text-align: center;
      font-size: 12px;
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <header>
    <h1>Welcome to the Ice Cream Shop!</h1>
  </header>
  
  <nav>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Menu</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Contact</a></li>
    </ul>
  </nav>
  
  <section id="content">
    <h2>Discover Our Delicious Flavors</h2>
    <div class="flavor">
      <img src="https://example.com/flavor1.jpg" alt="Flavor 1">
      <h3>Strawberry</h3>
      <p>A classic flavor made with fresh strawberries.</p>
    </div>
    <div class="flavor">
      <img src="https://example.com/flavor2.jpg" alt="Flavor 2">
      <h3>Chocolate</h3>
      <p>Rich and creamy chocolate ice cream.</p>
    </div>
    <div class="flavor">
      <img src="https://example.com/flavor3.jpg" alt="Flavor 3">
      <h3>Vanilla</h3>
      <p>Smooth and velvety vanilla ice cream.</p>
    </div>
  </section>
  
  <footer>
    <p>&copy; 2023 Ice Cream Shop. All rights reserved.</p>
  </footer>
</body>
</html>
    