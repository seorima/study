
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max_num = 0;

        for(int i=1;i<=9;i++){
            int n=sc.nextInt();
            if(n>max) {
                max = n;
                max_num = i;
            }
        }

        System.out.println(max);
        System.out.println(max_num);

    }
}
