
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        for(int x : set){
            System.out.print(x+" ");
        }

    }
}
