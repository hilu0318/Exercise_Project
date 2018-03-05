package kr.hilu0318.controller.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImgLoadController {
	
	@RequestMapping(value="/img", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getImg(@RequestParam("filename") String filename){
		String filePath = "C:/zzz/imageupload";
		String fullname = filePath + File.separator + filename;
		HttpHeaders header = new HttpHeaders();
		InputStream in = null;
		header.setContentType(MediaType.IMAGE_JPEG);
		try {
			in = new FileInputStream(fullname);
			byte[] data = IOUtils.toByteArray(in);
			return new ResponseEntity<>(data, header, HttpStatus.OK);
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
