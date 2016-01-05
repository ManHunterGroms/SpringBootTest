<%--
  Created by IntelliJ IDEA.
  User: bymot
  Date: 23.12.2015
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <%@ include file="../fragments/head.jsp" %>
</head>
<body>

<div class="container">
    <jsp:include page="../fragments/carousel.jsp"/>
    <jsp:include page="../fragments/navbar.jsp"/>
    <div class="row">
        <div class="col-md-12">
            <div class="well bs-component">
                <c:if test="${fn:length(categories) < 1}">
                    <div class="alert alert-dismissible alert-warning">
                        <button type="button" class="close" data-dismiss="alert">×</button>
                        <h4>Сообщение</h4>

                        <p>Не было найдено ни одной категории.</p>
                    </div>
                </c:if>

                <table class="table table-striped table-hover ">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Название</th>
                        <th>Действия</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${categories}" var="category">
                        <tr>
                            <td>${category.id}</td>
                            <td>${category.categoryName}</td>
                            <td>
                                <a href="/admin/category?edit=${category.id}" class="btn btn-raised btn-warning">
                                    Редактировать
                                </a>
                                <a href="/admin/category?delete=${category.id}" class="btn btn-raised btn-danger">
                                    Удалить
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <jsp:include page="../fragments/footer.jsp"/>
</div>
</body>
</html>
