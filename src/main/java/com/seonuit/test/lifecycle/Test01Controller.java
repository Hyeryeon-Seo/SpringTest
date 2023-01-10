package com.seonuit.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {
	// restcontroller쓰지말고하라는 말. 
	
	@ResponseBody
	@RequestMapping("/lifecycle/test01/2")
	public String stringResponse() {
		return "<h1>테스트 프로젝트 완성</h1> <h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>";
	}
	//사실 html다 포함하면 좋지만 태그만포함해서 대강
	
	
	@ResponseBody
	@RequestMapping("/lifecycle/test01/3")
	public Map<String, Integer> mapResponse() { //<String,...> : 제너릭
		Map<String, Integer> subjectScoreMap = new HashMap<>();
		subjectScoreMap.put("국어", 80);// 맵 객체하나 생성
		subjectScoreMap.put("수학", 90);
		subjectScoreMap.put("영어", 85);
		
		return subjectScoreMap;
		
		//중괄호로 묶여있으면 맵이나 딕셔너리 형태 {}
		
	}
	
	
	
	
	
	
	
	

}
