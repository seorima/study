
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    static int[] ch;
    static int min = Integer.MAX_VALUE;
    public static void food(int L,int sour,int bitter,int c){

        if(L==n){
            if(Math.abs(sour-bitter)<min && c !=0){
                min = Math.min(min,Math.abs(sour-bitter));
            }

        }else{
            if(ch[L]==0){
                ch[L]=1;
                food(L+1,sour*arr[L][0],bitter+arr[L][1],c+1);
                ch[L]=0;
                food(L+1,sour,bitter,c);
            }


        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ch = new int[n];
            arr = new int[n][2];

            for(int i=0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }

            food(0,1,0,0);

            System.out.println(min);
        }









    }

