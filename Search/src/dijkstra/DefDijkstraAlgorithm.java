package dijkstra;


public class DefDijkstraAlgorithm {

	// ** 다익스트라 알고리즘 
	// - 다이나믹 프로그래밍을 응용한 최단거리 탐색 알고리즘 
	// - 실제 GPS, 네비게이션등 실생활에서 자주 활용되는 알고리즘 
	// - 최단 거리를 기억해뒀다 활용하는 방식 
	
	// 1 ------------ 2
	//   \    (2)     |
	//    \           | (1)
	//     \ (1)      |
	//      \         |
	//       3 ------ 4
	//          (3)
	public static void main(String[] args) {
		int disConn = Integer.MAX_VALUE;
		Graph test = new Graph(4);
		test.inputNode(1, 2, 2);
		test.inputNode(1, 3, 1);
		test.inputNode(1, 4, disConn);
		test.inputNode(2, 3, disConn);
		test.inputNode(2, 4, 1);
		test.inputNode(3, 4, 3);
		
		test.dijkstra(4);
		System.out.println();
		
		Graph test2 = new Graph(5);
		test2.inputNode(1, 2, disConn);
		test2.inputNode(1, 3, 2);
		test2.inputNode(1, 4, disConn);
		test2.inputNode(1, 5, disConn);
		test2.inputNode(2, 3, 5);
		test2.inputNode(2, 4, 2);
		test2.inputNode(2, 5, 1);
		test2.inputNode(3, 4, disConn);
		test2.inputNode(3, 5, 1);
		test2.inputNode(4, 5, 3);
		test2.dijkstra(5);
		
		System.out.println();
		Graph test3 = new Graph(6);
		test3.inputNode(1, 2, 1);
		test3.inputNode(1, 3, disConn);
		test3.inputNode(1, 4, disConn);
		test3.inputNode(1, 5, disConn);
		test3.inputNode(1, 6, 1);
		test3.inputNode(2, 3, disConn);
		test3.inputNode(2, 4, 3);
		test3.inputNode(2, 5, disConn);
		test3.inputNode(2, 6, 2);
		test3.inputNode(3, 4, disConn);
		test3.inputNode(3, 5, 1);
		test3.inputNode(3, 6, 3);
		test3.inputNode(4, 5, 5);
		test3.inputNode(4, 6, 2);
		test3.inputNode(5, 6, disConn);
		test3.dijkstra(1);
	}
	
}

class Graph{
	
	private int n; 
	private int [][] graph;
	
	public Graph(int n) {
		this.n = n;
		this.graph = new int [n+1][n+1];
	}
	
	public void inputNode(int x, int y, int distance) {
		graph[x][y] = distance;
		graph[y][x] = distance;
		
	}
	
	public void dijkstra(int node) {
		
		boolean visit[] = new boolean [n+1]; // 방문여부 확인 배열 
		int distanceDP[] = new int [n+1];	 // 최단거리 기록용 DP 배열 
				
				
		for(int i = 1; i < distanceDP.length; i++) { // 거리 DP 초기화 
			distanceDP[i] = Integer.MAX_VALUE;
		}
		
		// 본인 노드간의 거리, 방문 변경 
		distanceDP[node] = 0;
		visit[node] = true;
		
			// 연결된 노드들을 우선적으로 dp에 기록, 방문 체크
			for(int i = 1; i <= n; i++) {
				if(!visit[i] && graph[node][i] < Integer.MAX_VALUE) {
					distanceDP[i] = graph[node][i];
					visit[i]= true;
				}
			}
			
			
			// 연결되어 있는 애들기준으로 다른 노드랑 연결되어있는지 확인하고 distanceDP에 기록되어있는 거리보다 멀면 기록 
		
			for(int a = 0; a < n-1; a++)	// 노드가 n개 있을 때 반복수는 n-1 까지면 된다.
				for(int i = 1; i < distanceDP.length; i++) { // 방문한 애들					
					if(visit[i]) { // 만일 i가 방문한 수이면 
						
						for(int j = 1; j < distanceDP.length; j++) { 
							if(graph[i][j] < Integer.MAX_VALUE) { // i에 연결되어 있는 다른 노드들을 탐색한 뒤 
								
								// 만일 [거리DP > i의까지의거리 + j와 i의 거리] 이면
								if(distanceDP[j] > distanceDP[i] + graph[i][j]) { 
								
									distanceDP[j] = distanceDP[i] + graph[i][j]; // 거리 dp를 갱신한다. 
									visit[j] = true;									
 								}							
							}							
						}
						
					}
	
				} // 이 행위를 반복
				
	
		for(int i = 1; i <= n; i++) { // 출력 
			System.out.print(distanceDP[i] + " ");
		}
		
	}
	
	
}