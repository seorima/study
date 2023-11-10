
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
class Con {
    int time;
    int pay;
    Con(int time, int pay){
        this.time = time;
        this.pay = pay;

    }

}
public class Main {
    static int n;
    static ArrayList<Con> arr;
    static int result;

    public static void DFS(int day_total, int pay_total){
        if(n<=day_total){
            result = Math.max (result,pay_total);
            return;
        }
            if(day_total+arr.get(day_total).time <=n){
                DFS(day_total+arr.get(day_total).time,pay_total + arr.get(day_total).pay);
            }else{
                DFS(day_total+arr.get(day_total).time,pay_total);
            }
            DFS(day_total+1,pay_total);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();
        result = 0;

        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            arr.add(new Con(t,p));
        }

        DFS(0,0);

        System.out.println(result);





    }
}
