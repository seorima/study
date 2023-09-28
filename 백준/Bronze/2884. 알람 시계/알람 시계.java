
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = h*60+m;

        if(time>=45){
            int result = time - 45;
            System.out.println(result/60 + " " + result%60);
        }else{
            System.out.println("23 "+ (60-Math.abs(time-45)));
        }

    }
}
