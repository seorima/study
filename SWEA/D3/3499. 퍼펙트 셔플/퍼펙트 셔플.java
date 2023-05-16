
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            int n=sc.nextInt();
            String[] arr = new String[n];
            String[] result = new String[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.next();

            }

            if(n%2==0){
                for(int i=0;i<(n/2);i++){
                    result[2*i]=arr[i];
                    result[2*i+1]=arr[i+(n/2)];
                }
            }

            else{
                for(int i=0;i<(n/2);i++){
                    result[2*i]=arr[i];
                    result[2*i+1]=arr[i+(n/2)+1];

                }
                result[n-1]=arr[n/2];
            }

            System.out.print("#"+tc+" ");

            for(String x: result){
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }
}
