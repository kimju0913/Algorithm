package search;

import java.util.ArrayList;

//- 재귀함수 활용 

//DFS 탐색하시오 

//	3 -- 1 -- 4 -- 2
//	|   / \
//	|  /   \
//	0       5 -- 6

public class DefDepthFirstSearch2 {
	
	static ArrayList<ArrayList<Integer>> list;
	static boolean visit[];
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(7);
		
		graph.addLink(3, 1);
		graph.addLink(3, 0);
		graph.addLink(0, 1);
		graph.addLink(1, 4);
		graph.addLink(1, 5);
		graph.addLink(4, 2);
		graph.addLink(5, 6);
		
		list = graph.getGraph();
		visit = new boolean[list.size()];
		
		dfs(3);
		
	}
	
	static void dfs(int start) {
		
		System.out.print(start + " ");
		visit[start] = true;
		
		for(int i = 0; i < list.get(start).size(); i++) {
			if(!visit[list.get(start).get(i)]) {
				
				dfs(list.get(start).get(i));
			}
			
			
		}
		
	}
	

}
