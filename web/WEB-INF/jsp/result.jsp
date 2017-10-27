<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><table border="1">
            <tr><td>Eid</td><td>Ename</td><td>Street</td><td>Location</td> 
<%
 List<Map<String,Object>> list=(List)request.getAttribute("list");
            for(Map<String,Object> map:list)
            {%><tr><%
                Iterator<Map.Entry<String,Object>> i=map.entrySet().iterator();
                while(i.hasNext())
                {
                    Map.Entry<String,Object> e=i.next();
                    %> <td><%=e.getValue()%></td><%
                }
                %></tr><%
            }
            %></table>
    </body>
</html>
