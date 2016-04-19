<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.ben.Priniciple.OCP.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开闭原则演示</title>
</head>
<body>

	<%
		PriceCutMenShoe menShoe = new PriceCutMenShoe("男鞋", "皮鞋", 300);
		out.println("男鞋价格为： "+menShoe.getValue());
		out.println("<br/>");
		PriceCutGirlShoe girlShoe = new PriceCutGirlShoe("女鞋","凉鞋",350);
		out.println("女鞋价格为： " + girlShoe.getValue());
	%>

</body>
</html>