<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
                <li class="active"><a href="#">Ссылка</a></li>
                <li><a href="#">Ссылка</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Действие</a></li>
                        <li><a href="#">Другое действие</a></li>
                        <li><a href="#">Что-то еще</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Отдельная ссылка</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Еще одна отдельная ссылка</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search"/>
                </div>
            </form>
            <sec:authorize access="hasRole('ROLE_USER')">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Действие</a></li>
                        <li><a href="#">Другое действие</a></li>
                        <li><a href="#">Что-то еще</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Отдельная ссылка</a></li>
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
