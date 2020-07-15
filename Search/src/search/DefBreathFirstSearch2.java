package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// ** BFS 인접리스트시 코드 
// - 시간복잡도 : O(N+E) 

//	2 -- 0    4
//	|  / |  /
//	| /  | /
//	1 -- 5 -- 3

//  bfs 탐색 하시오 	

class Graph{
	
	private ArrayList<ArrayList<Integer>> adj;
	
	public Graph(int initSize) {
		this.adj = new ArrayList<ArrayList<Integer>>(); // 그래프 생성 
		
		for(int i = 0; i<initSize+1; i++) {		
			adj.add(new ArrayList<Integer>());		
		}
		
	}// end Constructor class Graph
	
	public void addLink(int node1, int node2) {	
		// 원래는 단일방향 양방향 구분하여 메소드를 만들어야하지만 편의상 양방향으로 노드 연결
		adj.get(node1).add(node2);
		adj.get(node2).add(node1);
	}// end addLink()
	
	public void addLink2(int node1, int node2) {	
		// 원래는 단일방향 양방향 구분하여 메소드를 만들어야하지만 편의상 양방향으로 노드 연결
		adj.get(node1).add(node2);
		
	}
	
	public ArrayList<ArrayList<Integer>> getGraph(){
		// 생성된 그래프 리턴
		return this.adj;
	}// end getGraph();
	
	
}

public class DefBreathFirstSearch2 {

	
	public static void main(String[] args) {
		
//		2 -- 0    4
//		|  / |  /
//		| /  | /
//		1 -- 5 -- 3
		
		Graph graph = new Graph(6);
		
		graph.addLink(0, 2);
		graph.addLink(0, 1);
		graph.addLink(0, 5);
		graph.addLink(1, 2);
		graph.addLink(1, 5);
		graph.addLink(5, 4);
		graph.addLink(5, 3);
		
		bfs(graph, 2);
		
	}// end main();
	
	static void bfs(Graph graph, int start) {
		
		ArrayList<ArrayList<Integer>> list = graph.getGraph();
		
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visit[] = new boolean[list.size()];	
		
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			
			start = q.peek();
			System.out.print(q.poll() + " ");
						
				for(int j = 0; j < list.get(start).size(); j++) {
					if(!visit[list.get(start).get(j)]) {					
						q.offer(list.get(start).get(j));	
						visit[list.get(start).get(j)] = true;
					}					
				}
			
		} // end while	
		
	}// end bfs()
	

}// end class bfs2
