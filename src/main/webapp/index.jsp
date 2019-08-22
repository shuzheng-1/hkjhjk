<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>


</head>
<body>
<a href="SelectServlet">查询</a><br>
<c:forEach items="${list}" var="user">
    ${user.uid}<br>
    ${user.uname}<br>
    ${user.upassword}<br>
</c:forEach>

</form>
</body>
</html>