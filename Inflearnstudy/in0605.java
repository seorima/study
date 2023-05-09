import java.util.Arrays;
import java.util.Scanner;

public class in0605 {
    public String Solution(int[] arr, int n){
        String result = "U";
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) return "D";
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        in0605 T = new in0605();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(T.Solution(arr,n));
    }
}
