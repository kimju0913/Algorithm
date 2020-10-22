package codeup;

import java.util.*;

public class Q_2601_DP {
	
	// 동적계획법 - 피보나치 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int [] fibo = new int [num];
		
		System.out.println(fibonacci(fibo));
		
	}
	
	public static int fibonacci(int[] fibo) {
		
		int result = 0;
		
		for(int i = 0; i < fibo.length; i++) {
			if(i == 0 || i == 1) {
				fibo[i] = 1;
			}else {
				fibo[i] = fibo[i-1] + fibo[i-2];
			}
			
		}
		
		result = fibo[fibo.length-1];
		
		return result;
		
	}

}
