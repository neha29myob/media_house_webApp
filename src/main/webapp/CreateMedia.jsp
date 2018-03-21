<%--
  Created by IntelliJ IDEA.
  User: kalyani.singh
  Date: 3/19/18
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>Media House Management</h2>
</center>

<div align="center">
    <%--<c:if test="${media != null}">--%>
    <%--<form action="update" method="post">--%>
        <%--</c:if>--%>
        <%--<c:if test="${media == null}">--%>
        <form action="create" method="post">
            <%--</c:if>--%>
            <table border="1" cellpadding="5">
                <%--<caption>--%>
                    <%--<h2>--%>
                        <%--<c:if test="${media != null}">--%>
                            <%--Edit Media--%>
                        <%--</c:if>--%>
                        <%--<c:if test="${media == null}">--%>
                            <%--Add New Media--%>
                        <%--</c:if>--%>
                    <%--</h2>--%>
                <%--</caption>--%>
                <%--<c:if test="${media != null}">--%>
                    <input type="hidden" name="id"/>
                <%--</c:if>--%>
                <tr>
                    <th>Title: </th>
                    <td>
                        <input type="text" name="title" size="40"/>
                    </td>
                </tr>
                <tr>
                    <th>Category: </th>
                    <td>
                        <input type="text" name="category" size="40"
                                />
                    </td>
                </tr>
                <tr>
                    <th>Price: </th>
                    <td>
                        <input type="text" name="price" size="10"
                                />
                    </td>
                </tr>
                <tr>
                    <th>Quantity: </th>
                    <td>
                        <input type="text" name="quantity" size="10"
                              />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
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
