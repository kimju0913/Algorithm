package dijkstra;

import java.util.PriorityQueue;

public class DijkstraUsingQueue {

	// ** 우선순위 큐를 활용한 다익스트라 알고리즘
	
	// - 기존 다익스트라의 경우 시간복잡도가 O(N^2)임.
	//   이 경우 노드가 많고, 간선이 적을 때 엄청나게 비효율적인 코드가 됨 
	// - https://doublezerostone.tistory.com/31 
	public static void main(String[] args) {
		
		int disConn = 1000;
		
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
		dijkstraQueue(test2, 5);
		
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
		dijkstraQueue(test3, 1);
		
	}
	
	public static void dijkstraQueue(Graph g, int start) {
		PriorityQueue<Element> queue = new PriorityQueue<Element>();
		
		// TODO : 주석달기
		
		int n = g.getN() + 1;
		int distanceDP[] = new int [n];
		int graph [][] = g.getGraph();
		
		for(int i = 0; i < n; i ++) {
			distanceDP[i] = 1000; // Integer최대값을 넣으면 값이 넘어가서 -값으로 전환됨 그래서 1000으로 지정 
		}
		
		// 이 부분까지는 일단 다익스트라와 동일 
		
		distanceDP[start] = 0;
		
		queue.offer(new Element(start, distanceDP[start])); // 우선 큐에 시작점 Element을 넣어줌. 앞부분은 노드, 뒷부분은 시작노드와 해당노드까지의 거리 
		
		// 큐가 완전히 빌 때 까지 반복문 수행 
		while(!queue.isEmpty()) {
			int cost = queue.peek().distance; // cost : 큐에서 꺼낸 노드까지의 거리 
			int here = queue.peek().vertex;	  // here : 가야할 노드 
			queue.poll(); // 해당 노드를 꺼내주고 
		
			
			if(cost > distanceDP[here]) { // 이 노드까지의 거리가 dp 상에 기록되어 있는 거리보다 길면 패스한다. 아닐경우 아래 반복문 수행 
				continue;
			}
			
			System.out.println(here);
			
			for(int i = 0; i < n; i++) {
				// 만일, 확인하려는 노드가 시작노드가 아니고,
				// dp에 기록된 현재 노드까지의 거리 + 현재노드와 연결된 i노드와의 거리가 
				// dp에 기록된 i거리와 시작노드와의 거리보다 작으면,
				// 즉 현재의 노드를 거쳐 i까지 가는 노드의 길이가, 기존에 기록된 i와의 거리의 최소값 보다 작으면 
				// 이를 갱신하고 i의 element를 큐에 넣어준다.				
				if(graph[here][i] != 0 && distanceDP[here] + graph[here][i] < distanceDP[i]) {
					
					distanceDP[i] = distanceDP[here] + graph[here][i];
					queue.offer(new Element(i, distanceDP[i]));
					
				}
				
				
			}
			
			
		}
		System.out.println();
		for(int i = 1; i < n; i++) {
			System.out.print(distanceDP[i] + " ");
		}
		
		
		
		
	}
	
	
	
	
}

class Element implements Comparable<Element>{

	int vertex;
	int distance;
	
	public Element(int vertex, int distance) {
		this.vertex = vertex;
		this.distance = distance;
	}
	
	
	@Override
	public int compareTo(Element o) {		
		return distance <= o.distance ? -1 : 1;
	}
	
	
	
}