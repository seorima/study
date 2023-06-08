import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result;

        for(int i=0;i<str.length();i++){
            result = str.charAt(i);
            System.out.print(result);

            if (i % 10 == 9) {
                System.out.println();

            }

        }


    }
}
