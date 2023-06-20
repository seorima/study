import java.util.Scanner;

public class Main {
    static int arr[] = new int[1000001];

    public static int solution(int n){
        if(arr[n]==-1){
            arr[n] = (solution(n-1) + solution(n-2)) % 15746 ;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        for(int i=3;i<arr.length;i++){
            arr[i] = -1; // 0값이 있을수 있기 때문에 초기화
        }

        System.out.println(T.solution(n));



    }
}
