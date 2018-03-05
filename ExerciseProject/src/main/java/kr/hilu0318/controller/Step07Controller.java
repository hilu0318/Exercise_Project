package kr.hilu0318.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.hilu0318.utils.ImgUtils;

@Controller
@RequestMapping("/step07")
public class Step07Controller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
		
	private final String pagename = "step/07/saveimage";
		
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public ModelAndView savePageGET() {
		ModelAndView mv = new ModelAndView(pagename);
		
		return mv;
	}
	
	@RequestMapping(value = "/save/o", method = RequestMethod.POST)
	public ModelAndView imgSavePage01POST(@RequestParam("file") MultipartFile file) {
		ModelAndView mv = new ModelAndView("step/07/viewimage");
				
		String filePath = "C:/zzz/imageupload";
		
		/* 고유한 파일이름을 만들기 위해 사용. */
		UUID uuid = UUID.randomUUID();
		
		/* 저장될 폴더가 존재하는지 확인하고 없으면 생성하기. */
		ImgUtils.makeDir(filePath);
		
		String filename = file.getOriginalFilename();
		
		
		try {
			/* IN 파일 설정. 복사될 파일의 byte[]를 얻어온다. */
			byte[] in = file.getBytes();
			
			/* OUT 파일 설정. 실제 저장될 파일경로를 지정. File객체의 생성자 매개변수로 사용. */
			String fullFileName = filePath + File.separator + filename;
			
			/* Spring에서 제공하는 FileCopyUtils를 사용하여 파일 복사. copy메서드에 대해 다양한 매개변수를 지원. */
			FileCopyUtils.copy(in, new File(fullFileName));
			
			mv.addObject("filename", filename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping(value = "/save/i", method = RequestMethod.POST)
	public ModelAndView imgSavePagePOST(@RequestParam("file") MultipartFile file, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("step/07/viewimagein");
		
		/* 저장하려고 하는 resources폴더의 실제 경로를 가져온다. */		
		String filePath = req.getServletContext().getRealPath("/resources");
		
		filePath = filePath + File.separator + "upload/img";
		
		logger.info(filePath);
		
		/* 고유한 파일이름을 만들기 위해 사용. */
		UUID uuid = UUID.randomUUID();
		
		/* 저장될 폴더가 존재하는지 확인하고 없으면 생성하기. */
		ImgUtils.makeDir(filePath);
		
		String filename = file.getOriginalFilename();
				
		try {
			/* IN 파일 설정. 복사될 파일의 byte[]를 얻어온다. */
			byte[] in = file.getBytes();
			
			/* OUT 파일 설정. 실제 저장될 파일경로를 지정. File객체의 생성자 매개변수로 사용. */
			String fullFileName = filePath + File.separator + filename;
			
			/* Spring에서 제공하는 FileCopyUtils를 사용하여 파일 복사. copy메서드에 대해 다양한 매개변수를 지원. */
			FileCopyUtils.copy(in, new File(fullFileName));
			
			mv.addObject("filename", filename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

}
