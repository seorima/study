import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T= sc.nextInt();

            int[] dy = new int[11];

            dy[1]=1;
            dy[2]=2;
            dy[3]=4;

            for(int i=4;i<=10;i++){
                dy[i]=dy[i-3]+dy[i-2]+dy[i-1];
            }

            for(int tc = 0; tc<T; tc++ ){
                int n=sc.nextInt();
            System.out.println(dy[n]);
        }



    }
}
