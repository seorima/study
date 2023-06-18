import java.util.Scanner;

public class Main {
    static int cnt=0;
    static int n,s;
    public static void solution(int L, int sum, int[] arr){
        if(L==n){
            if(sum == s){
                cnt++;
            }
            return;

        }else{
            solution(L+1,sum+arr[L],arr);
            solution(L+1,sum,arr);
        }



    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        s = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        T.solution(0,0,arr);

        if(s==0){
            System.out.println(cnt-1);
        }else{
            System.out.println(cnt);
        }



    }
}
