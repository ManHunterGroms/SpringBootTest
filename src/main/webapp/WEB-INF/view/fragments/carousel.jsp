<%--
  Created by IntelliJ IDEA.
  User: bymot
  Date: 23.12.2015
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="http://www.iconarchive.com/download/i77853/custom-icon-design/pretty-office-11/shop.ico"
           alt="..."/>

      <div class="carousel-caption">
        Описание
      </div>
    </div>

    <div class="item">
      <img src="http://www.iconarchive.com/download/i77853/custom-icon-design/pretty-office-11/shop.ico"
           alt="..."/>

      <div class="carousel-caption">
        Описание 2
      </div>
    </div>

    <div class="item">
      <img src="http://www.iconarchive.com/download/i77853/custom-icon-design/pretty-office-11/shop.ico"
           alt="..."/>

      <div class="carousel-caption">
        Описание 3
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div>
</body>
</html>