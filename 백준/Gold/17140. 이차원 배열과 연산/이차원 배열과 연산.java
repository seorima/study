
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
class Order implements Comparable<Order>{
    public int num;
    public int total;

    Order(int num, int total){
        this.num = num;
        this.total = total;
    }


    @Override
    public int compareTo(Order o) {
        if(this.total == o.total) return this.num-o.num;
        else return this.total-o.total;
    }
}
public class Main {
    static int[][] arr ;
    static int row,col,cnt;
    static int r,c,k;


    public static void R_fx(){

        int max = 0;

        for(int i=1;i<=row;i++){
            ArrayList<Order> ch = new ArrayList<>();
            int[] cnt = new int[101];
            for(int j=1;j<=col;j++){
                cnt[arr[i][j]]++;
            }

            for(int z=1;z<=100;z++){
                if(cnt[z]>0){
                    ch.add(new Order(z,cnt[z]));
                }
            }

            Collections.sort(ch);

            int len = ch.size() * 2;
            max = Math.max(max,len);

            for(int j=1;j<=50;j++){
                if(j<=ch.size()){
                    arr[i][j*2-1] = ch.get(j-1).num;
                    arr[i][j*2] = ch.get(j-1).total;
                }else{
                    arr[i][j*2-1] = 0;
                    arr[i][j*2] = 0;
                }


            }

        }

        col = max;

    }
    public static void C_fx(){
        int max = 0;

        for(int i=1;i<=col;i++){
            ArrayList<Order> ch = new ArrayList<>();
            int[] cnt = new int[101];
            for(int j=1;j<=row;j++){
                cnt[arr[j][i]]++;
            }

            for(int z=1;z<=100;z++){
                if(cnt[z]>0){
                    ch.add(new Order(z,cnt[z]));
                }
            }

            Collections.sort(ch);
            int len = ch.size() * 2;
            max = Math.max(max,len);

            for(int j=1;j<=50;j++){
                if(j<=ch.size()){
                    arr[j*2-1][i] = ch.get(j-1).num;
                    arr[j*2][i] = ch.get(j-1).total;
                }else{
                    arr[j*2-1][i] = 0;
                    arr[j*2][i] = 0;
                }


            }

        }
        row = max;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[101][101];

        for(int i=1;i<=3;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=3;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        row = 3;
        col = 3;

        int sec = 0;


            while(sec<=100){
                if(arr[r][c] == k) break;
                if(row>=col){
                    R_fx();
                }else{
                    C_fx();
                }
                sec++;
            }

            if(arr[r][c] == k){
                System.out.println(sec);
            }else{
                System.out.println("-1");
            }


    }
}
