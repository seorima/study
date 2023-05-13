package swea;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class swea1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int k=1;k<=10;k++){
            int result=0;
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=0;

            for(int j=2;j<n-2;j++){
                max = Math.max(arr[j-2],Math.max(arr[j - 1], Math.max(arr[j + 1], arr[j + 2])));
                    if(max<arr[j]){
                    result+= (arr[j]-max);
                    j++;
                }
            }





            System.out.println("#"+k+" "+result);

        }

    }
}
