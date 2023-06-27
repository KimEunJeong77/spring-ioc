package com.example.demo;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component
class UrlEncoder implements IEncoder{
	public String encode(String url){	
		try{
			return URLEncoder.encode(url,"utf-8");
		}catch(UnsupportedEncodingException e){
			System.out.println("지원되지 않는 인코딩방식");
			return null;
		}
	}
}
