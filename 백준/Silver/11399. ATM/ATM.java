
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ATM implements Comparable<ATM>{
    public int p,t;
    ATM(int p, int t){
        this.p = p;
        this.t = t;
    }


    @Override
    public int compareTo(ATM o) {
        if(this.t == o.t) return this.p - o.p;
        else return this.t - o.t;
    }
}

public class Main {

    public static int solution(int n, ArrayList<ATM> arr){
        int sum = 0;
        int tmp=0;
        Collections.sort(arr);

        for(ATM o : arr){
            tmp += o.t;
            sum += tmp;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ATM> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr.add(new ATM(i+1,a));
        }

        System.out.println(solution(n,arr));



    }
}
