<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>메인 페이지</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<script>

</script>
<style>
div p{
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  width: 100px;
  height: 20px;
}

@import url(https://fonts.googleapis.com/css?family=Open+Sans);

*{
  margin:0;
  padding:0;
  box-sizing: border-box;
  font-family: 'Open Sans', sans-serif;
}

.container{
  padding: 2rem;
}
#gallerys{
  width: 100%;
  max-width: 960px;

  margin: 2rem auto;
  
  display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  
  -webkit-flex-wrap: wrap;
      -ms-flex-wrap: wrap;
          flex-wrap: wrap;
  
  -webkit-box-pack: center;
  -webkit-justify-content: center;
      -ms-flex-pack: center;
          justify-content: center;
}

#gallerys2{
  width: 100%;
  max-width: 960px;

  margin: 2rem auto;
  
  display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  
  -webkit-flex-wrap: wrap;
      -ms-flex-wrap: wrap;
          flex-wrap: wrap;
  
  -webkit-box-pack: center;
  -webkit-justify-content: center;
      -ms-flex-pack: center;
          justify-content: center;
}

.gallery-item{
  box-shadow: 2px 2px 8px -1px #3498DB;
  width: 300px;
  height: 300px;
  margin: 10px;
  background: #000;
  position: relative;
  cursor: pointer;
  overflow: hidden;
}

.gallery-item-image{
  position: absolute;
  width: 100%;
  height: 100%;
  background: lightblue;
  z-index:20;
  -webkit-transition:all .5s ease;
  transition: all .5s ease;
  bottom:0;
  overflow: hidden;

}

.gallery-item:hover .gallery-item-image{
  bottom: 80px;
}

.gallery-item-description{
  color:black;
  font-size: .8rem;
  width: 100%;
  height: 80px;
  padding: .5rem .8rem;
  background: #FDFDFD;
  position: absolute;
  bottom:0;
}

</style>
<body>
<jsp:include page="./include/header.jsp"></jsp:include><br>
<jsp:include page="./include/nav.jsp"></jsp:include><br>

<div class="col-xs-12" style="height:50px;">
</div>
<div class="col-xs-12">

<div class="col-xs-2">
<div class="row" style="height:20%">


</div>
</div>
<div class="col-xs-8">
<div id="info">

</div>
<div id="gallerys">

  </div>
  <div id="info2">

</div>
<div id="gallerys2">

  </div>
</div>
<div class="col-xs-2">

</div>
</div>
</body>
</html>

