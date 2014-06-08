<%@page import="com.cedarsoftware.util.io.JsonObject"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<s:head/>
</head>
<body>
	<h2>Hello World!</h2>
	
	
	<s:form>
		<s:textfield label="what is your name?" name="name"/>
		<s:textfield label="what is your name?" name="dateNow"/>
		<s:submit/>
	</s:form>
	
	<c:forEach var="x" begin="0" end="3" step="1">
		<h1> hello</h1>
	</c:forEach>
	
	
	
	<%  JsonObject json = new JsonObject();
	
	
	%>
	
	
</body>
</html>
