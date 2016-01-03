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
            <form:form class="form-horizontal" modelAttribute="product" enctype="multipart/form-data" action="/admin/add_product" method="post">
                <div class="well bs-component">
                    <fieldset>
                        <div class="col-md-6">
                            <legend>Добавить новый товар</legend>


                            <div class="form-group is-empty">
                                <label for="category.id" class="col-md-2 control-label">Категория</label>

                                <div class="col-md-10">
                                    <form:select path="category.id" cssClass="form-control" id="category">
                                        <form:option value="0" label="Выберите категорию"/>
                                        <c:forEach items="${categories}" var="cat">
                                            <form:option value="${cat.id}" label="${cat.categoryName}"/>
                                        </c:forEach>
                                    </form:select>
                                    <form:errors path="category.id" cssClass="error"/>
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="name" class="col-md-2 control-label">Название товара</label>

                                <div class="col-md-10">
                                    <form:input type="text" path="name" class="form-control" id="name"
                                                placeholder="Название"/>
                                    <form:errors path="name" cssClass="error"/>
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="description" class="col-md-2 control-label">Описание</label>

                                <div class="col-md-10">
                                    <form:input type="text" path="description" class="form-control" id="description"
                                                placeholder="Описание товара"/>
                                    <form:errors path="description" cssClass="error"/>
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="price" class="col-md-2 control-label">Цена</label>

                                <div class="col-md-10">
                                    <form:input type="number" path="price" class="form-control"
                                                id="price"
                                                placeholder="Стоимость товара"/>
                                    <form:errors path="price" cssClass="error"/>
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="price" class="col-md-2 control-label">Фото</label>

                                <div class="col-md-10">
                                    <input type="file" name="image_files[]" multiple="multiple" >
                                    <input type="text" readonly="" class="form-control" placeholder="Открыть...">
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group">
                                <div class="col-md-10 col-md-offset-2">
                                    <a href="/admin" class="btn btn-default">Отмена</a>
                                    <button type="submit" class="btn btn-primary">Отправить</button>
                                </div>
                            </div>
                        </div>

                    </fieldset>
                </div>
            </form:form>
        </div>
    </div>

    <jsp:include page="../fragments/footer.jsp"/>
</div>
</body>
</html>
