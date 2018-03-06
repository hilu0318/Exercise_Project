package kr.hilu0318.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {
	
	public static final String MD2 = "MD2";
	public static final String MD5 = "MD5";
	public static final String SHA_1 = "SHA-1";
	public static final String SHA_224 = "SHA-224";
	public static final String SHA_256 = "SHA-256";
	public static final String SHA_384 = "SHA-384";
	public static final String SHA_512 = "SHA-512";
	
	public static String cryptMethod(String msg, String type) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(type);
		StringBuffer hex = new StringBuffer();
		
		md.update(msg.getBytes());
		byte[] byteData = md.digest();		
		
		for(int i = 0; i < byteData.length; i++) {
			String hx = Integer.toHexString(byteData[i] & 0xff);
			if(hx.length() == 1)
				hex.append('0');
			hex.append(hx);
		}
		
		return hex.toString();
	}

	public static String cryptMD5(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		StringBuffer hex = new StringBuffer();
		
		md.update(msg.getBytes());
		byte[] byteData = md.digest();		
		
		for(int i = 0; i < byteData.length; i++) {
			String hx = Integer.toHexString(byteData[i] & 0xff);
			if(hx.length() == 1)
				hex.append('0');
			hex.append(hx);
		}
		
		return hex.toString();
	}
	
	public static String cryptSHA256(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		StringBuffer hex = new StringBuffer();
		
		md.update(msg.getBytes());
		byte[] byteData = md.digest();		
		
		for(int i = 0; i < byteData.length; i++) {
			String hx = Integer.toHexString(byteData[i] & 0xff);
			if(hx.length() == 1)
				hex.append('0');
			hex.append(hx);
		}
		
		return hex.toString();
	}
	
	
}
