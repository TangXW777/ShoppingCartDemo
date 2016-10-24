<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>书库展示</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h2>图书展示</h2>
   <table border="1">
   	<tr>
   		<td>编号</td>
   		<td>书名</td>
   		<td>作者</td>
   		<td>价格</td>
   		<td>描述</td>
   		<td>操作</td>
   	</tr>
   	<c:forEach items="${requestScope.books}" var="book">
   		<tr>
   			<td>${book.id }</td>
   			<td>${book.name }</td>
   			<td>${book.author }</td>
   			<td>${book.price }</td>
   			<td>${book.price }</td>
   			<td>${book.description }</td>
   			<td><a href="${pageContext.request.contextPath }/servlet/BuyServlet?id=${book.id}">加入购物车</a></td>
   		</tr>
   	</c:forEach>
   </table>
  </body>
</html>
