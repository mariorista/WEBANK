
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

        <%-- start web service invocation --%>
    <% String result = null;
       String account = null;
    try {
	wrr.AlfaService service = new wrr.AlfaService();
	wrr.Alfa port = service.getAlfaPort();
	 // TODO initialize WS operation arguments here
	java.lang.String password = (String)session.getAttribute("pass");
	java.lang.String username = (String)session.getAttribute("afm");
	account = request.getParameter("account");
	java.lang.String mail = (String)session.getAttribute("email");;
	// TODO process result here
	result = port.info(password, username, account, mail);
        out.print( password+", "+username+", "+ account+", "+mail+","+ result);

    }catch (Exception ex) {
	out.print("It Can't run webService because: "+ex.getLocalizedMessage());
    }
    %>
    <%-- end web service invocation --%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Balance</title>
    </head>
    <body>
        <%
        if ( result == null ){
            %><jsp:include page="error.jsp"/><%
        }
        %>
        <p>Το υπόλοιπο του λογαριασμού με κωδικό <%=account%> είναι <%=result%>. <a href="client.jsp">Back</a></p>
    </body>
</html>
