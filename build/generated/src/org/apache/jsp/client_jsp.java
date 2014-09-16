package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");

if ( session.isNew() == true ){
    
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }

}

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\" lang=\"en-US\" xml:lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\n");
      out.write("    <title>DIT BANK</title>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"script.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function formAValidator(){\n");
      out.write("            // Make quick references to our fields\n");
      out.write("            var acc = document.getElementById('acc');\n");
      out.write("\n");
      out.write("            // Check each input in the order that it appears in the form!\n");
      out.write("            if(notEmpty(acc, \"Miss account task!\")){\n");
      out.write("                    if(isNumeric(acc, \"Please enter a valid accountID(NO LETTERS)\")){\n");
      out.write("                                   return true;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        function formBValidator(){\n");
      out.write("            // Make quick references to our fields\n");
      out.write("            var from = document.getElementById('from');\n");
      out.write("            var to = document.getElementById('to');\n");
      out.write("            var how = document.getElementById('how');\n");
      out.write("\n");
      out.write("            // Check each input in the order that it appears in the form!\n");
      out.write("            if(notEmpty(from, \"Miss AccountFrom task!\")){\n");
      out.write("                if(isNumeric(from, \"Please enter a valid AccountFrom(NO LETTERS)\")){\n");
      out.write("                    if(notEmpty(to, \"Miss AccountTo task!\")){\n");
      out.write("                        if(isNumeric(to, \"Please enter a valid AccountTo(NO LETTERS)\")){\n");
      out.write("                            if(notEmpty(how, \"Miss balance task!\")){\n");
      out.write("                                if(isNumeric(how, \"Please enter a valid balance(NO LETTERS)\")){\n");
      out.write("                                    return true;\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        function notEmpty(elem, helperMsg){\n");
      out.write("            if(elem.value.length == 0){\n");
      out.write("                    alert(helperMsg);\n");
      out.write("                    elem.focus(); // set the focus to this input\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        function isNumeric(elem, helperMsg){\n");
      out.write("            var numericExpression = /^[0-9]+$/;\n");
      out.write("            if(elem.value.match(numericExpression)){\n");
      out.write("                    return true;\n");
      out.write("            }else{\n");
      out.write("                    alert(helperMsg);\n");
      out.write("                    elem.focus();\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("\t}\n");
      out.write("        function lengthRestriction(elem, equal){\n");
      out.write("            var uInput = elem.value;\n");
      out.write("            if(uInput.length == equal){\n");
      out.write("                    return true;\n");
      out.write("            }else{\n");
      out.write("                    alert(\"Please enter 9 characters\");\n");
      out.write("                    elem.focus();\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"art-page-background-simple-gradient\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"art-main\">\n");
      out.write("        <div class=\"art-Sheet\">\n");
      out.write("            <div class=\"art-Sheet-tl\"></div>\n");
      out.write("            <div class=\"art-Sheet-tr\"></div>\n");
      out.write("            <div class=\"art-Sheet-bl\"></div>\n");
      out.write("            <div class=\"art-Sheet-br\"></div>\n");
      out.write("            <div class=\"art-Sheet-tc\"></div>\n");
      out.write("            <div class=\"art-Sheet-bc\"></div>\n");
      out.write("            <div class=\"art-Sheet-cl\"></div>\n");
      out.write("            <div class=\"art-Sheet-cr\"></div>\n");
      out.write("            <div class=\"art-Sheet-cc\"></div>\n");
      out.write("            <div class=\"art-Sheet-body\">\n");
      out.write("                <div class=\"art-Header\">\n");
      out.write("                    <div class=\"art-Header-jpeg\"></div>\n");
      out.write("                    <div class=\"art-Logo\">\n");
      out.write("                        <h1 id=\"name-text\" class=\"art-Logo-name\"><a href=\"index.jsp\">DIT Bank</a></h1>\n");
      out.write("                        <div id=\"slogan-text\" class=\"art-Logo-text\">we care about your money</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"art-nav\">\n");
      out.write("                \t<div class=\"l\"></div>\n");
      out.write("                \t<div class=\"r\"></div>\n");
      out.write("                        <ul class=\"art-menu\">\n");
      out.write("                                <li>\n");
      out.write("                \t\t\t<a href=\"index.jsp\" target=\"blank\" class=\" active\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">Home</span></a>\n");
      out.write("                \t\t</li>\n");
      out.write("                \t\t<li>\n");
      out.write("                \t\t\t<a href=\"contact.jsp\" target=\"blank\" class=\" active\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">Contact Us</span></a>\n");
      out.write("                \t\t</li>\n");
      out.write("                                <li>\n");
      out.write("                \t\t\t<a href=\"about.jsp\" target=\"blank\" class=\" active\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">About Us</span></a>\n");
      out.write("                \t\t</li>\n");
      out.write("                                <li>\n");
      out.write("                \t\t\t<a href=\"logout.jsp\" class=\" active\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">LogOut</span></a>\n");
      out.write("                \t\t</li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"art-contentLayout\">\n");
      out.write("                    <div class=\"art-content\">\n");
      out.write("                        <div class=\"art-Post\">\n");
      out.write("                            <div class=\"art-Post-body\">\n");
      out.write("                        <div class=\"art-Post-inner\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \t\t<div class=\"cleared\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                                 <h2 class=\"art-postheader\">\n");
      out.write("                                     Γεια σου ");
      out.print(session.getAttribute("surname").toString().toUpperCase() );
      out.write(' ');
      out.print(session.getAttribute("name").toString().toUpperCase());
      out.write("\n");
      out.write("                                            </h2>\n");
      out.write("                                \n");
      out.write("                                  <hr />\n");
      out.write("                                  <form  METHOD=POST ACTION=\"checkInfo.jsp\" class=\"oti-na-nai\" onsubmit=\"return formAValidator()\">\n");
      out.write("                                                <table border=\"0\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                          <h4>Πληροφορίες Λογαριασμού</h4>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                  <tbody>\n");
      out.write("                                                      <tr>\n");
      out.write("                                                          <td>Κωδικός Λογαριασμού:</td>\n");
      out.write("                                                          <td><input id=\"acc\" type=\"text\" name=\"account\" /></td>\n");
      out.write("                                                      </tr>\n");
      out.write("\n");
      out.write("                                                      <tr>\n");
      out.write("                                                          <td></td>\n");
      out.write("                                                          <td><input type=\"submit\" value=\"Check Info\" /></td>\n");
      out.write("                                                      </tr>\n");
      out.write("                                                  </tbody>\n");
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                            </form>\n");
      out.write("                                                <hr />\n");
      out.write("\n");
      out.write("                                                <form  METHOD=POST ACTION=\"transfer.jsp\" class=\"oti-na-nai\"onsubmit=\"return formBValidator()\">\n");
      out.write("                                                    <table border=\"0\" >\n");
      out.write("                                                        <thead>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <h4>Μεταφορά χρημάτων</h4>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tfoot>\n");
      out.write("                                                            <p style=\"color: red\">\n");
      out.write("                                                                Πρέπει να γνωρίζετε το υπόλοιπο των λογαριασμών σας\n");
      out.write("                                                                ( Χρησιμοποιήστε την παραπάνω επιλογή ).\n");
      out.write("                                                            </p>\n");
      out.write("                                                        </tfoot>\n");
      out.write("                                                        <tbody>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    Κωδικός Λογαριασμού(Από):\n");
      out.write("                                                                </td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    <input id=\"from\" type=\"text\" name=\"accF\" value=\"\" />\n");
      out.write("                                                                </td>\n");
      out.write("\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    Κωδικός Λογαριασμού(Προς):\n");
      out.write("                                                                </td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    <input id=\"to\" type=\"text\" name=\"accto\" value=\"\" />\n");
      out.write("                                                                </td>\n");
      out.write("\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    Ποσόν:\n");
      out.write("                                                                </td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    <input id=\"how\" type=\"text\" name=\"amount\" value=\"\" />\n");
      out.write("                                                                </td>\n");
      out.write("\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td></td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                    <input type=\"submit\" value=\"Transfer Money\" />\n");
      out.write("                                                                </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                    \n");
      out.write("                                                        </tbody>\n");
      out.write("                                                        \n");
      out.write("                                                    </table>\n");
      out.write("                                                </form>\n");
      out.write("                                        \n");
      out.write("                                \n");
      out.write("                                        <div class=\"cleared\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \t\t<div class=\"cleared\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleared\"></div><div class=\"art-Footer\">\n");
      out.write("                    <div class=\"art-Footer-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"art-Footer-background\"></div>\n");
      out.write("                </div>\n");
      out.write("        \t\t<div class=\"cleared\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cleared\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
