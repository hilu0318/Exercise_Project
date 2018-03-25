package kr.hilu0318.controller.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/step09/r")
public class Step09ControllerREST {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/01", method = RequestMethod.GET)
	public String justGetToStringControl() {
		return "OK";
	}
	
	@RequestMapping(value="/02", method = RequestMethod.GET)
	public ResponseEntity<String> justGetToREControl(){
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value="/03", method = RequestMethod.POST)
	public String dataPostToStringControl(@RequestParam HashMap<String, Object> param) {
		return (String) param.get("text");
	}
	
	@RequestMapping(value="/04", method = RequestMethod.POST)
	public ResponseEntity<String> jdataPostToREControl(@RequestParam HashMap<String, Object> param){
		return new ResponseEntity<>((String)param.get("text"), HttpStatus.OK);
	}
}
