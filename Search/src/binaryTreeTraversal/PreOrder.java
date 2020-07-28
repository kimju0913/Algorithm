package binaryTreeTraversal;

public class PreOrder {
	
	// ** 전위 순환 
	
	// 1. 본인을 탐색한다.
	// 2. 왼쪽의 서브트리를 탐색한다.
	// 3. 오른쪽의 서브트리를 탐색한다. 
	
	//            1
	//        2       3
	//      4   5   6   7
	//    8  9 
	
	public static void main(String[] args) {
		
		Node tree = new Node(1);
		tree.setLeft(new Node(2));
		tree.setRight(new Node(3));
		tree.getLeft().setLeft(new Node(4));
		tree.getLeft().setRight(new Node(5));
		tree.getRight().setLeft(new Node(6));
		tree.getRight().setRight(new Node(7));
		tree.getLeft().getLeft().setLeft(new Node(8));		
		tree.getLeft().getLeft().setRight(new Node(9));		
		
		preorder(tree);
		
	}// end main()
	
	//전위순회 메소드 
	public static void preorder(Node node) {
		
		System.out.print(node.getData() + " ");
		if(node.getLeft() != null) {
			preorder(node.getLeft());
		}
		if(node.getRight() != null) {
			preorder(node.getRight());
		}
			
	} // end preorder()

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
	
	
} // end class Node