package kr.hilu0318.utils;

import java.io.File;

public class ImgUtils {

	public static void makeDir(String path) {
		File file = new File(path);
		if(!file.exists()) {
			file.mkdirs();
		}
	}
}
