$(function(){
	$('.orderAmount input').change(function(){
		var totalCost = 0;
		var totalQuantity = 0;
					
		var price = 1145000;
					
		var quantity = parseInt($('.orderAmount input').val());
		quantity = isNaN(quantity) ? 0 : quantity;
					
		var cost = price * quantity;
					
		$('.cost').text(cost.toLocaleString('ko-KR') + '원');
					
		totalCost += cost;
		totalQuantity += quantity;
	});
});

$(function(){
	$.ajax({
		url : 'review.json',
		type : 'get',
		dataType : 'json',
		success : function(data){
				$('#dt').append('<thead><tr><th>작성자</th><th>구입 모델</th><th>내용</th><th>구매날짜</th></tr></thead>')
				$.each(data, function(index, item){
					$('#dt').append('<tbody><tr><td>' + item.writer +
						'</td><td>' + item.model + '</td>' +
						'</td><td>' + item.content + '</td>' +
						'</td><td>' + item.date + '</td></tr></tbody>' );
				})
			
		}
	})
})
		
$(function(){
	$('.bxslider').bxSlider({
			 mode: 'fade',
			 captions: true,
			 slideWidth: 600
	});
});


