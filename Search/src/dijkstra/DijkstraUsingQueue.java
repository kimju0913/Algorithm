package dijkstra;

import java.util.PriorityQueue;

public class DijkstraUsingQueue {

	// ** 우선순위 큐를 활용한 다익스트라 알고리즘
	
	// - 기존 다익스트라의 경우 시간복잡도가 O(N^2)임.
	//   이 경우 노드가 많고, 간선이 적을 때 엄청나게 비효율적인 코드가 됨 
	// - https://doublezerostone.tistory.com/31 
	public static void main(String[] args) {
		
		
		
		
	}
	
	public void dikstraQueue(Graph g, int start) {
		PriorityQueue<Element> queue = new PriorityQueue<Element>();
		// https://manducku.tistory.com/32
		// TODO : 위 페이지 보고 다익스트라 큐 버전 만들기 
		// 		  그래프 클라스를 받아와서 그 클라스에 getN() 함수 만들어서 n값 받아오기.
		int n = g.getN() + 1;
		boolean visit[] = new boolean [n];
		int distanceDP[] = new int [n];
		int graph [][] = g.getGraph();
		
		distanceDP[start] = 0;
		visit[start]= true;
		
		queue.offer(new Element(start, distanceDP[start]));
		
		
		
		
		
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