import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] before = new int[9];
        int sum = 0;
        int result = 0;

        for(int i=0;i<9;i++){
            before[i] = sc.nextInt();
            sum += before[i];
        }


            for(int i=0;i<8;i++){
                for(int j=i+1;j<9;j++){
                    result = sum-(before[i]+before[j]);
                    if(result == 100){
                        before[i] = 0;
                        before[j] = 0;
                        Arrays.sort(before);

                        for(int z=2;z<9;z++){
                            System.out.println(before[z]);
                        }
                        return;
                    }
                }
            }


    }
}
