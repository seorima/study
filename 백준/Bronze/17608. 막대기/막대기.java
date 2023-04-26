import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		
		int[] array = new int[N];
		
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}

		int num = array[N-1];
		
		for(int i=N-1;i>=0;i--) {
			if(num<array[i]) {
				num=array[i];
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
