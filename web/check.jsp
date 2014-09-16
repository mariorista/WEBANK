<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%
String afm = request.getParameter("afm");
String password = request.getParameter("password");
String email = request.getParameter("email");

String connectionURL =
"jdbc:mysql://83.212.240.15:3306/it20818?user=it20818&password=changeit";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;
%>
<html>
<body>
<%
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL);
statement = connection.createStatement();
rs = statement.executeQuery("SELECT * FROM ACTOR WHERE PASSWORD='"+password+
        "' AND AFM='"+afm+"'");
if ( rs.next() ){
   session.setAttribute("name", rs.getString("NAME"));
   session.setAttribute("surname", rs.getString("SURNAME"));

   session.setAttribute("email", email );
   session.setAttribute("pass", password );
   session.setAttribute("afm", afm );

   String type = rs.getString("TYPE");
   if ( type.equals("c") ){
       rs.close();%>
       <jsp:forward page="client.jsp"/>
   <%}

}
rs.close();%>

<jsp:forward page="index.jsp"/>

</body></html>