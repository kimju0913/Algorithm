package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	// ** Set
	// - 수학의 집합 개념을 차용 
	// 1. 요소의 저장순서를 유지 하지 않음 
	// 2. 같은 요소의 중복 저장을 허용하지 않음 
	// 3. null 값은 하나만 저장 가능
	// 4. 중복되지 않게 데이터를 저장해야할 때 유용
	
	// HashSet
	// - HashSet class 참조 
	
	// TreeSet 
	// - TreeMap과 마찬가지로 정렬 기준이 있음 
	// - 오름차순으로 데이터가 정렬됨
	
	// LinkedSet
	// - 입력된 순서대로 데이터를 정렬 
	
	public static void main(String[] args) {
		java.util.Set<String> set1 = new HashSet<String>();
		java.util.Set<String> set2 = new TreeSet<String>();
		java.util.Set<String> set3 = new LinkedHashSet<String>();
		set1 = inputAlphabet(set1);
		set2 = inputAlphabet(set2);
		set3 = inputAlphabet(set3);
		
		// set 데이터 추가
		set1.add("B");
		
		
		// set 출력 
		System.out.println("HashSet : " + set1.toString());
		System.out.println("TreeSet : " + set2.toString());
		System.out.println("LinkedHasSet : " + set3.toString());
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
		
		// set 크기 
		System.out.println("set1의 크기 : " + set1.size());
		
		// list에 담기 
		
		
		
		
		
		
		
		
	}
	
	public static java.util.Set<String> inputAlphabet(java.util.Set<String> inputSet){
		inputSet.add("B");	
		inputSet.add("D");
		inputSet.add("A");
		inputSet.add("C");
		inputSet.add("A");
		return inputSet;
		
	}

}
