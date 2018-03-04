package kr.hilu0318.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hilu0318.service.Step03Service;
import kr.hilu0318.utils.Pagination;

@Controller
@RequestMapping("/step03")
public class Step03Controller {

	@Inject
	private Step03Service service;
		
	@RequestMapping(value="/dbinsert", method = RequestMethod.GET)
	public String dbInsertGET(Model model) {
		try {
			List<Map> list = service.dataListService();
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "step/03/datainsert";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String dbInsertGET(Model model, @RequestParam("data")String data) {
		try {
			service.dataRegisterService(data);
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return "redirect:/step03/dbinsert";
	}	
}
