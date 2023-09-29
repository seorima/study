
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = String.valueOf(a*b*c);

        for(int i=0;i<result.length();i++){
            arr[Integer.parseInt(String.valueOf(result.charAt(i)))]++;
        }

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }





    }
}
