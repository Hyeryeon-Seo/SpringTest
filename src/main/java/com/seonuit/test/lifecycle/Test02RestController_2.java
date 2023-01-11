package com.seonuit.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seonuit.test.lifecycle.model.BulletinBoard;

// test02의 소문제2번
@RestController
@RequestMapping("/lifecycle/test02")
public class Test02RestController_2 {

	@RequestMapping("/2") // 2.json 출력(list, class)
	// class설계.. BulletinBoard 클래스에서 getter, setter 만듦 / 그러나 어떻게 list로?
	// getter,setter를 통해 map json형태로 - list에 넣는게 아니라
	// 'board' 를?
	public BulletinBoard listMapResponse() {
		List<BulletinBoard> boardList = new ArrayList<>();
		Map<String, String> contentMap = new HashMap<>();
		BulletinBoard board = new BulletinBoard();
		// 이것도 아닌듯 contentMap.put(..setTitle("안녕하세요 가입인사 드립니다."));
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		//boardList.add(board);
		
		BulletinBoard board2 = new BulletinBoard();
		board2.setTitle("헐 대박");
		board2.setUser("bada");
		board2.setContent("오늘 목요일이 었어... 금요일인줄");
		
		//
		// return boardList;
	}
	
	
	
	@RequestMapping("/3") // 3. ResponseEntity
	public ResponseEntity<BulletinBoard> entityResponse() { // import하기
		// 위 리스트에서 가져올 수 있나..?
		BulletinBoard board = new BulletinBoard();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		ResponseEntity<BulletinBoard> entity = new ResponseEntity(board, HttpStatus.INTERNAL_SERVER_ERROR);
		// 검사 - 콘솔 - 코드 500으로 뜬다		
		return entity;
	}
	
	
	
	
	
	/* public BulletinBoard objectResponse() {
		BulletinBoard board1 = new BulletinBoard();
		board1.setTitle("안녕하세요 가입인사 드립니다.");
		board1.setUser("hagulu");
		board1.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		BulletinBoard board2 = new BulletinBoard();
		board2.setTitle("헐 대박");
		board2.setUser("bada");
		board2.setContent("오늘 목요일이 었어... 금요일인줄");
		
		return ;
	} */
	
	
	
	
	
	
	
	
	
}
