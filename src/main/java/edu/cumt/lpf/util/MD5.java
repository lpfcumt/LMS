package edu.cumt.lpf.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;

@Component
public class MD5{
	
	
	public String getSalt(){
		Random r = new Random();  
        StringBuilder sb = new StringBuilder(16);  
        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
        int len = sb.length();  
        if (len < 16) {  
            for (int i = 0; i < 16 - len; i++) {  
                sb.append("0");  
            }  
        }  
		return sb.toString();
	}
	
	/**
     * 生成32位md5码
     * @param password
     * @return
     */
    public  String md5Password(String password, String salt) { 
         /*password = md5Hex(password + salt);  
         char[] cs = new char[48];  
         for (int i = 0; i < 48; i += 3) {  
             cs[i] = password.charAt(i / 3 * 2);  
             char c = salt.charAt(i / 3);  
             cs[i + 1] = c;  
             cs[i + 2] = password.charAt(i / 3 * 2 + 1);  
         }  
         return new String(cs);  */
    	try {
            StringBuffer stingBuffer = new StringBuffer();
            // 1.指定加密算法
            MessageDigest digest = MessageDigest.getInstance("MD5");
            // 2.将需要加密的字符串转化成byte类型的数据，然后进行哈希过程
            byte[] bs = digest.digest((password + salt).getBytes());
            // 3.遍历bs,让其生成32位字符串，固定写法

            // 4.拼接字符串
            for (byte b : bs) {
                int i = b & 0xff;
                String hexString = Integer.toHexString(i);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stingBuffer.append(hexString);
            }
            return stingBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;

    }
    
    /**  
     * 获取十六进制字符串形式的MD5摘要  
     */  
	@SuppressWarnings("unused")
	private  String md5Hex(String src) {  
        try {  
            MessageDigest md5 = MessageDigest.getInstance("MD5");  
            byte[] bs = md5.digest(src.getBytes());  
            return new String(new Hex().encode(bs));  
        } catch (Exception e) {  
            return null;  
        }  
    }  
}
