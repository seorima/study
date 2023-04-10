package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class B10828 {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<n;i++) {
			String liSt = sc.next();
			
			if(liSt=="pop") {
				s.pop();
				System.out.println(s.pop());
			}
			
			else if(liSt=="size") {
				System.out.println(s.size() + "개");
			}
			
			else if(liSt=="size") {
				System.out.println(s.size() + "개");
			}
			
			else if(liSt=="empty") {
				if(!s.empty()) {
					System.out.println("0");
				}
				else {
					System.out.println("0");
				}
			}
			
			else if(liSt=="top") {
				System.out.println(s.peek());
				if(s.empty()) {
					System.out.println("-1");
				}
			}
			
			
		}

	}

	
	
}
