import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int tmp = 0;

        int[] arr = new int[n+1];

        for(int i=0;i<=n;i++){
            arr[i] = i;
        }

        for(int i=2;i<=n;i++){
            int cnt = 0;
            int num = arr[i];

            for(int j=1;j<arr[i];j++){
                if(arr[i] % j == 0){
                    cnt++;
                }
            }

            if(cnt == 1){
                for(int z=1;z<=(n/num);z++){
                    if(arr[i*z] != 0 ){
                        tmp = arr[i*z];
                        arr[i*z] = 0;
                        k--;
                        if(k==0){
                            System.out.print(tmp);
                            return;
                        }
                    }

                }
            }
        }

    }
}
