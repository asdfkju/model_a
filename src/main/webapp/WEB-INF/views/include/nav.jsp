<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>nav section</title>
<script>
</script>
<style>
body {
  font-family: 'PT Sans', sans-serif;
  font-size: 13px;
  font-weight: 400;
  color: #4f5d6e;
  position: relative;
  filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#1a315f', endColorstr='#1a315f', GradientType=0);
}

nav {
  box-shadow: 5px 4px 5px #000;
}

</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="main">Air & Room</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#" onclick="searchRoom()">숙소 검색</a></li>
      <li><a href="#" onclick="searchAirline()">항공권 검색</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${sessionScope.id eq null}">
      <li><a href="/choiceJoinType"><span class="glyphicon glyphicon-user"></span> 회원가입</a></li>
      <li><a href="/loginForm"><span class="glyphicon glyphicon-log-in"></span> 로그인</a></li>
      </c:if>
            <c:if test="${sessionScope.id ne null}">
				<li><a href="#" onclick="chat()"><i class="fas fa-comment-dots"></i> 채팅방 보기</a></li>
                  <li><a href="#" onclick="myPage()"><i class="fas fa-user-cog"></i> 마이 페이지</a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> 로그아웃</a></li>
            </c:if>
    </ul>
  </div>
</nav>
</body>

<script>

</script>
</html>