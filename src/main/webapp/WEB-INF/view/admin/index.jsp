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
        <div class="well bs-component">
          <a href="/admin/add_product" class="btn btn-primary">Добавить товар</a>
        </div>
    </div>
  </div>

  <jsp:include page="../fragments/footer.jsp"/>
</div>
</body>
</html>
