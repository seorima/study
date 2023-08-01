
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str =sc.nextLine();
        int min = Integer.MAX_VALUE;

        String[] str = sc.nextLine().split("-");

        for(int i=0;i<str.length;i++){
            int tmp = 0;

            String[] plus = str[i].split("\\+");


            for(int j=0;j<plus.length;j++){
                tmp += Integer.parseInt(plus[j]);

            }
            if(min == Integer.MAX_VALUE){
                min = tmp;
            }else{
                min -=tmp;
            }


        }
        System.out.println(min);
    }
}
