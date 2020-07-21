package collections;

import java.util.ArrayList;

public class List {
	
	// ArrayList 
	// - resizable-array, 자동으로 용량이 늘어남 HashMap 마냥. 기본적으로 10의 공간. 
	// - 단방향 포인터 구조. 인덱스를 가지고 있으며, 이 때문에 조회가 빠르다.
	// - 데이터를 추가할 때 인덱스를 기준으로 순차적 저장이 된다. 
	// - 만일 중간에 추가/삭제가 이루어지면 인덱스가 한칸씩 밀리거나 당겨진다.
	
	// Vector
	// - ArrayList의 조상뻘. 무겁기도 하고 불편한게 많아 ArrayList로 대체됨 
	// - 자동동기화를 보장하기 때문에 멀티스레드 환경에서 안정적인 사용이 가능하다.
	// - 초기용량, 증가용량을 생략하면 기본적으로 0으로 값들이 지정된다. 
	
	// LinkedList
	// - 다른 List와는 달리 인덱스가 없음
	// - 말 그대로 linked, 인접한 곳끼리 사슬로 연결되어 있음 
	// - 배열 중간에 요소를 삭제하고 싶을 때 사슬만 끊으면 되므로 '중간데이터'를 추가하고 삭제하는 것이 빠름 
	// - 앞뒤 요소를 참조해야하기 때문에 ArrayList 보다 많은 공간을 차지함
	
	// ArrayList vs LinkedList
	// ArrayList  : 순차적 삭제 - 빠름 | 중간데이터 삭제 - 느림 | 조회 - 빠름 |
	// LinkedLsit : 순차적 삭제 - 느림 | 중간데이터 삭제 - 빠름 | 조회 - 느림 |
	
	

	public static void main(String[] args) {
		// List의 집합화 
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(0); arr1.add(2); arr1.add(4); arr1.add(6);
		arr2.add(0); arr2.add(1); arr2.add(3); arr2.add(5);
		
		// 두 리스트의 모든 데이터 합침. 중복 고려 x.
		arr1.addAll(arr2); 
		System.out.print("addAll() : ");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		
		
		// 두 리스트의 공통된 데이터 삭제. 
		arr1.removeAll(arr2);
		System.out.println();
		System.out.print("removeAll() : ");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		
		// 리스트에서 공통된 부분만 남기기 (교집합)
		arr1.retainAll(arr2);
		System.out.println();
		System.out.print("retainAll() : ");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		
		
	}
	
}
