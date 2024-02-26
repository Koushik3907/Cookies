<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Koushik</title>
</head>
<body>
<%
String username= null,sessionid=null;

Cookie[] cookies =request.getCookies();
if(cookies!=null){
	for(Cookie cookie :cookies){
		if(cookie.getName().equals("username")){
			username=cookie.getValue();
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionid=cookie.getValue();
			
		}
	}
}
%>
Username:<%=username %><br>
SessionID:<%=sessionid %>

<form action="<%=request.getContextPath() %>/sucesscontroller" method="get" >
<input type="hidden" name="action" value="destroy">
<input type="submit" value="logout">

</form>
</body>
</html>