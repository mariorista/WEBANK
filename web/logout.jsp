
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%if (session.isNew()==true)
            response.sendRedirect(response.encodeRedirectURL("index.jsp"));%>

        <%session.invalidate();%>
        <h4> You were being Logged out </h4>
        <a href = "index.jsp"> Home </a><br>
    </body>
</html>
