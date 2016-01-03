<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">SHOP</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Главная</a></li>
                <li><a href="/category">Категории</a></li>
                <li><a href="/product">Товары</a></li>
                <li><a href="/delivery">Доставка</a></li>
                <li><a href="/pay">Оплата</a></li>
                <li><a href="/about">О магазине</a></li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Поиск"/>
                </div>
            </form>
            <sec:authorize access="hasRole('ROLE_USER')">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Профиль <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Мой профиль</a></li>
                        <li><a href="#">Мои покупки</a></li>
                        <li><a href="#">Настройки</a></li>
                        <li class="divider"></li>

                        <form method="post" action="${pageContext.request.contextPath}/logout" id="form-logout">
                            <li><input type="submit" value="Выход" /></li>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>
                    </ul>
                </li>
            </ul>
            </sec:authorize>

            <sec:authorize access="isAnonymous()">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/login">Войти</a></li>
                <li><a href="/registration">Регистрация</a></li>
            </ul>
            </sec:authorize>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
</body>
</html>
