<%@ page import="com.MediaModel.Media" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: kalyani.singh
  Date: 3/15/18
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Media House Management</h2>
</center>

<div align="center">

<form action="update?cmd=saveUpdate" method="post">
    <table border="1" cellpadding="5">
    <input type="hidden" name="id" value="${media.getId()}">
        <tr>
            <th>Title: </th>
        <td>
            <input type="text" name="title" value="${requestScope.media.getName()}">
        </td>
        </tr>
        <tr>
            <th>Category: </th>
        <td>
            <input type="text" name="category" value="${media.getCategory()}">
        </td>
        </tr>
        <tr>
            <th>Price: </th>
        <td>
            <input type="text" name="price" value="${media.getPrice()}">
        </td>
        </tr>
        <tr>
            <th>Quantity: </th>
        <td>
            <input type="text" name="quantity" value="${media.getQuantity()}">
        </td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>
</form>
    <h3>
        <a href="list">List All Products</a>
    </h3>
    <a href="index.jsp"> Back to index </a>
</div>
</body>
</html>
