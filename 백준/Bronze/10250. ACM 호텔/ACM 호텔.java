
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       int[][] arr;

       while(T -->0){
           st = new StringTokenizer(br.readLine());
           int h = Integer.parseInt(st.nextToken());
           int w = Integer.parseInt(st.nextToken());
           int n = Integer.parseInt(st.nextToken());

           arr = new int[h][w];

           if(n%h==0){
               System.out.println(h*100 + (n/h));
           }else{
               System.out.println((n%h)*100+((n/h)+1));
           }


       }

    }
}
