
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr,result;
    static int[] ch;
    public static void Test(int L,int start){
        if(L==m){
            for(int x : result){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i=start;i<n;i++){
                if(ch[i]==0){
                    ch[i]=1;
                    result[L] = arr[i];
                    Test(L+1,i+1);
                    ch[i]=0;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        arr = new int[n];
        result = new int[m];
        ch = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        Test(0,0);
    }
}
