package kr.hilu0318.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hilu0318.service.Step04Service;
import kr.hilu0318.utils.Pagination;

@Controller
@RequestMapping("/step04")
public class Step04Controller {

	@Inject
	private Step04Service service;
	
	private final int numOfPage = 10;	//PGN 수
	private final int lineOfPage = 30;	//게시물 수
	
	@RequestMapping(value="/pagination", method = RequestMethod.GET)
	public String dbInsertPageGET(Model model, @RequestParam(value="currentPage", required=false, defaultValue = "1") int currentPage) {
		try {
			int total = service.totalCount();
			int lastPage = total % lineOfPage > 0 ? total/lineOfPage + 1 : total/lineOfPage;
			if(currentPage > lastPage)
				currentPage = 1;
			int start = (currentPage * lineOfPage) - lineOfPage;
			
			List<Map> list = service.dataListLimitService(start, lineOfPage);
			Pagination pg = new Pagination(currentPage, numOfPage, lineOfPage, lastPage);
			
			model.addAttribute("list", list);
			model.addAttribute("pg", pg);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "step/04/pagination";
	}
}
