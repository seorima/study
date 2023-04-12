package inflearn;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt,rt;
	
	public Node(int val) {
		data = val;
		lt=rt= null;
	}	
}


public class in0707 {
	
	Node root;
	public void BFS(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L=0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(L + " : ");
			
			for(int i=0;i<len;i++) {
				Node cur = q.poll();
				System.out.print(cur.data + " ");
				
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
				
			}
			
		}
		L++;
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		in0707 tree = new in0707();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		

	}

}
