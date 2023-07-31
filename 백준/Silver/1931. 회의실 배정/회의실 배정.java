
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Con implements Comparable<Con>{
    public int s,e;
    Con(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Con o){
        if(this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}
public class Main {
    public static int solution(int n ,ArrayList<Con> arr){

    int cnt = 0;
    Collections.sort(arr); //위에조건
    int et = 0;
    for(Con o : arr){
        if(o.s>=et){
            et = o.e;
            cnt++;
        }
    }

    return cnt;
}
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            java.util.ArrayList<Con> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr.add(new Con(a,b));
            }
            System.out.println(solution(n,arr));
        }
    }

