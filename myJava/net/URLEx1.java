package net;

import java.net.*;
import java.io.*;

public class URLEx1 {

	public static void main(String[] args) {
		String str = "https://search.naver.com:80/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java#top";
		try {
			URI uri = new URI(str);
			URL url = uri.toURL();
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("포트 : " + url.getPort());
			System.out.println("패스 : " + url.getPath());
			System.out.println("쿼리 : " + url.getQuery());
			System.out.println("파일명 : " + url.getFile());
			System.out.println("ref : " + url.getRef());
			
			url = new URL("http://jspstudy.co.kr");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String line = "";
			while(true) {
				line = br.readLine();
				if(line==null)break;
				System.out.println(line);
			}
			br.close();
			System.out.println("End~~~~~~~~~~");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}