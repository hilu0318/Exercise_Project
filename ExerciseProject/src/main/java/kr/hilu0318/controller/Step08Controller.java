package kr.hilu0318.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.hilu0318.utils.ImgUtils;

@Controller
@RequestMapping("/step08")
public class Step08Controller {

	private Logger lg = LoggerFactory.getLogger(this.getClass());
	
	private static final String filepath = "/resources/upload/img";
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public ModelAndView editImg() {
		ModelAndView mav = new ModelAndView("step/08/editmain");
		return mav;
	}
	
	@RequestMapping(value="/resize", method = RequestMethod.POST)
	public ModelAndView resizeImg(
			@RequestParam(value="file", required=false) MultipartFile file, 
			@RequestParam HashMap<String, Object> param,
			HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("step/08/viewimage");
		int size = Integer.parseInt((String)param.get("size"));
		String localpath = req.getServletContext().getRealPath(filepath);
		ImgUtils.makeDir(localpath);
		
		try {
			BufferedImage oimg = ImageIO.read(file.getInputStream());
			BufferedImage img = ImgUtils.resizingByRateImg(file, size);
			
			ImgUtils.writeImage(img, localpath, file.getOriginalFilename());
			mav.addObject("filename", file.getOriginalFilename());

			//이미지 크기정보 출력.
			lg.info("O-width : " + oimg.getWidth());
			lg.info("O-height : " + oimg.getHeight());
			lg.info("E-width : " + img.getWidth());
			lg.info("E-height : " + img.getHeight());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value="/crop", method = RequestMethod.POST)
	public ModelAndView cropImg(
			@RequestParam(value="file", required=false) MultipartFile file, 
			HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("step/08/viewimage");
		
		//저장할 파일경로 얻어오고 폴더 생성하기.
		String localpath = req.getServletContext().getRealPath(filepath);
		ImgUtils.makeDir(localpath);
		
		try {
			BufferedImage oimg = ImageIO.read(file.getInputStream());
			
			//
			BufferedImage img = ImgUtils.cropImg(file);
			
			//UUID를 사용하여 고유한 파일이름을 생성. 앞에 문자부터 차례대로 이은 파일이름 생성.
			String newfilename = ImgUtils.makeUUIDFileName("s", file.getOriginalFilename());
			
			ImgUtils.writeImage(img, localpath, newfilename);
			mav.addObject("filename", newfilename);

			//이미지 크기정보 출력.
			lg.info(localpath);
			lg.info("O-width : " + oimg.getWidth());
			lg.info("O-height : " + oimg.getHeight());
			lg.info("E-width : " + img.getWidth());
			lg.info("E-height : " + img.getHeight());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mav;
	}
}
