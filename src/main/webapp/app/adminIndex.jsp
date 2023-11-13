
<%@ page import = "com.cee.tech.utils.CookieUtils" %>
<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
                <html>

                <head>
                <jsp:include page="./css/AppCss.jsp">
                <jsp:param name="buttonColor" value="rgb(0, 53, 133)"/>
                </jsp:include>
                </head>
                <body>

 <%-- Accessing cookie set during user login --%>

<%
    Cookie userCookie = CookieUtils.getCookieByName(request, "username");
    String accessCookie = null;
    String firstLetter = null;

    if (userCookie != null) {
        accessCookie = userCookie.getValue();
        firstLetter = accessCookie.substring(0, 1).toUpperCase();
    } else {
        System.out.println("Cookie not found");
    }
%>

 <jsp:useBean id="adminNavbarBean" class="com.cee.tech.usebean.admin.AdminNavbarBean"/>
 <jsp:useBean id="sidebar" class="com.cee.tech.usebean.admin.SidebarBean"/>

 <%  adminNavbarBean.generateAdminMenu(firstLetter); %>
 <% sidebar.generateSidebar(); %>

          <div class="adminMainContainer">
                 <jsp:getProperty name="sidebar" property="sidebarMenu"/>

                         <div class="adminContent">
                            <jsp:getProperty name="adminNavbarBean" property="adminMenu" />
                         </div>
          </div>





    </body>
                </html>