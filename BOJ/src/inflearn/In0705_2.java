package inflearn;

class Node{
	int data;
	Node lt,rt;
	
	public Node(int val) {
		data = val;
		lt=rt= null;
	}	
}


public class In0705_2 {
	
	Node root;
	public void DFS(Node root) {
		if(root ==null) return;
		else {
			DFS(root.lt);
			DFS(root.rt);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		In0705_2 tree = new In0705_2();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		

	}

}
