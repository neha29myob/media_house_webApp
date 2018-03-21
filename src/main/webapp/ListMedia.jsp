<%--
  Created by IntelliJ IDEA.
  User: kalyani.singh
  Date: 3/19/18
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>MediaList</title>
</head>
<body>
<center>
    <h2>Media House Management</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="media" items="${requestScope.displayMediaList}">
            <tr>
                <td><c:out value="${media.getCode()}" /></td>
                <td><c:out value="${media.getName()}" /></td>
                <td><c:out value="${media.getCategory()}" /></td>
                <td><c:out value="${media.getPrice()}" /></td>
                <td><c:out value="${media.getQuantity()}" /></td>
                <td>
                    <a href="/edit?id=<c:out value='${media.getCode()}' />">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/delete?id=<c:out value='${media.getCode()}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h3>
        <a href="CreateMedia.jsp">Add New Media Product</a>
    </h3> <br>
    <a href="index.jsp"> Back to index </a>
</div>
</body>
</html>
