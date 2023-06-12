import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc = 0; tc<T;tc++){

            int result = 0;
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[15][15];
            for(int i=1;i<=n;i++){
                arr[0][i]=i;
            }

            for(int j=1;j<=k;j++){
                for(int z=1;z<=n;z++){
                    for(int m=1;m<=z;m++){
                        arr[j][z] += arr[j-1][m];
                    }

                }
            }




            System.out.println(arr[k][n]);

        }

    }
}
