package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIocApplication.class, args);
		ApplicationContext context=ApplicationContextProvider.getContext();
		// 객체생성하지않고 BaseEncoder, UrlEncoder를 Bean으로 등록해서 사용
		BaseEncoder baseEncoder=context.getBean(BaseEncoder.class);
		UrlEncoder urlEncoder=context.getBean(UrlEncoder.class);
		Encoder encoder=new Encoder(baseEncoder);
		String url="www.seoulit.com/books/it?page=1&size=20$title=spring-boot";
		System.out.println(encoder.encode(url));
		encoder.setEncode(urlEncoder);
		System.out.println(encoder.encode(url));
	}

}
