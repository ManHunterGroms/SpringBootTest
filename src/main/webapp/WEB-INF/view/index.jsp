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
        <div class="col-sm-6 col-md-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="http://i.playground.ru/i/37/46/41/00/blog/content/yzfdllr0.jpg" alt="..." style="width: 320px;"/>

                    <div class="caption">
                        <h3>Ярлык эскиза</h3>

                        <p>...</p>

                        <p>
                            <a href="#" class="btn btn-primary" role="button">Кнопка</a>
                            <a href="#" class="btn btn-default" role="button">Кнопка</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-sm-6 col-md-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="https://upload.wikimedia.org/wikipedia/en/thumb/6/6c/AMD_Radeon_graphics_logo_2014.svg/1213px-AMD_Radeon_graphics_logo_2014.svg.png" alt="..." style="width: 320px;"/>

                    <div class="caption">
                        <h3>Ярлык эскиза</h3>

                        <p>...</p>

                        <p>
                            <a href="#" class="btn btn-primary" role="button">Кнопка</a>
                            <a href="#" class="btn btn-default" role="button">Кнопка</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-sm-6 col-md-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    <img src="https://upload.wikimedia.org/wikipedia/en/thumb/6/6c/AMD_Radeon_graphics_logo_2014.svg/1213px-AMD_Radeon_graphics_logo_2014.svg.png" alt="..." style="width: 320px;"/>

                    <div class="caption">
                        <h3>Ярлык эскиза</h3>

                        <p>...</p>

                        <p>
                            <a href="#" class="btn btn-primary" role="button">Кнопка</a>
                            <a href="#" class="btn btn-default" role="button">Кнопка</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>
</html>
