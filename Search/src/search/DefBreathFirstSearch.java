package search;

import java.util.LinkedList;
import java.util.Queue;

public class DefBreathFirstSearch {
	
	// ** 너비우선탐색(BFS)
	
	// - 데이터를 탐색할 때 너비를 이용하여 탐색하는 탐색 알고리즘 
	// - 맹목적인 탐색 
	// - 최단경로, 최단거리 탐색 
	// - level단위 검색 
	// - 시간복잡도 1. 인접 행렬로 표현된 그래프: O(N^2) 2. 인접 리스트로 표현된 그래프: O(N+E)
	
	//         0 - 3 - 2 - 4
	//          \    /   \ 
	//           \  /     1
	//             5
	
	// 위 graph 를 BFS로 탐색하시오 
	
	static int V;
	static int E;
	// 인접 행렬로 구현 
	static int adj[][] = { {0, 0, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 1, 0},
			{0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0}			
	};;
	static boolean visit[];
	
	public static void main(String[] args) {
		
		 V = 6; 
		 E = 6;	 
		 visit = new boolean[V];
		
		 bfs(0);
		
	}
	
	static void bfs(int b) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(b);
		visit[b] = true;
		
		while(!q.isEmpty()) {
			b = q.peek();
			System.out.print(q.poll() + " ");
			
			for(int i = 1; i < V; i++) {
				
				if(!visit[i] && adj[b][i] == 1) {
					q.offer(i);
					visit[i] = true;
				
				}
				
			}
			
			
		}// end while
		
		
	}// end bfs()

}
