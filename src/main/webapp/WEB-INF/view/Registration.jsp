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
    <%@ include file="fragments/head.jsp" %>
</head>
<body>

<div class="container">
    <jsp:include page="fragments/carousel.jsp"/>
    <jsp:include page="fragments/navbar.jsp"/>

    <div class="row">
        <div class="col-md-12">
            <form:form  class="form-horizontal" modelAttribute="customer" action="/registration" method="post">
                <div class="well bs-component">
                    <fieldset>
                        <div class="col-md-6">
                            <legend>Регистрация</legend>


                            <div class="form-group is-empty">
                                <label for="firstName" class="col-md-2 control-label">Имя</label>

                                <div class="col-md-10">
                                    <form:input type="text" path="firstName" class="form-control" id="firstName" placeholder="Имя" />
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="lastName" class="col-md-2 control-label">Фамилия</label>

                                <div class="col-md-10">
                                    <form:input type="text" path="lastName" class="form-control" id="lastName"
                                           placeholder="Фамилия" />
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="user.email" class="col-md-2 control-label">Email</label>

                                <div class="col-md-10">
                                    <form:input type="email" path="user.email" class="form-control" id="user.email" placeholder="Email" />
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="user.password" class="col-md-2 control-label">Пароль</label>

                                <div class="col-md-10">
                                    <form:input type="password" path="user.password" class="form-control" id="user.password"
                                           placeholder="Password" />
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="repeate_password" class="col-md-2 control-label">Повторите пароль</label>

                                <div class="col-md-10">
                                    <input type="password" class="form-control" id="repeate_password"
                                           placeholder="Повторите пароль">
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group is-empty">
                                <label for="phoneNumber" class="col-md-2 control-label">Телефон</label>

                                <div class="col-md-10">
                                    <form:input type="tel" path="phoneNumber" class="form-control" id="phoneNumber"
                                           placeholder="Телефон" />
                                </div>
                                <span class="material-input"></span>
                            </div>

                            <div class="form-group">
                                <div class="col-md-10 col-md-offset-2">
                                    <button type="button" class="btn btn-default">Отмена</button>
                                    <button type="submit" class="btn btn-primary">Отправить</button>
                                </div>
                            </div>
                        </div>

                    </fieldset>
                </div>
            </form:form>
        </div>
    </div>

    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>
</html>
