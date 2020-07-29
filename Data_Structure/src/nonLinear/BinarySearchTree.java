package nonLinear;

public class BinarySearchTree {
	// ***** 두뇌의 한계로 삭제는 구현 못함 + 귀차니즘으로 BST class 생성을 따로 안함. 후에 꼭 할 것!
	
	// ** 이진탐색트리 
	// - 이진트리를 통한 탐색 
	// - 삽입시 루트값보다 입력한 값이 작으면 왼쪽, 크면 오른쪽에 저장 
	// - 만일 루트보다는 작은데 자식보다는 크면 자식에 오른쪽에 위치 
	// - 삭제는 세 가지 방법으로 이루어짐 
	// 1. 자식노드들이 없는 경우 - 해당 노드만 삭제 
	// 2. 자식노드가 1개인 경우 - 해당노드를 지우고 자식노드를 자리에 채움 
	// 3. 자식노드가 2개인 경우 - 왼쪽노드의 가장 큰 값을 삭제된 노드에 채우거나 오른쪽노드의
	// 						 가장 작은 노드를 채운다. 이때 빈자리는 하위노드로 채움 
	
	public static void main(String[] args) {
		
		Node tree = new Node(5);
		tree = insertTree(tree, 4);
		tree = insertTree(tree, 6);
		tree = insertTree(tree, 3);
		tree = insertTree(tree, 1);
		tree = insertTree(tree, 2);
		tree = insertTree(tree, 9);
		
		test(tree);
		findTree(tree, 1);
		
	}
	
	public static void test(Node node) {
		System.out.println(node.getData());
		if(node.getLeft() != null) {
			test(node.getLeft());
		}
	}
	
	public static void findTree(Node node, int data) {
			if(node.getLeft()==null && node.getRight() == null) {
				System.out.println("없다");
				return;
			}
		
			if(node.getData() > data) {
				findTree(node.getLeft(), data);
			}else if(node.getData() < data) {
				findTree(node.getRight(), data);
			}else if(node.getData() == data) {
				System.out.println("있다");
				return;
			}		
		
	}	
	
	public static Node insertTree(Node node, int data) {
		
		Node root = node;
		Node newNode = new Node(data);
		
		if(node == null) {
			return newNode;
		}else if(node.getData() > data) {			
			root.setLeft(insertTree(node.getLeft(), data));		
			return root;
		}else if(node.getData() < data) {
			root.setRight(insertTree(node.getRight(), data));
			return root;
		}else {
			return root;
		}	
	} // end insertTree() 
	
	

}
