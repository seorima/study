
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        for(int t=1;t<=10;t++){
            int n=sc.nextInt();
            int[][] arr = new int[100][100];
            int max = Integer.MIN_VALUE;

            for(int i=0;i<100;i++){
                for(int j=0;j<100;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int sum=0;
            for(int i=0;i<100;i++){
                sum = 0;
                for(int j=0;j<100;j++){
                    sum += arr[i][j];
                }
                max = Math.max(max,sum);
            }

            for(int i=0;i<100;i++){
                sum = 0;
                for(int j=0;j<100;j++){
                    sum += arr[j][i];
                    max = Math.max(max,sum);
                }
            }

            sum = 0;
            for(int i=0;i<100;i++){
                    sum += arr[i][i];
            }
            max = Math.max(max,sum);

            sum = 0;
            for(int i=0;i<100;i++){
                sum += arr[i][100-i-1];
            }
            max = Math.max(max,sum);



            System.out.println("#"+n+" "+max);

        }
    }
}
