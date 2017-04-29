<%-- 
    Document   : welcome
    Created on : Apr 29, 2017, 2:49:00 PM
    Author     : jan_s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Complaints Web Service</h1>
        <a href="http://localhost:8084/complaints-ws/soap/ComplaintsWebService.wsdl">Complaints Wsdl</a>
        <h3>Complaints REST URI Path http://localhost:8084/complaints-ws/rest/complaints/{ComplaintId}</h3>
        <%
        String site = new String("http://localhost:8084/complaints-ws/soap/ComplaintsWebService.wsdl");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
   %>

        
    </body>
</html>
