import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int stick = 64;
		int result = 0;
		
		
		while(x>0){
			
			if(x<stick) {
				stick /= 2;
			}else {
				result++;
				x -= stick;
		}
			
		}
		
		
		System.out.println(result);
	}

}
