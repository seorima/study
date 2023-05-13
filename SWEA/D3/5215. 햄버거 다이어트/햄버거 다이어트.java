
import java.util.Scanner;

public class Solution {

    static int[] score;
    static int[] kcal;
    static int n;
    static int l;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int k=1;k<=T;k++){
                result=0;
                n=sc.nextInt();
                l=sc.nextInt();
                score = new int[n];
                kcal = new int[n];

            for(int i=0;i<n;i++){
                score[i] = sc.nextInt();
                kcal[i] = sc.nextInt();
            }

            ham(0,0,0);

            System.out.println("#"+k+" "+result);

        }
        sc.close();
    }

    private static void ham(int idx,int sums,int sumk){
        if(sumk>l){
            return;
        }if(idx==n){
           result = Math.max(result,sums);
            return;
        }
            ham(idx+1,score[idx]+sums,kcal[idx]+sumk);
            ham(idx+1,sums,sumk);


    }
}
