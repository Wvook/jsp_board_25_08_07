<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 나중에 다시 설정 -> 에디터 -> 파일 타입 -> HTMl에서 *.jsp, *.jspf 지워줘. -->
<%
    int dan = Integer.parseInt(request.getParameter("dan"));
    int limit = Integer.parseInt(request.getParameter("limit"));
%>

<h1><%=dan%>단</h1>

<% for(int i = 1; i <= limit; i++){ %>
    <div><%=dan%> * <%=i%> = <%=dan * i%></div>
<%  } %>

