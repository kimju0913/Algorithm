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
		
		Graph test = new Graph(4);
		test.inputNode(1, 2, 2);
		test.inputNode(1, 3, 1);
		test.inputNode(1, 4, Integer.MAX_VALUE);
		test.inputNode(2, 3, Integer.MAX_VALUE);
		test.inputNode(2, 4, 1);
		test.inputNode(3, 4, 3);
		
		test.dijkstra(1);
		
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
		
		boolean visit[] = new boolean [n+1];
		int distanceDP[] = new int [n+1];
		boolean allVisit = true;
		
				
				
		for(int i = 1; i < distanceDP.length; i++) {
			distanceDP[i] = Integer.MAX_VALUE;
		}
		
		visit[node] = true;
		
		
		while(allVisit) {
			allVisit = false;
			
			for(int i = 1; i <= n; i++) {
				if(!visit[i] && graph[node][i] < Integer.MAX_VALUE) {
					distanceDP[i] = graph[node][i];
					visit[i]= true;
				}
			}
			
			// 연결되어잇지 않은 노드들 거리 구해야함 
			
		}// end while
		
		for(int i = 1; i <= n; i++) {
			System.out.print(distanceDP[i] + " ");
		}
		
	}
	
	
}