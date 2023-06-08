import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals(" ") || str.equals("")){
            System.out.println(0);
        }
        else{
            String str2 = str.trim();
            String[] result = str2.split(" ");
                System.out.println(result.length);
        }




    }
}
