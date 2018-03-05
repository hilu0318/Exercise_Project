package kr.hilu0318.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/step06")
public class Step06Controller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final String pagename = "step/06/multipart";

	@RequestMapping(value="/multipart", method = RequestMethod.GET)
	public ModelAndView multipartGET() {
		ModelAndView mv = new ModelAndView(pagename);
		return mv;
	}
	
	@RequestMapping(value="/basic01", method = RequestMethod.POST)
	public ModelAndView basicMessage01POST(@RequestParam HashMap param) {
		ModelAndView mv = new ModelAndView(pagename);
		
		logger.info("Parameter : " + param.get("message01"));
		mv.addObject("basic", param);
		return mv;		
	}
	
	@RequestMapping(value="/basic02", method = RequestMethod.POST)
	public ModelAndView basicMessage02POST(@RequestParam HashMap param) {
		ModelAndView mv = new ModelAndView(pagename);
		
		logger.info("Parameter : " + param);
		mv.addObject("basic02", param);
		return mv;		
	}
	
	@RequestMapping(value="/file01", method = RequestMethod.POST)
	public ModelAndView fileMultipart01POST(@RequestParam(required=false, value="file01") MultipartFile file) {
		ModelAndView mv = new ModelAndView(pagename);
		
		if(file == null)
			logger.info("File is NULL");
		else {
			logger.info("Parameter : " + file.getOriginalFilename());
			mv.addObject("file01", file.getOriginalFilename());
		}		
		return mv;		
	}
	
	@RequestMapping(value="/file02", method = RequestMethod.POST)
	public ModelAndView fileMultipart02POST(
			/* 1번째 방법.
			 * @RequestParam(required=false, value="file02") MultipartFile[] files
			 * 2번째 방법.
			 * MultipartHttpServletRequest req
			*/
			MultipartHttpServletRequest req) {
		 
		ModelAndView mv = new ModelAndView(pagename);
		
		List<MultipartFile> list = req.getFiles("file02");
		if(list.isEmpty() || list == null)
			logger.info("File is NULL");
		else {
			for(MultipartFile file : list) {
				logger.info("Parameter : " + file.getOriginalFilename());
				mv.addObject("file02", file.getOriginalFilename());
			}
		}		
		return mv;		
	}
	
	@RequestMapping(value="/file03", method = RequestMethod.POST)
	public ModelAndView fileMessageMultipart01POST(@RequestParam HashMap map, 
			@RequestParam(value="file03", required=false) MultipartFile[] files) {
		
		ModelAndView mv = new ModelAndView(pagename);
		if(map == null)
			logger.info("Parameter Is NULL");
		else
			logger.info("Parameter : " + map);
		
		if(files == null)
			logger.info("Files Are NULL");
		else {
			for(MultipartFile file : files)
				logger.info("File : "+file.getOriginalFilename());
		}
		return mv;		
	}
	
	public ModelAndView multipartFilePOST() {
		ModelAndView mv1 = new ModelAndView();
		
		return mv1;
	}
}
