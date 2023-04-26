import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[100];
		int count =  0;
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(array[num-1] ==1 ) {
				count++;
			}
			else {
				array[num-1] = 1;
			}
		}
		
		System.out.println(count);
		
	}

}