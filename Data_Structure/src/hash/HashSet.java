package hash;

import java.util.Iterator;

//** HastSet

//- Set 인터페이스의 구현 클래스, set의 성질을 그대로 상속받음  
//- set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장 가능함. 또한 저장 순서가 유지되지 않음 
//- HashSet을 기본으로 생성했을 때에는 initial capacity(16), load factor(0.75)의 값을 가진 객체가 생성
//- 만일 지정되었던 값보다 큰 값이 들어오면 List처럼 저장공간을 늘리고, 약 2배가량을 늘림 
//- 새롭게 늘어나는 과정에서 과부하가 걸리기 떼문에 초기 용량을 지정해 주는 것이 좋음 


public class HashSet {
	
	public static void main(String[] args) {
		
		// Hash 선언 방법들 (import 잘못함) 
		java.util.HashSet<Integer> set1 = new java.util.HashSet<Integer>(); // 기본 
		HashSet set2 = new HashSet();// 기본 
		java.util.HashSet<Integer> set3 = new java.util.HashSet<Integer>(20); // 용량 지정
		
		// 값 추가 & 삭제 
		set1.add(1);
		set1.add(4);
		set1.add(1);
		set1.add(5);
		set1.add(8);
		set1.remove(8);
		
		// 크기 
		System.out.println(set1.size());
		
		// 출력 
		System.out.println("첫번째 출력방법 : 변수 이름 그대로 입력 - " + set1);
		
		System.out.print("두번째 출력방법 : iterator 사용 - ");
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		
		
		
	}

}
