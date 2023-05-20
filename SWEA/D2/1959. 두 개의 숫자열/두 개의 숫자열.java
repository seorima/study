
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            int n=sc.nextInt();
            int m = sc.nextInt();

            int min = Math.min(n,m);
            int max = Math.max(n,m);

            int[] arr1 = new int[min];
            int[] arr2 = new int[max];



            if(n!=min){
                for(int i=0;i<max;i++){
                    arr2[i]=sc.nextInt();
                }
                for(int i=0;i<min;i++){
                    arr1[i]=sc.nextInt();
                }
            }
            else{
                for(int i=0;i<min;i++){
                    arr1[i]=sc.nextInt();
                }
                for(int i=0;i<max;i++){
                    arr2[i]=sc.nextInt();
                }
            }





            int result=0;
            int start=0;

            int total=0;

            for(int i=0;i<max-min+1;i++){
                for(int j=0;j<min;j++){
                    result+=arr1[j]*arr2[j+start];
                }
                total=Math.max(total,result);
                result=0;
                start++;


            }


            System.out.println("#"+tc+" "+total);

        }
    }
}
