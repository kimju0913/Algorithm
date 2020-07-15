package search;

import java.util.ArrayList;
import java.util.Stack;

// ** 깊이 우선 탑색(DFS)

	// - DFS 에서는 스택을 사용
	// - 깊이를 기준삼아 우선적으로 탐색한다.
	// - 시간 복잡도 : 1. 인접 행렬로 표현된 그래프: O(N^2)
	//				2. 인접 리스트로 표현된 그래프: O(N+E)



// - Stack 활용 Ver.

// DFS 탐색하시오 

//	3 -- 1 -- 4 -- 2
//	|   / \
//	|  /   \
//	0       5 -- 6
	


public class DefDepthFirstSearch {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(7);
		
		graph.addLink(3, 1);
		graph.addLink(3, 0);
		graph.addLink(0, 1);
		graph.addLink(1, 4);
		graph.addLink(1, 5);
		graph.addLink(4, 2);
		graph.addLink(5, 6);
		
		dfsmdByMe(graph, 3);
		System.out.println();
		dfs(graph, 3);
	
		
	}
	
	 // 정석 코드 
	static void dfs(Graph graph, int start) {
		
		ArrayList<ArrayList<Integer>> list = graph.getGraph();
		boolean visit [] = new boolean[list.size()];
		Stack<Integer> s = new Stack<Integer>() ;
		s.push(start);
		visit[start] = true;
		
		while(!s.isEmpty()) {
			
			start = s.pop();
			
			for(int i = 0; i < list.get(start).size(); i++) {
				if(!visit[list.get(start).get(i)]) {
					visit[list.get(start).get(i)] = true;
					s.push(list.get(start).get(i));
				}
				
			}
			
			System.out.print(start + " ");
			
		}
		
		
	}
	
	// 내가만든거. 
	// 사실 이렇게 괴랄한 코드가 나올게 아니었는데 사고력과 상상력이 짤은 탓에 
	// 이런 끔찍한 코드가 생성됨.
	// DFS 코드(using stack) 단순히 BFS에서 queue를 stack 으로만 바꿔주면 되는 코드 
	// 두고두고 과오를 잊지 않기 위해 직접만든 이 코드도 그대로 게제
	static void dfsmdByMe(Graph graph, int start) {
		
		ArrayList<ArrayList<Integer>> list = graph.getGraph();
		boolean visit [] = new boolean[list.size()];
		Stack<Integer> s = new Stack<Integer>() ;
		s.push(start);
		visit[start] = true;
		System.out.print(start + " "); 
		
		while(!s.isEmpty()) {		
			
				for(int i = 0; i < list.get(start).size(); i++) {
					
					if(!visit[list.get(start).get(i)]) {
						start = list.get(start).get(i);
						s.push(start);
						visit[start] = true;
						System.out.print(start + " ");
						break;
					}
					
					if(i == list.get(start).size() - 1 && visit[list.get(start).get(i)]) {
						
						s.pop();
						if(!s.isEmpty())
						start = s.peek();
						break;
					}
				}
					
		}
			
	}// dfs()
	
	
	
	

}
