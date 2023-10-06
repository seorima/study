
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            set.add(n%42);
        }

        System.out.println(set.size());

    }
}
