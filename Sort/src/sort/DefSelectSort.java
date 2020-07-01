package sort;

public class DefSelectSort {
	
	public static void main(String[] args) {
		// 선택 정렬
		// 나열 되어있는 숫자를 순차적으로 선택해 가장 작은 것을 앞으로 보내주는 식으로 정렬한다.
		// 장점 - 코드 짜기 쉬움
		// 단점 - 매우 비효율적
		// 		 10개를 정렬하기 위해 55번의 비교연산 -> N*(N+1)/2 -> O(N^2)
//------------------------------------------------------------------------------		
		
		// 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하시오
		// 1 10 3 6 2 4 9 8 5 7
		int i, j, min, temp;
		int index = 0;
		int [] arr = {1, 10, 3, 6, 2, 4, 9, 8, 5, 7};
		
		for(i = 0; i < arr.length; i++) {
			min = 9999;
			for(j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}	
			}
			
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp; 
			
		}
		
		for(int k = 0; k < 10; k++) {
			System.out.print(arr[k] + " ");
		}
		
		
	}// end main(){}
	

}
