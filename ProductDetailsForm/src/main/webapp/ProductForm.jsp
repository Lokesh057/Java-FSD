<!-- productForm.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Form</title>
</head>
<body>
    <form action="productForm" method="post">
        Product ID: <input type="text" name="productId"><br>
        Product Name: <input type="text" name="productName"><br>
        Price: <input type="text" name="price"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
