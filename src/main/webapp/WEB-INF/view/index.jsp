<%--
  Created by IntelliJ IDEA.
  User: bymot
  Date: 23.12.2015
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Главная страница</title>

    <%@ include file="fragments/head.jsp" %>
</head>
<body>
<div class="container">
    <jsp:include page="fragments/carousel.jsp"/>
    <jsp:include page="fragments/navbar.jsp"/>
    <div class="row">
        <c:forEach items="${products}" var="product">
            <div class="col-sm-6 col-md-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <c:forEach items="${product.images}" var="image" begin="0" end="1">
                            <img src="/image/product/${image.imageUrl}" alt="..." style="width: 320px;"/>
                        </c:forEach>
                        <div class="caption">
                            <h3>${product.name}</h3>

                            <p>${product.description}</p>

                            <p>
                                <a href="#" class="btn btn-primary" role="button">${product.price}</a>
                                <a href="#" class="btn btn-default" role="button">${product.date}</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>
</html>
