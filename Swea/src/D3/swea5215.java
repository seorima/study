package swea;

import java.util.Scanner;

public class swea5215 {

    static int[] score;
    static int[] kcal;
    static int n;
    static int l;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int k=0;k<T;k++){
                n=sc.nextInt();
                l=sc.nextInt();
                score = new int[n];
                kcal = new int[n];

            for(int i=0;i<n;i++){
                score[i] = sc.nextInt();
                kcal[i] = sc.nextInt();
            }

            ham(0,0,0);

            System.out.println("#"+T+" "+result);

        }
    }

    private static void ham(int idx,int sums,int sumk){
        if(sumk>l){
            return;
        }if(idx==n){
            if(sums>result){
                result=sums;
            }
            return;
        }
            ham(idx+1,score[idx]+sums,kcal[idx]+sumk);
            ham(idx+1,score[idx],kcal[idx]+sumk);


    }
}
