package sort;

import java.util.Arrays;

public class DefMergeSort {

	// ** 병합정렬

	// - 분할 정렬
	// - 시간 복잡도는 O(N*logN)
	// - 퀵정렬과는 달리 최악의 상황서도 시간 복잡도는 O(N*logN)

	// 배열을 반씩 쪼개서 정렬하고 정렬된 단위끼리 다시 병합해 가며 정렬하는 방식
	// -----------------------------------------------
	// ex) 6 | 5 | 1 | 6 | 1 | 3 | 6 | 9
	// \ / \ / \ / \ /
	// 5 6 | 1 6 | 1 3 | 6 9
	// \ / \ /
	// 1 5 6 6 | 1 3 6 9
	// \ /
	// 1 1 3 5 6 6 6 9
	// ------------------------------------------------

	public static int arr[];
	public static int temp[];

	public static void main(String[] args) {
		arr = new int[] { 5, 4, 3, 2, 1 };
		temp = new int[arr.length];

		mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}// end main()

	public static void mergeSort(int[] array, int start, int end) {

		if (start < end) {
			int middle = (start + end) / 2;

			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);

			int lm = start;
			int rm = middle + 1;
			int index = start;

			while (lm <= middle || rm <= end) { // 둘중 하나가 true ('||' 연산) 이기 때문에 계속 반복되는

				if (rm > end || (lm <= middle && array[lm] < array[rm])) {
					temp[index++] = array[lm];
					lm++;

				} else {
					temp[index++] = array[rm];
					rm++;
				}

			}

			for (int i = start; i <= end; i++) {
				arr[i] = temp[i];
			}

		}// end if()

	}//end mergeSort()
	
}// end class
