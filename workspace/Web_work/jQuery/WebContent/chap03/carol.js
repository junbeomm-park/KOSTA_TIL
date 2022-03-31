// step1
/*$(function(){
	$('#switcher-large').on('click', function(){
		$('body').addClass('large');	
	});
});*/


// step2
// addClass('클래스명') , removeClass('클래스명');
/*$(function(){
	
	$('#switcher-large').on('click', function(){
		$('body').removeClass('narrow').addClass('large');
	});
	
	$('#switcher-narrow').on('click', function(){
		$('body').removeClass('large').addClass('narrow');
	});
	
	$('#switcher-default').on('click', function(){
		$('body').removeClass('narrow').removeClass('large');
	})

});*/

// step3 : 클릭한 버튼만 selected 스타일 적용 되도록
   /* $(function(){
    	
    	$('#switcher-large').on('click', function(){
    		$('body').removeClass('narrow').addClass('large');
    		$('.button').removeClass('selected');
			$(this).addClass('selected');
    	});
    	
    	$('#switcher-narrow').on('click', function(){
    		$('body').removeClass('large').addClass('narrow');
    		$('.button').removeClass('selected');
			$(this).addClass('selected');
    	});
    	
    	$('#switcher-default').on('click', function(){
    		$('body').removeClass('narrow').removeClass('large');
			$('.button').removeClass('selected');
			$(this).addClass('selected');
    	})

    });*/

// step4 : selected 관련된 중복된 코드를 최소화
/*$(function(){
    	
    	$('#switcher-large').on('click', function(){
    		$('body').removeClass('narrow').addClass('large');
    	//	$('.button').removeClass('selected');
		//	$(this).addClass('selected');
    	});
    	
    	$('#switcher-narrow').on('click', function(){
    		$('body').removeClass('large').addClass('narrow');
    	//	$('.button').removeClass('selected');
		//	$(this).addClass('selected');
    	});
    	
    	$('#switcher-default').on('click', function(){
    		$('body').removeClass('narrow').removeClass('large');
		//	$('.button').removeClass('selected');
		//	$(this).addClass('selected');
    	})

		$('#switcher .button').on('click', function(){
			$('.button').removeClass('selected');
			$(this).addClass('selected');
		})
		
    });*/

// step5 : 중복된 코드를 좀 더 최소화
/*$(function(){
	
	$('#switcher .button').on('click', function(){
			$('.button').removeClass('selected');
			$(this).addClass('selected');
			$('body').removeClass();
			
			if(this.id == 'switcher-large'){
				$('body').addClass('large');
			}else if(this.id == 'switcher-narrow'){
				$('body').addClass('narrow');
			}
			
		});
		
    });*/

// step6 : 이벤트 통합함수 => 개별 함수 변경
/*$(function(){
	
	$('#switcher .button').click(function(){
		$('.button').removeClass('selected');
			$(this).addClass('selected');
			$('body').removeClass();
			
			if(this.id == 'switcher-large'){
				$('body').addClass('large');
			}else if(this.id == 'switcher-narrow'){
				$('body').addClass('narrow');
			}
			
		});
	})*/
	
// step7 : hover
$(function(){
	$('#switcher .button').hover(function(){
		$(this).addClass('hover');
	}, 
	function(){
		$(this).removeClass('hover');
	})
});

// step8 <h3>스타일 변환기</h3> 클릭했을 때 버튼 3개가 화면에서 사라지게

/*$(function(){
	
	$('#switcher .button').click(function(){
		$('.button').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		
		if(this.id == 'switcher-large'){
			$('body').addClass('large');
		}else if(this.id == 'switcher-narrow'){
			$('body').addClass('narrow');
		}
			
	});
	
	$('#switcher  h3').click(function(){
		$('#switcher .button').toggleClass('hidden');
	})
})*/

// step9 : 이벤트 버블링 방지
/*$(function(){
	$('#switcher').click(function(){
		$('#switcher .button').toggleClass('hidden');
	});
	
	$('#switcher .button').click(function(event){
		$('.button').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		
		if(this.id == 'switcher-large'){
			$('body').addClass('large');
		}else if(this.id == 'switcher-narrow'){
			$('body').addClass('narrow');
		}
		
		event.stopPropagation();
	});
	
	
})*/

//step10 : on('click')으로 이벤트 발생 => off('click') 이벤트 해제
//         large, narrow 버튼을 클릭 후 버튼들이 사라지는 이벤트 해제
$(function(){
	$('#switcher').on('click.kosta1', function(){
		$('#switcher .button').toggleClass('hidden');
	});
	
	$('#switcher').on('click', function(){
		alert('다른 이벤트 내용');
	});
	
	
	$('#switcher .button').click(function(event){
		$('.button').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		
		if(this.id == 'switcher-large'){
			$('body').addClass('large');
		}else if(this.id == 'switcher-narrow'){
			$('body').addClass('narrow');
		}
		
		event.stopPropagation();
	});
	
	$('#switcher-large, #switcher-narrow').click(function(){
		$('#switcher').off('click.kosta1');
	});
	
	$('#switcher').trigger('click.kosta1');
})





