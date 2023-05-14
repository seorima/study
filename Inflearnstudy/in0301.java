import java.util.ArrayList;
import java.util.Scanner;

public class in0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] arr2= new int[m];

        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        int p1=0;
        int p2=0;

        ArrayList<Integer> result = new ArrayList<>();

        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                result.add(arr1[p1]);
                p1++;
            }else{
                result.add(arr2[p2]);
                p2++;
            }
        }

        while(p1<n) result.add(arr1[p1++]);
        while(p2<m) result.add(arr2[p2++]);

        for(int x : result) System.out.print(x+" ");

    }
}
