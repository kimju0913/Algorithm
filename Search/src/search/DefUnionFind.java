package search;


// ** Union_Find

// - 합집합 찾기 혹은 서로소 집합 알고리즘이라고도 함 
// - 여러개의 노드가 존재할 때 두 개의 노드를 선택해서 이 두 노드가 서로 같은 그래프에 속하는지 판별하는 알고리즘
// - 일반적으로 노드를 합칠때는 작은수를 부모로 함 


public class DefUnionFind {
	
	static int [] parent ;
	
	public static int findParent(int x) {
		
		if(parent[x] == x) {
			return x;
		}
			return findParent(parent[x]);
	
		
	}
	
	public static void unionParent(int x, int y) {
		x = findParent(x);
		y = findParent(y);
		
		if(x > y) {
			parent[x] = y;
		}else {
			parent[y] = x;
		}
	}
	
	public static String checkParent(int x, int y) {
		if(findParent(x) == findParent(y)) {
			return "맞습니다";
		}else {
			return "아닙니다";
		}
	
	}
	
	public static void main(String[] args) {
		
		parent = new int[11];
		
		for(int i = 0; i < parent.length; i++) {
			parent[i]=i;
		}
		
		unionParent(0, 2);
		unionParent(1, 2);
		unionParent(3, 4);
		unionParent(4, 5);
		unionParent(5, 6);
		
		System.out.println("0과 1는 같은 집합입니까 ? : " + checkParent(0, 1));
		System.out.println("2와 5는 같은 집합입니까 ? : " + checkParent(2, 5));
		
		unionParent(0, 6); // 각 집합의 노드를 임의로 연결, 그리고 재확인 
		System.out.println("2와 3는 같은 집합입니까 ? : " + checkParent(2, 3));
		
		
	}
	

}
