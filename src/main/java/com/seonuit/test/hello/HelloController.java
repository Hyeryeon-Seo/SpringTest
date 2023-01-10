package com.seonuit.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controllerpublic class HelloController {

	// 예제서버 끄고 테스트서버 키거나 , 포트번호 바꾸거나
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World"; //response에 담고싶은 문자열 리턴
	}
	
}