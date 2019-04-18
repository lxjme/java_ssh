<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" import="java.util.*,com.lxj.util.*"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>商品列表</title>
  </head>
  <body>
    <div class="container">
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                <th scope="col">#</th>
                <th scope="col">产品名称</th>
                <th scope="col">价格</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="products" var="p">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.p_name}</td>
                        <td>${p.price}</td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <br>
      
        <nav aria-label="...">
            <ul class="pagination justify-content-center">
                <li class="page-item">
                    <a class="page-link" href="?page=1">首页</a>
                </li>
                <%
                    PageUtil pageUtil = (PageUtil) request.getAttribute("pageUtil");
                    if(pageUtil.getCrt_page() == 1) {
                %>
                
                        <li class="page-item disabled">
                            <a class="page-link" href="#" tabindex="-1">上一页</a>
                        </li>
                <%
                    } else {
                %>

                        <li class="page-item">
                            <a class="page-link" href="?page=<%=pageUtil.getCrt_page()-1%>" tabindex="-1">上一页</a>
                        </li>
                <%
                    }
                %>
                

                <%
                    for(int i=1; i<=pageUtil.getTotal_page(); i++) {
                        if(pageUtil.getCrt_page() == i) {
                %>
                            <li class="page-item active">
                                <a class="page-link" href="#"><%=i%> <span class="sr-only">(current)</span></a>
                            </li>
                <%
                        } else {
                %>
                            <li class="page-item"><a class="page-link" href="?page=<%=i%>"><%=i%></a></li>
                <%     
                    }
                        }
                    
                    if(pageUtil.getCrt_page() == pageUtil.getTotal_page()) {
                %>
                        <li class="page-item disabled">
                            <a class="page-link" href="#">下一页</a>
                        </li>
                <%
                
                    } else {
                %>
                        <li class="page-item">
                            <a class="page-link" href="?page=<%=pageUtil.getCrt_page()+1%>">下一页</a>
                        </li>
                <%
                    }
                %>
                <li class="page-item">
                    <a class="page-link" href="?page=<%=pageUtil.getTotal_page()%>">尾页</a>
                </li>
                
            </ul>
        </nav>
    </div>

    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
