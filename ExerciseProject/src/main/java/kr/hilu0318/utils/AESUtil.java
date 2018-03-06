package kr.hilu0318.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.URLCodec;

public class AESUtil {

	private String iv;
	private Key keySpec;
	private URLCodec codec = new URLCodec();
	
	public AESUtil(String key) {
		this.iv = key.substring(0, 16);
		byte[] keyBytes = new byte[16];
		byte[] b = iv.getBytes();
		int len = b.length;
		if(len > keyBytes.length)
			len = keyBytes.length;
		
		System.arraycopy(b, 0, keyBytes, 0, len);
		SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		this.keySpec = keySpec;
	}	
	
	public String encryptAES(String str) throws	NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,	InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, EncoderException {
		
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes()));
		
		byte[] encrypted = c.doFinal(str.getBytes("UTF-8"));
		return codec.encode(new String(Base64.encodeBase64(encrypted)));
	}
	
	public String decryptAES(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, DecoderException {
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes()));
		
		byte[] decrypted = Base64.decodeBase64(codec.decode(str).getBytes());
		return new String(c.doFinal(decrypted), "UTF-8");
	}
}
