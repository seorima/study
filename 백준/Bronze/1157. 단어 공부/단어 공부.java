import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		int[] arr = new int[26];
		
		
		for(int i=0;i<T.length();i++) {
			
			if(T.charAt(i)>='A' && T.charAt(i)<='Z') {
				arr[T.charAt(i) - 'A']++;
			}
			else {
				arr[T.charAt(i) - 'a']++;
			}
		}
		
		
		int max=-1;
		char result = '?';
		
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max=arr[i];
				result = (char)(i + 65);
			}
			else if(arr[i]==max) {
				result = '?';
			}
		}
		
		System.out.println(result);
		
		
	}

}
