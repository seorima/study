
import java.util.Scanner;
 class Solution {

    static int result;
    static int n;
    static int m;
    static int[] arr;

    public int fx(int sum,int n,int m){
        int max =0;

        for(int lt=0;lt<n-1;lt++){
            for(int rt=lt+1;rt<n;rt++){
                sum=arr[lt]+arr[rt];
                if(sum<=m && max<sum){
                    max=sum;
                }

                }
            }
        if(max==0){
            max=-1;

        }


        return max;

    }

    public static void main(String[] args) {

        Solution c = new Solution();
        Scanner sc =  new Scanner(System.in);
        int T =  sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            n=sc.nextInt();
            m=sc.nextInt();
            arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("#"+tc+" "+c.fx(0,n,m));


        }

    }
}
