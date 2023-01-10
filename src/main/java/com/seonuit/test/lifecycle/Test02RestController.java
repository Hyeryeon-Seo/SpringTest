package com.seonuit.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02RestController {
	// 맵 하나하나 구성하고 리스트에 추가
	 //2- 2번 클래스기반 객체생성 리스트만들기 , 리스트 안에 클래스 (직접만들어서)
	 // 멤버변수와 멤버변수에 저장된 값
	 // 문제 3번  .. 그리고 그냥 전체 깃허브 그전까지만 올려줘도 알아서 들어가신다구..
	
	// 파라미터 받아서 할 것인지? 그럼 다른 메소드에서 만들면 되는 걸까? 아니면 그냥? 
	//   > 그러나 그냥 하면 put하면서 문제 생긴다 . .. 
	
	
	
	// T - 맵의 밸류값 숫자도, 문자열도 ,, >> Object(모든클래스의부모클래스! upcasting..)
	//   메소드를 만든다 그 안에 map만들고 밖에 list도 만들고... 하나의 메소드 안에!
	
	@RequestMapping("/1") // 답안
	public List<Map<String, Object>> listMapRsponse() {
	
		List<Map<String, Object>> movieListaw = new ArrayList<>(); //aw는 답안이라서

		Map<String, Object> movie = new HashMap<>();
		movie.put("title", "기생충");
		movieListaw.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "인생은 아름다워");
		movie.put("time", 147);
		movieListaw.add(movie);
		
		// ----이런 식 반복
		return movieListaw;
	}
	
	// ------------------ ME
	
	//@RequestMapping("/1")
	//public Map<String, Object> movie1Response() {
		//Map<String, Object> movieMap = new HashMap<>();
		//movieMap.put("rate", 15);
		//movieMap.put("director", "봉준호");
		//movieMap.put("time", 131);
		//movieMap.put("title", "기생충");
		
		//return movieMap1;
	//}

	//public Map<String, Object> movie2Response() {
		//Map<String, Object> movieMap2 = new HashMap<>();
		//movieMap2.put("rate", 0);
		//movieMap2.put("director", "로베르토 베니니");
		//movieMap2.put("time", 116);
		//movieMap2.put("title", "인생은 아름다워");
		
		//return movieMap2;
	//}
	
	public Map<String, Object> movie3Response() {
		Map<String, Object> movieMap3 = new HashMap<>();
		movieMap3.put("rate", 12);
		movieMap3.put("director", "크리스토퍼 놀란");
		movieMap3.put("time", 147);
		movieMap3.put("title", "인셉션");
		
		return movieMap3;
	}
	
	public Map<String, Object> movie4Response() {
		Map<String, Object> movieMap4 = new HashMap<>();
		movieMap4.put("rate", 19);
		movieMap4.put("director", "윤종빈");
		movieMap4.put("time", 133);
		movieMap4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		
		return movieMap4;
	}
	
	
	//
	@RequestMapping("/6")
	public List<Map<String, Object>> listResponse() {
		// 파라미터? .. 근데 안받기로했다 _Map<String, Object> movieMap2, Map<String, Object> movieMap3, Map<String, Object> movieMap4
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movieMap1 = new HashMap<String, Object>();
		// servlet jsp연습문제 자바제어문2{{ put("rate", 15); put("director", "봉준호"); put("time", 131); put("title", "기생충"); } };
		// 위에처럼 문법도 가능한데, 이건 좀 더 짧게 쓴거라서 아래처럼 .put으로 해주는게 익숙하고 낫다
		movieMap1.put("rate", 15);
		movieMap1.put("director", "봉준호");
		movieMap1.put("time", 131);
		movieMap1.put("title", "기생충");
		movieList.add(movieMap1);
		
		Map<String, Object> movieMap2 = new HashMap<String, Object>();
		movieMap2.put("rate", 0);
		movieMap2.put("director", "로베르토 베니니");
		movieMap2.put("time", 116);
		movieMap2.put("title", "인생은 아름다워");
		movieList.add(movieMap2);
		
		//movieList.add(movieMap3);
		//movieList.add(movieMap4);
		
		return movieList;
	
	}
	
	
	

}
