package kr.hilu0318.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hilu0318.service.Step05Service;
import kr.hilu0318.utils.Pagination;

@Controller
@RequestMapping("/step05")
public class Step05Controller {

	@Inject
	private Step05Service service;
	
	private final int numOfPage = 10;	//PGN 수
	private final int maxLine = 30;
	
	@RequestMapping(value="/listcount", method = RequestMethod.GET)
	public String dbInsertPageGET(Model model, 
			@RequestParam(value="currentPage" , required=false, defaultValue="1" ) int currentPage, 
			@RequestParam(value="count"		  , required=false, defaultValue="10") int count) {
		try {
			if(count > maxLine)
				count = maxLine;
			
			int total = service.totalCount();
			int lastPage = total % count > 0 ? total/count + 1 : total/count;
			if(currentPage > lastPage)
				currentPage = 1;
			
			int start = (currentPage * count) - count;
			
			List<Map> list = service.dataListLimitService(start, count);
			Pagination pg = new Pagination(currentPage, numOfPage, count, lastPage);
			
			model.addAttribute("list", list);
			model.addAttribute("count", count);
			model.addAttribute("pg", pg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "step/05/listcount";
	}
}
