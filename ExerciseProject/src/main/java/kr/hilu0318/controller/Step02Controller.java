package kr.hilu0318.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.hilu0318.service.Step02Service;

@Controller
@RequestMapping("/step02")
public class Step02Controller {

	@Inject
	private Step02Service service;
	
	@RequestMapping(value="/dblistprint", method = RequestMethod.GET)
	public String step02GET(Model model) {
		try {
			List<String> list = service.selectDatalist();
			model.addAttribute("list", list);
		} catch (Exception e) {

		}
		return "step/02/datalistprint";
	}
}
