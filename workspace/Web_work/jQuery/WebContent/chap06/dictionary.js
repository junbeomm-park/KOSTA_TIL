//step1
$(function(){
	$('#letter-a a').click(function(){
		$('#dictionary').hide().load('a.html', function(){
			$(this).fadeIn();
		});
		
		return false;
	})
});


//step2 : json
/*$(function(){
	$('#letter-b a').click(function(){
		$.getJSON('b.json', function(data){ //callback함수의 파라미터 변수에는 서버의 결과값이 온다.
			//결과값: [{},{}] -> 배열
			$('#dictionary').empty();
			$.each(data, function(index, item){
				var html = '<div class="entry">';
				html += '<h3 class="term">' + item.term + '</h3>';
				html += '<div class="part">' + item.part + '</div>';
				html += '<div class="definition">' + item.definition + '</div>';
				html += '</div>';
				
				$('#dictionary').append(html);
			});
		});
		
		return false;
	});
});*/

//step 2-1 : getJSON() => ajax() 변환
$(function(){
	$('#letter-b a').click(function(){
		$.ajax({
			url : 'b.json',
			type : 'get',
			dataType : 'json',
			success : function(data){
				$('#dictionary').empty();
				data.sort(function(a, b){
					if(a.term < b.term){
						return 1;
					}else if(a.term > b.term){
						return -1;
					}else{
						return 0;
					}
				});
				$.each(data, function(index, item){
				var html = '<div class="entry">';
				html += '<h3 class="term">' + item.term + '</h3>';
				html += '<div class="part">' + item.part + '</div>';
				html += '<div class="definition">' + item.definition + '</div>';
				html += '</div>';
				
				$('#dictionary').append(html);
			});
			}
		})
		return false;
	})
})

//step3
$(function(){
	$('#letter-c a').click(function(){
		$.getScript('c.js');		
		return false;
	})
});

//step4
$(function(){
	$('#letter-d a').click(function(){
		//xml => HTML변환
		$.get('d.xml', function(data){
			$(data).find('entry').each(function(index){
				$entry = $(this);
				var html = '<div class="entry">';
				html += '<h3 class="term">' + $entry.attr('term') + '</h3>';
				html += '<div class="part">' + $entry.attr('part') + '</div>';
				html += '<div class="definition">' + $entry.find('definition').text() + '</div>';
				html += '</div>';
				
				$('#dictionary').append(html);
			})
		});

		return false;
	})
});


//step5
$(function(){
	$('#letter-e a').click(function(){
		$.get('server3.jsp', {'term' : $(this).text()}, function(data){
			$('#dictionary').text(data);
		});

		return false;
	})
});

//step6 : ajax(), <form> 데이터 전송
$(function(){
	$('#letter-f form').submit(function(){
		$.ajax({
			url : 'server3.jsp',
			type : 'post',
			data : $(this).serialize(),
			dataType : 'text',
			success : function(data){
				$('#dictionary').text(data);
			}
		})
		return false;
	});
});
