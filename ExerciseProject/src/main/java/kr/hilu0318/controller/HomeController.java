package kr.hilu0318.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest req) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		// 여기부터는 테스트용 코드
		Map<String, Boolean> errors = new HashMap<>();
		errors.put("id", Boolean.TRUE);
		model.addAttribute("errors", errors);
		HttpSession session = req.getSession();
		ServletContext sc = req.getServletContext();
		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("sssss");
		list.add("vvvvvv");
		list.add("qw1231231");
		model.addAttribute("list", list);
		sc.setAttribute("uu", "hihi");
		
		
		return "mainpage";
	}
	
}
