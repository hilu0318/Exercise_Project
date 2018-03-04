<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<%@ include file="/WEB-INF/views/import/css.jspf" %>
	<style type="text/css">
	.error {
	color: red;
	}
	</style>
</head>
<body>
<h1 class="<c:if test="${ !empty errors.id }">error</c:if>">
	Hello world!  
</h1>
<a href="/step01/dbcon" class="btn btn-primary">Default Project</a>
<P>  The time on the server is ${serverTime}. </P>
<%@ include file="/WEB-INF/views/import/js.jspf" %>
</body>
</html>
