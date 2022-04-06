$(function(){
	$('#data1').click(function(){
		$.ajax({
			url : 'MOCK_DATA.json',
			type : 'get',
			dataType : 'json',
			success : function(data){
				$('#dt').append('<thead><tr><th>id</th><th>first_name</th><th>last_name</th><th>email</th><th>gender</th><th>ip_address</th></tr></thead>')
				$.each(data, function(index, item){
					$('#dt').append('<tr><td>' + item.id +
						'</td><td>' + item.first_name + '</td>' +
						'</td><td>' + item.last_name + '</td>' +
						'</td><td>' + item.email + '</td>' +
						'</td><td>' + item.gender + '</td>' +
						'</td><td>' + item.ip_address + '</td></tr>' );
				})
			}
		})
	})
});


$(function(){
	$('#data2').click(function(){
		$.get('dataset.xml', function(data){
			$('#dt2').append('<tr><td>id</td><td>first_name</td><td>last_name</td><td>email</td><td>gender</td><td>ip_address</td></tr>')
			$(data).find('record').each(function(index){
				$record = $(this);
				
				var html = '<tr><td>' +  $record.find('id').text() +
						'</td><td>' + $record.find('first_name').text() + '</td>' +
						'</td><td>' + $record.find('last_name').text() + '</td>' +
						'</td><td>' + $record.find('email').text() + '</td>' +
						'</td><td>' + $record.find('gender').text() + '</td>' +
						'</td><td>' + $record.find('ip_address').text() + '</td></tr>';
				
				$('#dt2').append(html);
				
			})
		})
	})
})