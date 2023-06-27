package com.example.demo;

import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
class BaseEncoder implements IEncoder{
	public String encode(String url){	
		return Base64.getEncoder().encodeToString(url.getBytes());
	}
}
