$(function(){
	var $speech = $('div.speech');
	var defaultSize = parseInt($speech.css('fontSize'));
	
	$('#switcher button').click(function(){
		var num = parseInt($speech.css('fontSize'));
		
		switch(this.id){
			case 'switcher-large':
				num *= 1.2;
				break;
			case 'switcher-small':
				num /= 1.2;
				break;
			default:
				num = defaultSize;
				break;
		}
		
		$speech.animate({fontSize: num+'px'}, 'slow');
		
	});
	
	
});

$(function(){
	$('div.label').click(function(){
		var pWidth = $('div.speech p').outerWidth();
		var divWidth = $('#switcher').outerWidth();
		
		var num = parseInt(pWidth) - parseInt(divWidth);
		
		$('#switcher').fadeTo('fast', 0.5)
					 .animate({marginLeft: num}, 'slow')
					 .fadeTo('fast', 1.0)
					 .slideUp('slow', function(){
						$(this).css('background', 'red');
					})
					 .slideDown('slow');
	})
})

$(function(){
	$('div.speech p').next('p').css('display', 'none');
	
	$('a.more').click(function(){
		$('div.speech p').next('p').slideToggle('slow');
		if($(this).text() == 'read more'){
			$(this).text('read less');
		}else{
			$(this).text('read more');
		}
	})
})
