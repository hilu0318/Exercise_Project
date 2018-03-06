package kr.hilu0318.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.springframework.web.multipart.MultipartFile;

public class ImgUtils {

	public static void makeDir(String path) {
		File file = new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
	}
	
	public static BufferedImage resizingImg(MultipartFile file, int width, int height) throws IOException {
		
		//원본 image파일을 ImageIO.read를 통해 BufferdImage클래스로 추출. 
		BufferedImage bi = ImageIO.read(file.getInputStream());
		
		//Scalr 라이브러리를 사용하여 리사이징.
		return Scalr.resize(bi, width, height, null);
	}
	
	public static BufferedImage resizingByRateImg(MultipartFile file, int size) throws IOException {
		
		//원본 image파일을 ImageIO.read를 통해 BufferdImage클래스로 추출. 
		BufferedImage bi = ImageIO.read(file.getInputStream());
		
		double rate = (double)size / 100;
		//image의 원본 길이를 구함.
		int width = (int)((double)bi.getWidth() * rate);
		int height = (int)((double)bi.getHeight() * rate);
		
		//Scalr 라이브러리를 사용하여 리사이징.
		return Scalr.resize(bi, width, height, null);
	}
	
	public static BufferedImage resizingByLongSizeImg(MultipartFile file, int size) throws IOException {
		
		//원본 image파일을 ImageIO.read를 통해 BufferdImage클래스로 추출. 
		BufferedImage bi = ImageIO.read(file.getInputStream());
		BufferedImage out = bi;
		
		int width = bi.getWidth();
		int height = bi.getHeight();
		
		//width가 height보다 크고 사이즈값보다 클때.  
		if((width > height) && (width > size)) {
			double rate = (double)width / (double)height;
			width = size;
			height = (int)((double)size * rate);				
			out =  Scalr.crop(bi, width, height, null);
		}else if((height > width) && (height > size)) {
			double rate = (double)width / (double)height;
			height = size;
			width = (int)((double)size * rate);				
			out =  Scalr.crop(bi, width, height, null);
		}
		
		//Scalr 라이브러리를 사용하여 리사이징.
		return out;
	}
	
	//이미지를 중앙 기준으로 정 사각형모양으로 크롭
	public static BufferedImage cropImg(MultipartFile file) throws IOException {

		//원본 image파일을 ImageIO.read를 통해 BufferdImage클래스로 추출. 
		BufferedImage bi = ImageIO.read(file.getInputStream());
		
		//
		int width = Math.min(bi.getWidth(), bi.getHeight());
		
		return Scalr.crop(bi, (bi.getWidth()-width)/2, (bi.getHeight() - width)/2, width, width, null);
	}
	
	public static void writeImage(BufferedImage img, String filepath, String filename) throws IOException {
		File outFile = new File(filepath + File.separator + filename);
		String fileformat = filename.substring(filename.lastIndexOf(".")+1);
		ImageIO.write(img, fileformat, outFile);
	}
		
	public static String makeUUIDFileName(String...filename) {
		UUID uuid = UUID.randomUUID();
		StringBuffer sb = new StringBuffer();
		for(String str : filename) {
			sb.append("_");
			sb.append(str);
		}
		return uuid.toString() + sb.toString();
	}
}
