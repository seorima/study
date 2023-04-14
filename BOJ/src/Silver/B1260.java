package Silver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




import inflearn.in0706;

public class B1260 {
	static int n=0;
	static int m=0;
	static int v=0;
	static int[][] array;
	static boolean[] check;
	
	public void DFS(int start) {
		check[start] = true;
		System.out.print(start + " ");
		
		for(int i=1;i<=n;i++ ) {
			if(array[start][i]==1 && check[i]==false) {
				DFS(i);
			}
		}
		
		
	}
	
	public void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		check[start] = true;

		System.out.print(start + " ");
		
		while(!q.isEmpty()) {
			int tmp = q.poll(); 
			
			for(int i=1;i<check.length;i++) {
				if(array[tmp][i]==1 && check[i] ==false) {
					q.add(i);
					check[i] = true;
					System.out.print(i + " ");
					
				}
			}
		}
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1260 t = new B1260();
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		array = new int[1001][1001];
		check = new boolean[1001];
		
		for(int i=0;i<m;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			array[a][b]=array[b][a] =1;
			
		}
		
		t.DFS(v);
		System.out.println();
		
		Arrays.fill(check, false);
		t.BFS(v);
		
		
		
	}

}
