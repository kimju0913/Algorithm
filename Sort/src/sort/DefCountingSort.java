package sort;

import java.util.Arrays;

public class DefCountingSort {

	// ** 계수정렬 
	
	// 계수정렬은 영문명과 같이 각 원소들의 개수를 '세면서' 정렬하는 방식 
	// 시간 복잡도는 무려 O(N)인데 
	// 다만 이와 같은 빠른 속도가 나오려면 '범위 조건'이 있어야한다는 것 	
	// 즉 1~6까지 2~40까지등 범위가 정해져 있어야 함 
	
	
	// 5이하의 자연수 데이터들을 오름차순으로 정렬하시오 
	// 5, 1, 2, 4, 1, 5, 2, 3, 5, 1, 2, 2, 3, 1, 5
	
	
	public static void main(String[] args) {
		
		int count[] = {0, 0, 0, 0, 0};
		int array[] = {5, 1, 2, 4, 1, 5, 2, 4, 5, 1, 2, 2, 3, 1, 5};
		int index = 0;
		
		for(int i  = 0; i < array.length; i++) {	
			count[array[i] - 1]++;
		
		}
		
		for(int i = 0; i < count.length; i++) {
			
			for(int j = count[i]; j > 0; j--) {
				array[index] = i + 1;
				index++;
			}
			
		}
		
		System.out.println(Arrays.toString(array));
		
		
	}

}
