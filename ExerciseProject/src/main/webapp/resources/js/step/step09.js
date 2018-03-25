
	var get = 'get';
	var post = 'post';

	//dataType - 서버로 부터 전송될 데이터의 타입
	var dt_text = 'text';
	var dt_json = 'json';
	var dt_xml = 'xml';
	var dt_html = 'html';
	
	//ajaxFncDefault01(url, method, async, dataType){

	$('#btn_01').on('click', function(event) {
		event.preventDefault();
		var url = '/step09/r/01';
		var result = ajaxFncDefault(url, get, false, dt_text);
		$('#result_01').text(result);
	});
	
	$('#btn_02').on('click', function(event) {
		event.preventDefault();
		var url = '/step09/r/02';
		var result = ajaxFncDefault(url, get, false, dt_text);
		$('#result_02').text(result);
	});
	
	
	//ajaxFncData01(url, method, data, async, dataType)
	
	$('#btn_03').on('click', function(event) {
		event.preventDefault();
		var url = '/step09/r/03';
		var t_val = {
			text : $('#text_01').val()
		};
		var result = ajaxFncData(url, post, t_val, false, dt_text);
		$('#result_03').text(result);
	});
	
	$('#btn_04').on('click', function(event) {
		event.preventDefault();
		var url = '/step09/r/04';
		var t_val = {
			text : $('#text_02').val()
		};
		var result = ajaxFncData(url, post, t_val, false, dt_text);
		$('#result_04').text(result);
	});