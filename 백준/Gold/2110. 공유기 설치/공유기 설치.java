
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int count(int[] arr, int mid){
        int cnt =1;
        int tmp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-tmp>=mid){
                cnt++;
                tmp = arr[i];
            }
        }

        return cnt;

    }

    public static int solution(int n, int c, int[] arr){
        int result=0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];



        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)>=c){
                result = mid;
                lt=mid+1;
            }else rt = mid-1;

        }


        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(solution(n,c,arr));

    }
}
