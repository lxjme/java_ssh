<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
this is show.jsp

<hr>
产品的名称：${product.p_name}
<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>编号</td>
    <td>英雄</td>
</tr>
   
<c:forEach items="${product.ps}" var="p" varStatus="st"  >
    <tr>
        <td><c:out value="${st.count}" /></td>
        <td><c:out value="${p.p_name}" /></td>
    </tr>
</c:forEach>
</table>