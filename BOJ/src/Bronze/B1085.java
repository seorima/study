package Bronze;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x,y,w,h=0;
		int x_min,y_min,result=0;
		int whe=0;
		
		
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		x_min=Math.min(x, w-x);
		y_min=Math.min(y, h-y);
		
		result = Math.min(x_min, y_min);
		
		System.out.println(result);

	}

}