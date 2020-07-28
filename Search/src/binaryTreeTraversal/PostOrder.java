package binaryTreeTraversal;

public class PostOrder {

		// ** 후위 순환 
	
		// 1. 왼쪽의 서브트리를 탐색한다.
		// 2. 오른쪽의 서브트리를 탐색한다. 
		// 3. 본인을 탐색한다.
			
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
				
			postorder(tree);
					
		}// end main()
		
		// 후위순환메소드 
		static void postorder(Node node) {
			if(node.getLeft()!=null) {
				postorder(node.getLeft());
			}
			if(node.getRight()!=null) {
				postorder(node.getRight());
			}
			System.out.print(node.getData() + " ");
			
		}
			
			
			
			
}// end class PostOrder
