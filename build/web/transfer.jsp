
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">



    <%-- start web service invocation --%>
    <%
    String result=null;
    try {
	betaservice.BetaService service = new betaservice.BetaService();
	betaservice.Beta port = service.getBetaPort();
	 // TODO initialize WS operation arguments here
	java.lang.String pass = (String)session.getAttribute("pass");
	java.lang.String usr = (String)session.getAttribute("afm");
	java.lang.String accFrom = request.getParameter("accF");
	java.lang.String accTo = request.getParameter("accto");
	double amount = Double.parseDouble( request.getParameter("amount"));
out.print( pass+", "+accFrom+", "+ accTo+", "+amount+","+ result);
	result = port.transfer(pass, usr, accFrom, accTo, amount);
    } catch (Exception ex) {
	out.print(ex.getLocalizedMessage());
    }
    %>
    <%-- end web service invocation --%>







<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transfer money</title>
    </head>
    <body>
        <%
        if ( result == null ){
            %><jsp:forward page="error.jsp"/><%
        }
        %>
        <p style="color: blue"><%=result%></p>
    </body>
</html>
