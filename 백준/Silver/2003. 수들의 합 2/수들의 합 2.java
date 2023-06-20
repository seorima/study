import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;
        int start=0,end=0,count=0;

        while(true){
            if(sum>=m){
                sum-=arr[start++];
            }
            else if(end==n){
                break;
            }else{
                sum+=arr[end++];
            }

            if(sum==m){
                count++;
            }
        }
        System.out.println(count);

//        int lt = 0;
//        int rt = 1;
//
//        while(rt < n){
//            int sum = 0;
//            for(int i=lt ; i<=rt; i++){
//                sum += arr[i];
//            }
//
//            if(sum>m){
//                lt++;
//            }else if(sum ==m){
//                cnt++;
//                lt++;
//                rt++;
//            }else if (sum<m){
//                rt++;
//            }
//        }



//        System.out.println(cnt);
    }
}
