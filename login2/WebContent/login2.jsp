<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ログイン画面(再)</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="nameJ"/>
		<s:password name="passwordJ"/>
		<s:submit value="ログイン再"/>
	</s:form>
</body>
</html>