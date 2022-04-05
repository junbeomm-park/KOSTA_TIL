$(function(){
	$(window).on('load', function(){
		
	});	
	
});


$(function(){
	$('form').submit(function() {
		$.ajax({
			url : 'server.jsp',
			type : 'post',
			dataType : 'json',
			data : $(this).serialize(),
			success : function(data){
				$('div').empty();
				$.each(data, function(index, item){
					var html = '<p class="title">' + item.title + '</p>';
					html += '<p class="writer">' + item.writer + '</p>';
					html += '<p class="contents">' + item.contents + '</p>';
					
				$('#list').append(html);
				})
			}
		})	
		return false;
	});	
		
});