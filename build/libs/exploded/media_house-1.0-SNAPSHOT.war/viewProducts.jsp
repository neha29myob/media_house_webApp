<%@ page import="com.MediaModel.Media" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
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

<%
    List<Media> mediaItems=(ArrayList<Media>) request.getAttribute("displayMediaList");
    for (Media mediaItem: mediaItems) {
%>
<table>
<tr>
    <td><%=mediaItem.getCode()%></td>
    <td><%=mediaItem.getName()%></td>
    <td><%=mediaItem.getQuantity()%></td>
    <td><%=mediaItem.getCategory()%></td>
    <td><%=mediaItem.getPrice()%></td>
</tr>
</table>
<%
    }
%>
</body>
</html>
