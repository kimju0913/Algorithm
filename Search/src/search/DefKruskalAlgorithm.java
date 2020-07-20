package search;

import java.util.ArrayList;
import java.util.Collections;

// ** 크루스칼 알고리즘 
	// - 가장 적은 비용으로 모든 노드를 연결하기 위한 알고리즘
	// - 최소 비용 신장 트리를 만들기 위한 알고리즘 
	// - 노드들을 연결할때 사이클이 생기면 안됨 
	//(예를 들어 1 3 2 노드가 연결돼 있을 때 1 - 3 - 2 - 1 처럼 순환되는 구조로 연결되면 안됨)
	// 간선 : 거리, 비용 
	// 프림 알고리즘과는 달리 노드가 아닌 '간선 위주'의 탐색 

class Edge implements Comparable<Edge>{
	
	int v1;
	int v2;
	int distance;
	
	public Edge(int v1, int v2, int distance) {
		this.v1 = v1;
		this.v2 = v2;
		this.distance = distance;	
	}

	@Override
	public int compareTo(Edge o) {
		
		if(this.distance < o.distance)
			return -1;
		else if(this.distance > o.distance) {
			return 1;
		}
		return 0;
	}
	
} // end class Edge 
	

public class DefKruskalAlgorithm {
	
	static int parent[];
	
	public static int find(int x) {
		
		if(parent[x] != x) {
			return find(parent[x]);
		}
		
		return parent[x];
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x > y) {
			parent[x] = y;
		}else {
			parent[y] = x;
		}
	}
	
	public static boolean check(int x, int y) {
		if(find(x) == find(y)) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		
		parent = new int[8];
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		int sum = 0;
		
		edgeList.add(new Edge(1,4,4));
        edgeList.add(new Edge(1,2,6));
        edgeList.add(new Edge(2,3,5));
        edgeList.add(new Edge(2,4,3));
        edgeList.add(new Edge(2,5,7));
        edgeList.add(new Edge(2,6,8));
        edgeList.add(new Edge(3,6,8));
        edgeList.add(new Edge(4,5,9));
        edgeList.add(new Edge(5,6,11));
		
	  
       Collections.sort(edgeList);
       
       for(int i = 0; i < parent.length; i++) {
    	   parent[i] = i;
       }
       
       for(int i = 0; i < edgeList.size(); i++) {
    	   
    	   if(!check(edgeList.get(i).v1, edgeList.get(i).v2)) {
    		   union(edgeList.get(i).v1, edgeList.get(i).v2);
    		   sum += edgeList.get(i).distance;
    	   }
    	   
       }
		
		
       System.out.println("총 거리의 합은 : " + sum);
		
	}
	
	
	
}
