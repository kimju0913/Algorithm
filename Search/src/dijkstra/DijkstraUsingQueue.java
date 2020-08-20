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
		boolean visit[] = new boolean [n];
		int distanceDP[] = new int [n];
		int graph [][] = g.getGraph();
		
		for(int i = 0; i < n; i ++) {
			distanceDP[i] = 1000;
		}
		
		
		distanceDP[start] = 0;
		visit[start]= true;
		
		queue.offer(new Element(start, distanceDP[start]));
		
		while(!queue.isEmpty()) {
			int cost = queue.peek().distance;
			int here = queue.peek().vertex;
			queue.poll();
		
			
			if(cost > distanceDP[here]) {
				continue;
			}
			
			System.out.println(here);
			
			for(int i = 0; i < n; i++) {
				
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