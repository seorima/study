import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr = new String[n];
        Set<String> set = new HashSet<>();


        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int len = arr[0].length();
        for(int k=1;k<=len;k++){
            for(int i=0;i<n;i++){
                set.add(arr[i].substring(len-k));
            }
            if(set.size()==n){
                System.out.println(k);
                return;
            }
            set.clear();
        }


    }
}
