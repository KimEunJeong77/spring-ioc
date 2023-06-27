package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


class Encoder{
	private IEncoder iencoder;
	Encoder(IEncoder iencoder){
		this.iencoder=iencoder;
	}
	
	public void setEncode(IEncoder iencoder){
		this.iencoder=iencoder;
	}
	String encode(String url){
		return iencoder.encode(url);
	}
}
