import java.util.Scanner;

public class Main {
	
	static int n=0;
	static int m=0;
	static int count =0;
	static int[][] array;
	static boolean[] check;
	
	public int DFS(int start ) {
		check[start]=true;
		
		for(int i=1;i<=n;i++) {
			if(array[start][i]==1 && check[i]==false) {

				count++;
				DFS(i);
				
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main t = new Main();
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		array = new int[101][101];
		check = new boolean[101];
		
		for(int i=1;i<=m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			array[a][b] = array[b][a] = 1;
		}
		
		System.out.println(t.DFS(1));
		

	}

}