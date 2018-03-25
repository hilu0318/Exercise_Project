package kr.hilu0318.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/step09")
public class Step09Controller {

	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String ajaxMain() {
		return "step/09/ajax01";
	}
}
