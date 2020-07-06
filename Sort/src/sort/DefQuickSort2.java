package sort;

import java.util.Arrays;

public class DefQuickSort2 {
	
	// 퀵 정렬 2 
	// 이전에 강의를 보고 작성한 코드가 몇몇 사례들에선 적용되지 않음 (정렬이 다 이루어지지 않은 채 구동이 종료됨) 
	// 또한 다른 코드들을 보니 피벗값을 배열의 첫수로 잡는 것이 아닌 양 끝수의 평균을 내어 정하거나 배열의 중간으로 잡음
	// 이에 맞게 코드 수정
	
	public static void main(String[] args) {
		
		int array[] = {3, 2, 6, 16, 2, 5, 12, 4, 10};
		array = quickSort(array, 0, array.length - 1);
		System.out.println("finally : " + Arrays.toString(array));
		
		
	}// end main()
	
	public static int [] quickSort(int [] arr, int start, int end) {
		
		int pt = partition(arr, start, end); 
		if(start < pt - 1) {
			quickSort(arr, start, pt-1);
		}
		if(pt < end) {
			quickSort(arr, pt, end);
		}
		
		return arr;
	}// end quickSort()
	
	public static int partition(int [] arr, int start, int end) {
		
		int pivot = arr[(start + end) / 2]; // 피벗 값은 왼쪽 끝값과 오른쪽 끝값의 중간 배열 값 
		
		while(start <= end) { // 만일 시작 값이 끝값보다 우측 또는 그 자리라면 이미 졍렬이 완료된 것이므로 이 함수를 빠져 나간다.
		
			while(arr[start] < pivot) { // arr[start] 가 피벗값 보다 클때까지 start +1,
				start++;
			}
			while(arr[end] > pivot) {// arr[end] 가 피벗값 보다 작을때까지 end -1;
				end--;
			}
			if(start <= end) { // 만일 피벗보다 작은값이, 피벗보다 큰값 우측(배열상 뒤)에 위치해 있다면 두 수를 바꿔 정렬한다.
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;		// 그리고 정렬이 다 끝나서 피벗보다 크거나 작은 값이 없을때 까지 이 행위를 반복한다. 		
			}					
		}
		System.out.println(Arrays.toString(arr));
		return start;
	}// end partition()
	

	
	

}// end class
