
		//1번 메서드.
		function ajaxFncDefault(url, method, async, dataType){
			var _result = 'error';
			$.ajax({
			url: url,
				type: method,
				async : async,
				dataType: dataType
			})
			.done(function(result) {
				console.log(result);
				_result = result;
			})
			.fail(function() {
				console.log("error");
			})
			.always(function() {
				console.log("-------Connect Success-------");
			});
			return _result;
		}
		
		function ajaxFncData(url, method, data, async, dataType){
			var _result = 'error';
			$.ajax({
				url: url,
				type: method,
				async : async,
				dataType: dataType,
				data : data
			})
			.done(function(result) {
				console.log(result);
				_result = result;
			})
			.fail(function() {
				console.log("error");
			})
			.always(function() {
				console.log("-------Connect Success-------");
			});
			return _result;
		}
		
		/* 2번 메서드
		function ajaxFncDefault(url, method, async, dataType){
			var _result = 'error';
			$.ajax({
				url: url,
				type: method,
				async : async,
				dataType: dataType,
				success : function(result){
					console.log(result);
					_result =  result;
				},
				statusCode:{
					400 : function(){
						console.log("400");
					}
				}
			});
			return _result;
		}
		
		function ajaxFncData(url, method, data, async, dataType){
			var _result = 'error';
			$.ajax({
				url: url,
				type: method,
				dataType: dataType,
				data : data,
				async : async,
				success : function(result){
					console.log(result);
					_result = result;
				},
				statusCode:{
					400 : function(){
						console.log("400");
					}
				}
			});
			return _result;
		}
*/
		