<%@ page contentType="text/html; charset=EUC_KR"%>

<%
	session.invalidate();

	response.sendRedirect("login.jsp");
%>