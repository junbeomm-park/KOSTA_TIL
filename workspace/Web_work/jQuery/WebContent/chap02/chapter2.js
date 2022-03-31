$(function(){
	$('#selected-plays > li').addClass('horizontal');
	$('li:not(.horizontal)').addClass('sub-level'); //li 요소중 horizontal 클래스 제외
	$('a[href $= pdf]').addClass('pdflink'); //속성값이 pdf로 끝나는
	$('a[href ^= mailto]').addClass('mailto'); //속성값이 maito로 시작하는 
	//$('a[href *= henry]:not(.mailto)').addClass('henrylink'); //속성값이 henry를 포함하는 속성값 중 mailto 클래스 제외
	$('a[href *= henry]').not('.mailto').addClass('henrylink'); //속성값이 henry를 포함하는 속성값 중 mailto 클래스 제외
	
	//$('tr:odd').addClass('alt'); //짝수번째
	//$('tr:nth-child(odd)').addClass('alt'); //홀수번째
	$('tr').filter(':odd').addClass('alt'); // 짝수번째
	
	//$('td:contains(Henry)').addClass('highlight');
	//$('td:contains(Henry)').nextAll().andSelf().addClass('highlight');
	//$('td:contains(Henry)').parent().find('td').addClass('highlight');
	$('td:contains(Henry)').parent().find('td:eq(0)').addClass('highlight')
							.end().find('td:eq(1)').addClass('highlight');
	
	//each() => 해당 요소들마다 각각의 작업을 수행
/*	$('요소').each(function(index, item){
		// 각 요소들의 작업을 수행
	})*/
	
	$.each(배열, function(index, item){
		//배열의 각 요소들의 작업을 수행
		
	})
})
