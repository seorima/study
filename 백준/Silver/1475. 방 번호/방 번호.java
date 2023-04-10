import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int[] num = new int[10];
		
		for(int i=0;i<n.length();i++) {
			num[n.charAt(i)-'0']++;
		}
		
		num[6] +=num[9];
		num[9]=0;
		
		if(num[6]%2==0) {
			num[6] /= 2;
		}else {
			num[6]= (num[6] / 2) +1;
		}

		int result=0;
		
		for(int i=0;i<10;i++) {
			result = Math.max(result, num[i]);
		}
		
		System.out.println(result);
		
	}

}
