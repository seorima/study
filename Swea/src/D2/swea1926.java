package D2;

import java.util.Scanner;

public class swea1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 1 ; i<=num ; i++) {
			String number = Integer.toString(i);
			String result = "";
			for(int j=0;j<number.length();j++) {
				if(number.charAt(j)=='3'||number.charAt(j)=='6'||number.charAt(j)=='9' ) {
					result += "-";
					
				}
					
				
			}
			
			if (result.length()>=1) {
				System.out.print(result +" ");
			} else {
				System.out.print(number + " ");
			}
		}
		
	}

}
