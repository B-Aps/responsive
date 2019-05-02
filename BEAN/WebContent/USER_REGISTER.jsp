<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="user" class="entity.User">
<jsp:setProperty name="user" property="*"/>
</jsp:useBean>
</head>
<body>
<% if(user.insert())
{
	out.println("user registerd suxcess");

}
else{
	
	out.println("some error");
	
	
}

%>
</body>
</html>