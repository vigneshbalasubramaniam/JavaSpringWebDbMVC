<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="post" action="viewemployee.htm">
        <table>
            <tr>
                <td><form:label path="eid">eid</form:label></td>
                <td><form:input type="text" path="eid"/></td>
            </tr>   
             <tr>
                 <td><form:label path="ename">ename</form:label></td>
                <td><form:input type="text" path="ename"/></td>
            </tr>   
            <tr>
                <td><form:label path="street">street</form:label></td>
                <td><form:input type="text" path="street"/></td>
            </tr>   
             <tr>
                 <td><form:label path="location">location</form:label></td>
                <td><form:input type="text" path="location"/></td>
            </tr>   
            <tr colspan="2">
                <td><input type="submit" value="submit"/></td>
            </tr>
        </table>
    </form:form>

    </body>
</html>
