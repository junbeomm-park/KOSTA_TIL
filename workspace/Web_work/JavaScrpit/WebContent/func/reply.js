var replyService = (function(){
	
	function getList(param, callback){
		var data = "콜백에서 호출";
		console.log(param);
		
		callback(data);
	}
	
	return{
		getList : getList
	};
	
})();