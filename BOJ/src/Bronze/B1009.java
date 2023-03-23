package Bronze;

import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		
		for(int i=0;i<T;i++) {
			int a,b=0;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			int num=0;
			int result=1;
			
			if(a%10==0) {
				result=10;
			}else {
				for(int j=0;j<b;j++) {
					result = (result*a) % 10;
				}
			}
			
			
			System.out.println(result);
			
		}
		
		


	}

}
