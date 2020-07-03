package sort;

public class DefQuickSort {
	
	// ** 퀵 정렬
			// - 정렬 알고리즘 중 빠른 알고리즘에 속함 
			// - 분할 정복 알고리즘
			// - 시간복잡도 O(N * logN)
			// - 퀵 정렬에는 기준값이 있음 : 피벗(Pivot)
		 	// - 최악의 경우에는 O(N^2)
			
			// 배열의 첫번째 값을 피벗 값으로 잡고 피벗보다 큰수(왼쪽에서부터) 
			// 피벗보다 작은수(오른쪽에서부터)의 위치를 서로 바꿔줌 
			// 만일 왼쪽에서 부터 훑는데 피벗보다 작은 값이 있으면(엇갈리면) 자리를 변경해줌 -> 정렬 완료 
			// 그리고 나면 자리를 바꾼 첫번째 수가 피벗값이 됨
			// 가장 작은 수가 맨 왼쪽에 위치하고 정렬이 완료되면 정렬안된 첫번째 수가 피벗값이 됨 
			// ex) 1, 2, 3, 6, 5, 9, 8, 10 -> 피벗값은 6
			

	
	// 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하시오
			// 5 2 3 6 10 4
	
	public static int arr [] = {5, 2, 3, 6, 10, 4, 9};
	
	public static void main(String[] args) {
		
		quickSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}// end main()
	
	
	// 퀵 정렬 재귀 함수 
	public static void quickSort(int arr [], int start, int end) {
		System.out.println("시작시 - start : " + start + " end : " + end);
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp = 0;
		System.out.println("start : " + start + " " + "end : " + end +
				" i : " + i + " j : " + j);
		
		
		
		
		while(i <= j) {
			
			while(arr[i] <= arr[key] && i < end) {
				System.out.println("i++ : " + i + "/ arr[key]" + arr[key]) ;
			     i++;	
			}
			
			while(arr[j] >= arr[key] && j > start) {
				System.out.println("j-- : " + j + "/ arr[key]" + arr[key]);		
				j--;
			}
			
			if(i >= j) {
				temp = arr[j];
				arr[j] = arr[key];
				arr[key] = temp;
			}else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
	
			
		}// end while()
		
		quickSort(arr, start, j - 1);
		quickSort(arr, j + 1, end);	
		System.out.println("logger");
	}
	

}