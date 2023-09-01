<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    //セッションスコープからユーザー情報を取得
    User loginUser =(User)session.getAttribute("loginUser");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<% if(loginUser != null){ %>
<p>ログイン成功しました！</p>
<p>ようこそ<%= loginUser.getName() %>さん</p>
<a href="index.jsp">TOPへ</a>
<%} else { %>
<p>ログインに失敗しました。</p>
<%} %>
</body>
</html>