package D2;

import java.util.Scanner;

public class swea2007_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		
		for(int i=0;i<T;i++) {
			String str = scan.next();
			for(int j=0;j<str.length();j++) {
				String pre = str.substring(0,j);
				String next = str.substring(j,j+j);
				if(pre.equals(next)) {
					System.out.println("#"+i+" "+pre.length());
					break;
				}
				
			}
			
			
			
			
			
			
		}
		

	}

}
