function checkEmpty( params ) {
	for( key in params ) {
		if( $("#"+key).attr("data-fieldName") == undefined ) {
			alert(key+"은(는) 필수 항목입니다.");
		} else {
			alert( $("#"+key).attr("data-fieldName") +"은(는) 필수항목입니다." );
		}
		$("#"+key).focus();
		return;
	}
	return true;
}

function paging(setPage,totalPage,beginPage,endPage,func) {
// parameter : setPage, totalPage, beginPage, endPage
    var page="";
    var page="<div class='text-center'>";
        page+="<ul class='pagination pagination-sm'>";
    var prevPage=beginPage-1;
    var nextPage=endPage+1;
    if(setPage!=1){
        page += "<li><a href='javascript:"+func+"("+1+")'>처음</a></li>";
    }
    else{
        page += "<li class='disable'><a>처음</a></li>";
    }
    if(beginPage!=1){
        page +="<li><a href='javascript:"+func+"("+prevPage+")'>이전</a></li>";
    }
    else{
        page +="<li class='disable'><a>이전</a></li>";
        
    }
    for(var j=beginPage; j<=endPage; j++){
        if(j==setPage){
            page+="<li><a style='color:red'><span>"+j+"</span></a></li>";
        }
        else{
            page+="<li><a href='javascript:"+func+"("+j+")'>"+j+"</a></li>";       
        }
    }
    if(endPage!=totalPage){
        page += "<li><a href='javascript:"+func+"("+nextPage+")'>다음</a></li>";
    }
    else{
        page += "<li class='disable'><a>다음</a></li>";
    }
    if(setPage<totalPage){
        page +="<li><a href='javascript:"+func+"("+totalPage+")'>끝</a></li>";
    }
    else{
        page +="<li class='disable'><a>끝</a></li>";
    }
        page+="</ul>";        	  

    return page;
}