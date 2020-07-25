package collections;

import java.util.HashMap;

public class Map {

	// ** Map
	// - Key, Value의 형태로 이루어져 있음
	// - 예시 ) key = name, value = georges / key = height, value = 179
	// - 순서에 의존하지 않고 key로 value를 가
	
	// linkedHashMap & TreeMap
	// - Map에 순서를 부여 
	// - LinkedHashMap : 입력된 순서대로 데이터 출력 
	// - TreeMap : key의 sort 기준 데이터 출력 
	
	public static void main(String[] args) {
		
		java.util.Map<String, String> me = new HashMap<String, String>();
		
		// ------- 주요 함수 --------
		
		// put : Map에 데이터 입력
		me.put("name", "주경");
		me.put("gender", "남자");
		me.put("state", "인천");
		
		// map 출력 
		System.out.println(me);
		
		// get : key로 value 출력 
		System.out.println(me.get("name"));
		
		// containsKey : 해당 key가 있는지 확인
		System.out.println(me.containsKey("gender"));
		
		// remove : key 값에 해당하는 item(key & value)를 삭제한 뒤 value 값을 리턴 
		System.out.println(me.remove("state"));
		
		// size : 크기 출력 
		System.out.println(me.size());
		
		
		
		
	}
	
	
	
	
}
