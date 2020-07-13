package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class DefQue {

	// ** 큐
	
	// - 스택이 차곡차곡 쌓이고 나중에 쌓인것 부터 추출 된다면 큐는 반대임 
	// - 쉽게 생각해서 선입선출 
	
	// offer : 데이터 추가 
	// poll : 최근 데이터 추출 후 삭제
	// peek : 최근 데이터 조회
	// isEmpty : (boolean) 빈값인지 아닌지 판단해서 true or false 반환 
	
	// Queue에서는 Queue로 인스턴스화를 하지않는다. 왜냐하면 'Queue' 라는 이름의 인터페이스에 다양한 클래스들을 만들었는데 그중에 LinkedList클래스로 Queue를 인스턴스화 한다.
	
	
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>() ;
		
		q.offer(1);
		q.offer(2);
		q.offer(10);
		q.offer(9);
		q.offer(8);
		q.poll();
		q.poll();
		q.offer(7);
		
		while(q.isEmpty() == false) {
			
			System.out.println(q.poll());
		}
		
		

	}

}
