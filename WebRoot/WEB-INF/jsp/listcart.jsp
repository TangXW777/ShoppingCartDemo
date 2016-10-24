<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lsitcart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function deleteBookItem(id){
			var flag = window.confirm("确定要删除吗？");
			if(flag){
				window.location.href = "${pageContext.request.contextPath}/servlet/DeleteBookItemServlet?id=" + id;
			}
		}
		
		function changeQuantity(id, input, oldQuantity){
			var quantity = input.value;
			if((quantity < 0) || (quantity != parseInt(quantity))){
				alert("请输入正整数");
				input.value = oldQuantity;
				return;
			}
			var flag = window.confirm("确定要将数量修改为：" + quantity);
			if(flag){
				window.location.href = "${pageContext.request.contextPath}/servlet/ChangeQuantityServlet?id=" + id + "&quantity=" + quantity;
			}
			
		}
		
		function clearCart(){
			var flag = window.confirm("确定要清空购物车?");
			if(flag){
				window.location.href = "${pageContext.request.contextPath}/servlet/ClearCartServlet";
			}
		}
	</script>
  </head>
  
  <body>
  <h2>清单列表</h2>
  <c:choose>
  	<c:when test="${empty cart.cart}">
  		<h2>你的购物车是空的，赶紧去<a href="${pageContext.request.contextPath }/servlet/ListBookServlet">购物</a>吧</h2>
  	</c:when>
  	<c:otherwise>
	 <table border="1">
	 	<tr>
	 		<td>编号</td>
	 		<td>书名</td>
	 		<td>单价</td>
	 		<td>数量</td>
	 		<td>小计</td>
	 		<td>操作</td>
	 	</tr>
	 	<c:forEach items="${sessionScope.cart.cart}" var="me">
	 		<tr>
	  		<td>${me.key }</td>
	  		<td>${me.value.book.name }</td>
	  		<td>${me.value.book.price }</td>
	  		<td><input type="text" value="${me.value.quantity }" name="quantity" onchange="changeQuantity(${me.key }, this, ${me.value.quantity })"/></td>
	  		<td>${me.value.price }</td>
	  		<td><a href="javascript:deleteBookItem(${me.key })">删除</a></td>
	 		</tr>
	 	</c:forEach>
	 	<tr>
	 		<td colspan="3">总价</td>
	 		<td>${sessionScope.cart.price }</td>
	 		<td><a href="javascript:clearCart()">清空购物车</a></td>
	 		<td>去结算</td>
	 	</tr>
	 </table>
	 <h2><a href="${pageContext.request.contextPath }/servlet/ListBookServlet">返回继续购物</a></h2>
	</c:otherwise>
  </c:choose>
  </body>
</html>
