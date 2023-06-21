import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int lt = 0;
        int size = 0; //집합의 크기

        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 1) cnt++;

            while(cnt>=k){
                if(arr[lt] == 1) {
                    cnt--;
                }
                lt++;
                size = rt-lt+1;

                if(cnt == k){
                    min = Math.min(min,size);
                }
            }

        }
        if(min == Integer.MAX_VALUE){
            min = -1;
        }
        System.out.println(min);


    }
}
