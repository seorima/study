package D1;

import java.util.Scanner;

public class swea2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
	for (int j = 0;j<T;j++) {
		
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if (a>b)
				System.out.println("#"+(j+1)+" >");
			if (a<b)
				System.out.println("#"+(j+1)+" <");
			else
				System.out.println("#"+(j+1)+" =");
					
		
		
	}
	}

}
