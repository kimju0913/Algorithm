package sort;

public class DefInsertionSort {
	
	public static void main(String[] args) {
	
		// 삽입 정렬(Insertion Sort)
		// - 각 숫자를 적절한 위치에 삽입하는 방식으로 문제를 해결
		// - 삽입 정렬은 필요할 때만 위치를 변경
		// - 하지만 시간복잡도는 역시 O(N^2), 그래도 나머지 애들(버블, 선택) 보다는 효율적 
		
		
		
		//--------------------------------------------------------------------------------------	
		
		// 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하시오
		// 1 10 3 6 2 4 9 8 5 7
		
		int arr [] = {1, 10, 3, 6, 2, 4, 9, 8, 5, 7};
		int temp = 0;
		
	
		for(int i = 1; i < arr.length; i++) {
		   
		   while(arr[i] < arr[i - 1]) {
			  
				   temp = arr[i - 1];
				   arr[i - 1] = arr[i];
				   arr[i] = temp;
				   i --;	
				   
				   if(i == 0) {
					   break;
				   }
			   
		   }
			
		
		}// end outer for() 
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}// end main()
	
	
}
