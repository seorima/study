import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 1;
        int sum = 0;

        int[] arr = new int[1002];

        for(int i=1;i<=1000;i++){
            for(int j=1;j<=i;j++){
                if(cnt == 1001) break;
                arr[cnt]=i;
                cnt++;
            }
        }

        for(int i=a;i<=b;i++){
            sum +=arr[i];
        }

        System.out.println(sum);

    }
}
