/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-20 09:57:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Light Knight Store</title>\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("      <script type=\"text/javascript\" script-name=\"arbutus\" src=\"http://use.edgefonts.net/arbutus.js\"></script>\r\n");
      out.write("   </head>\r\n");
      out.write("   <style>\r\n");
      out.write("      body {\r\n");
      out.write("      background-image: url(\"/images/knight.jpg\");\r\n");
      out.write("      background-repeat: no-repeat;\r\n");
      out.write("      background-size: 40%;\r\n");
      out.write("      background-attachment: fixed;\r\n");
      out.write("      background-position: left bottom;\r\n");
      out.write("      }\r\n");
      out.write("      h1 {\r\n");
      out.write("      font: normal 51px/1 \"arbutus\", Helvetica, sans-serif;\r\n");
      out.write("      text-shadow: 4px 0 9px rgba(86,170,255,0.9) ;\r\n");
      out.write("      }\r\n");
      out.write("      p {\r\n");
      out.write("      font-size: 130%;\r\n");
      out.write("      }\r\n");
      out.write("   </style>\r\n");
      out.write("   <body>\r\n");
      out.write("      <center>\r\n");
      out.write("         <h1>LIGHT KNIGHT STORE</h1>\r\n");
      out.write("         <a href=\"/view/registration.jsp\"><button class=\"button\">Sign Up!</button></a>\r\n");
      out.write("         <a href=\"/view/order.jsp\"><button class=\"button\">View Product List!</button></a>\r\n");
      out.write("         <a href=\"/view/login.jsp\"><button class=\"button\">Sign In!</button></a>\r\n");
      out.write("         <br/><br/><br/>\r\n");
      out.write("         <h2>ABOUT US</h2>\r\n");
      out.write("         <p>Looking for quality and cheap Ammunition?</br>\r\n");
      out.write("            Buy online at LIGHT KNIGHT STORE.</br>\r\n");
      out.write("            Calculate your ideal variant of knight ammunition.</p>\r\n");
      out.write("      </center>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
