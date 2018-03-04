package kr.hilu0318.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.hilu0318.service.Step01Service;

@Controller
@RequestMapping("/step01")
public class Step01Controller {

	@Inject
	private Step01Service service;
	
	@RequestMapping(value="/dboneprint", method = RequestMethod.GET)
	public String step01GET(Model model) {
		
		try {
			String data = service.selectDataOne();
			model.addAttribute("data", data);
		} catch (Exception e) {
		}		
		return "step/01/dataprint";
	}
}
