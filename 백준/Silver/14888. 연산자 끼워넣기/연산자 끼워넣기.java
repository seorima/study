import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {
    static int n;
    static int max= MIN_VALUE;
    static int min=MAX_VALUE;
    static int[] arr;
    static int[] operator=new int[4];
    static int[] math;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            operator[i]=sc.nextInt();
        }


        func(1,arr[0]);

        System.out.println(max);
        System.out.println(min);

    }

    public static void func(int idx,int num){
        if(idx==n){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        for(int i=0;i<4;i++){
            if(operator[i]>0){
                operator[i]--;

                switch (i){
                    case 0:func(idx+1,num+arr[idx]); break;
                    case 1:func(idx+1,num-arr[idx]); break;
                    case 2:func(idx+1,num*arr[idx]); break;
                    case 3:func(idx+1,num/arr[idx]); break;
                }

                operator[i]++;
            }
        }



    }
}
