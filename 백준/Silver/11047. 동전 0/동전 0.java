
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp > k) break;
            arr.add(tmp);
        }

        Collections.reverse(arr);
        int size = arr.size();
        int cnt = 0;
        int result = k;

            for(int i=0;i<size;i++){
                    cnt += result/arr.get(i);
                    result = result%arr.get(i);
                    if(result == 0) break;


            }

        System.out.println(cnt);

//        for(int x : arr){
//            System.out.println(x);
//        }

    }
}
