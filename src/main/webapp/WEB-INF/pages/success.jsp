<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sf" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sf:head />
</head>
<body>
       <hr>
       Date picker Tags
       <br> From Date:
       <s:property value="fromDate" />
       <br> To Date:
       <s:property value="toDate" />
       <br>
       <hr>
       Auto completer Tags
       <s:property value="yourFavFw" />
       <br>
       <hr>
       <hr>
       Tabbed panel Tags
       <sf:tabbedpanel id="test">
              <sf:div id="one" theme="ajax" key="tab1">
First Tab
</sf:div>
              <sf:div id="two" theme="ajax" key="tab2">
Second Tab
</sf:div>
              <sf:div id="three" theme="ajax" key="tab3">
Third Tab
</sf:div>
       </sf:tabbedpanel>
</body>
</html>