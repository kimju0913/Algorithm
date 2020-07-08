package sort;

import java.util.Arrays;

public class DefHeapSort {
	
	// ** 힙 정렬
	
	// quickSort, mergeSort 만큼이나 빠른 정렬 O(N * logN)
	// 힙 트리(Heap Tree) 구조를 사용하는 정렬
	
	// - 이진트리 ? 컴퓨터 안에서 데이터를 표현할 때 데이터를 각 노드에 담은 뒤 노드를 
	//            두개씩 이어 붙이는 구조. 이 때 트리 구조에 맞게 부모 노드에서 자식 노드로 가지가 뻗힘
	// - 완전 이진트리 : 데이터가 루트(root) 노드 부터 시작해서 자식 노드가 왼쪽 자식노드, 오른쪽 자식노드
	//               에 차근차근 들어가는 구조의 이진 트리. 
	
	// 힙(Heap) : 최소값이나 최대값을 빠르게 찾기 위해 완전 이진트리를 기반으로 하는 트리 
	// 			 힙에는 최대힙과 최소힙이 존재하는데 최대 힙은 '부모노드'가 '자식노드'보다 큰 힙 
	// 			 힙정렬을하기 위해선 정해진 데이터를 힙구조를 가지도록 만들어야함 
	
	// 구현 - 우선 상향식 힙구조를 만들고 난 뒤 가장 첫번째 값을 가장 끝값과 변경험. 
	// 		 그 뒤에 이미 정렬된 값을 제외하고 나머지 수 역시 위의 과정을 반복함 
	
	
	public static int arr [];
	

	public static void main(String[] args) {
		arr = new int[] {1, 5, 2, 3, 8, 4, 6, 7};
		int number = arr.length - 1;
		int temp = 0;
		
		heap(arr, number); // 우선 주어진 배열을 상향식 힙구조로 변경
		
		for(int i = number; i > 0; i--) {
			
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;    // 최대힙을 맨 밑으로 보냄
			
			heap(arr, i);	// 마지막 자식 노드를 제외하고 다시 반복	
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}//end main();
	
	public static void heap(int array[], int number) {	

		for(int i = 1; i < number; i++) {
			int child = i;
			int parent = 0;
			int temp = 0;			
			
			while(child > 0) {
				
				parent = (child - 1) / 2;
				if(array[child] > array[parent]) {
					temp = array[parent];
					array[parent] = array[child];
					array[child] = temp;
				}// end if				
				child = parent;				
			}// end while		
		}// end for
		
		
	}// end heap()

}// end class
