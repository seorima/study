package Bronze;

import java.util.Scanner;

public class B1233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int s1,s2,s3=0;
		int sum,count=0;
		
		
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		
		int[] a1 = new int[s1];
		int[] a2 = new int[s2];
		int[] a3 = new int[s3];
		
		int[] result = new int[81];
		
		for(int i=0;i<s1;i++) {
			a1[i]=i+1;
		}
		
		for(int i=0;i<s2;i++) {
			a2[i]=i+1;
		}
		
		for(int i=0;i<s3;i++) {
			a3[i]=i+1;
		}
		
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				for(int z=0;z<s3;z++) {
					sum=a1[i]+a2[j]+a3[z];
					result[sum]++;					
					
				}
			}
			
		}
		int answer=0;
		
		for(int i=0;i<result.length;i++) {
			count = Math.max(result[i],count);
		}
		
		for(int i=0;i<result.length;i++) {
			if(result[i]==count) {
			answer=i;
			break;
			}
		}
		
		System.out.println(answer);
	}

}