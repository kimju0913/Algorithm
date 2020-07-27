package nonLinear;


public class BinaryTree {
	
	// ** 이진 트리 
	
	// - 자식노드가 최대 2개인 노드들로 구성된 트리 
	// 
	// - 데이터의 탐색속도 증진을 위해 사용하는 구조 
	
	// - 정이진트리 
	// 1) 모든 레벨에서 노드들이 꽉 채워진 이진트리 
	// 2) 레벨에 따른 노드의 개수 2^n(level)
	
	// - 완전이진트리 
	// 1) 마지막 레벨을 제외한 모든 레벨에서 노드들이 꽉 채워진 트리 
	
	// - 균형이진트리 
	// 1) 모든 잎새노드의 깊이차이가 많아야 1인 트리 
	// 2) 균형이진트리는 예측 가능한 깊이를 가지며, 노드가 n개인 균형이진트리의 깊이는 log n을 내림한 값 
	
	public static void main(String[] args) {
		
		Node tree = new Node(1);
		tree.setLeft(new Node(2));
		tree.setRight(new Node(3));
		tree.getLeft().setLeft(new Node(4));
		tree.getLeft().setRight(new Node(5));
		tree.getRight().setLeft(new Node(6));
		tree.getRight().setRight(new Node(7));
		tree.getLeft().getLeft().setLeft(new Node(8));		
		
		// 테스트 
		printLeftTree(tree);
		System.out.println();
		printRightTree(tree);
		
	}
	
	// 맨 왼쪽 노드만 출력 
	public static void printLeftTree(Node node) {
		
		if(node != null) {
			System.out.print(node.getData() + " ");
			printLeftTree(node.getLeft());
		}
		
	}
	
	// 맨 오른쪽 노드만 출력
	public static void printRightTree(Node node) {
		
		if(node != null) {
			System.out.print(node.getData() + " ");
			printLeftTree(node.getRight());
		}
		
	}

}

class Node{
	
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
}
