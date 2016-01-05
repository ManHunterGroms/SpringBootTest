<%--
  Created by IntelliJ IDEA.
  User: bymot
  Date: 23.12.2015
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        <div class="col-md-4">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">Другие товары</h3>
                </div>
                <div class="panel-body">

                </div>
            </div>
        </div>

        <div class="col-md-8">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-md-12 text-right">
                            <a href="/add_kart" class="btn btn-raised btn-warning">Добавить в корзину</a>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12 text-center">>
                            <c:if test="${fn:length(product.images) < 1}">
                                <img src="/image/product/empty_image.jpg" alt="..."
                                     style="max-width: 150px; max-height: 150px"/>
                            </c:if>
                            <c:forEach items="${product.images}" var="image">
                                <img src="/image/product/${image.imageUrl}" alt="..."
                                     style="max-width: 150px; max-height: 150px"/>
                            </c:forEach>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-10">
                            <h3>${product.name}</h3>

                            <p>${product.description}</p>

                            <div class="col-md-5">
                                <a href="#" class="btn btn-default" role="button"><fmt:formatDate
                                        pattern="dd.MM.yyyy HH:mm" value="${product.date}"/></a>
                            </div>

                            <div class="col-md-7 text-right">
                                <h3>
                                    <span class="label label-danger">
                                        <fmt:formatNumber pattern="###,###,###" value="${product.price}"
                                                          var="price"></fmt:formatNumber>
                                        ${fn:replace(price, ",", " ")}
                                    </span>
                                </h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="text-center">
            <div id="selector"></div>
            <script>
                $(selector).twbsPagination({
                    totalPages: ${totalPage},
                    startPage: ${page},
                    visiblePages: 5,
                    href: '?page={{pageNumber}}',
                    hrefVariable: '{{pageNumber}}',
                    onPageClick: function (event, page) {
                    }
                });
            </script>
        </div>
    </div>
    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>
</html>
