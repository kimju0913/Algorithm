package stackAndQue;

import java.util.Stack;

public class DefStack {
	
	// 스택과 큐는 자료구조 공부할 때 더 자세히 하겠지만 
	// 기타 다른 알고리즘 공부를 위해 간단히 개념만 잡고 가기위해 정리함 
	
	// ** 스택
	// - 말그대로 Stack 즉 차곡차곡 쌓이는 것을 의미 
	// - 베라 아이스크림을 3가지 시켰다고 가정하자. 통에 딸기맛 초코맛 바닐라맛 순으로 직원이 담아줬다면
	// - 나는 바닐라, 초코, 딸기맛 순으로 아이스크림을 퍼먹게 된다 
	// - 데이터가 순차적으로 저장되면 가장 최근에 저장된 순으로 수정 및 제가 이루어진다. 
	
	// push : 데이터 추가 
	// pop : 최근 데이터 추출 후 삭제
	// peek : 최근 데이터 조회
	// empty : (boolean) 빈값인지 아닌지 판단해서 true or false 반환 
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(3);
		s.push(20);
		s.peek();
		s.pop();
		s.push(4);
		s.push(5);
		System.out.println(s.peek() + " " + s.empty());
		
		


		
		
		
		
	}
	

}
