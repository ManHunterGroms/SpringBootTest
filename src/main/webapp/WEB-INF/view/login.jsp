<%--
  Created by IntelliJ IDEA.
  User: bymot
  Date: 23.12.2015
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Выход на сайт</title>
    <%@ include file="fragments/head.jsp" %>


</head>
<body class="vertical-align">
<div class="container">
    <div class="content">
        <div class="row">
            <form class="form-signin">
                <div class="well bs-component">
                    <h2 class="form-signin-heading">Введите ниже</h2>
                    <label for="inputEmail" class="sr-only">Email</label>
                    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required=""
                           autofocus="">
                    <label for="inputPassword" class="sr-only">Пароль</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">

                    <div class="checkbox">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"><span class="checkbox-material"><span
                                    class="check"></span></span> запомнить
                            </label>
                        </div>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">ВОЙТИ</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
