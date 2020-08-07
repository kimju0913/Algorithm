package sieveOfEratosthenes;


public class SieveEratos {
	
	// ** 에라토스테네스의 체 
	// - 소수(자기 자신 외에 나눌 수 없는 수)를 구하는 방식 
	// - 2부터 시작해 본인의 배수를 하나씩 지운다. 
	//   7까지 다다르면 100까지의 소수는 다 드러난다.
	// - 마치 이 방식이 체에 거르는 것 같다 하여 에라토스테네스의 체 라고 부른다.
	
	public static void main(String[] args) {
		
		int[] p1 = new int[101];
		
		// 내가짠 코드
		
//		for(int i = 2; i < p1.length; i++) {
//			p1[i] = i;
//		}
//		
//		for(int i = 2; i < p1.length; i++) {
//			if(p1[i] != 0)
//			for(int j = i + i; j < p1.length; j += i) {
//				p1[j] = 0;
//			}
//					
//		}
//		
//		for(int i = 2; i < p1.length; i++) {
//				if(p1[i] != 0)
//				System.out.print(p1[i] + " ");
//			
//		}
		
		// TODO : 사람들은 첫번째 반복문에서 i^2가 전체수보다 작을경우(100이라 치면 10의 제곱이 100이라 거기까지 돌릴필요 x) + 배열을 boolean으로 받음. 이렇게 짜볼것
		boolean [] p2 = new boolean[101];
		
		for(int i = 2; i < p2.length; i++) {
			p2[i] = true;
		}
		
		for(int i = 2; i*i < p2.length; i++) {
			if(p2[i])
			for(int j = i + i; j < 101; j += i) {
				p2[j] = false;
			}
			
		}
		
		for(int i = 2; i < p2.length; i++) {
			if(p2[i]) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	

}
