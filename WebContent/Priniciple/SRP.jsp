<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ben.Priniciple.SRP.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>单一原则</title>
</head>
<body>
	<%
		ProductEntity entity = new ProductEntity();
		out.println("实体查询：  " + entity.selectAll("实体产品。。。") + "<br>");
		out.println("产品名称： " + entity.getName("苹果") + "<br>");
		out.println("产地：" + entity.getLocality("美国") + "<br>");
		
		ProductService service = new ProductService();
		out.println("服务查询：  "  + service.selectAll("服务。。。") + "<br>");
	%>
</body>
</html>