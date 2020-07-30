package dynamicProgramming;

public class DefDynamicProgramming {
	
	// ** DP(동적 계획법) 
	
	// - 쉽게 말해 큰 문제를 작은 단위로 나눠서 푸는 알고리즘.
	
	// - Memoization 
	//   : 반복되는 결과를 메모리에 저장해, 중복호출 되면 한번 더 계산하지 않고 저장해둔 값을 꺼내서 재활용 하는 것 
	
	// - Top-bottom : 큰 문제에서 작은 문제로  
	// - Bottom-up : 작은문제를 다 계산하고 큰 문제로
	
	
	// - 가장 대표적인 예가 피보나치 수열이다.
	// 	 피보나치 수열을 찾을 때 30번째 수를 구하기 위해선 n-1 + n-2를 30번째까지 해야한다. 
	// 	 이 경우 시간복잡도가 2^30 까지 치솟아버린다.
	// 	 이를 효율적으로 계산하기 위해 (n-1)과 (n-2)를 작은문제로 두고 n을 큰문제로 분리한다.
	static int fibo[];
	
	public static void main(String[] args) {
		fibo = new int [50];
		System.out.println(fibonacci2(10));
	}
	
	// Top-bottom 방식
	static int fibonacci1(int n) {
		if(n <= 1) {
			return n;
		}else if(n == 2) {
			return 1;
		}else {
			if(fibo[n] > 0) {
				return fibo[n];
			}
			fibo[n] = fibonacci1(n-1) + fibonacci1(n-2);
			return fibo[n];
		}
	}
	
	// Bottom-Top 방식 
	static int fibonacci2(int n) {
		fibo[1] = 1;
		fibo[2] = 1;
		for(int i = 3; i <= n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n];
	}

}
