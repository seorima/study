
import java.util.*;
import java.io.*;


public class Main {

    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int[] ch;
    static int cnt;

    public static void DFS(int start){

        ch[start] = 1;
        for(int x : arr.get(start)){
            if(ch[x]==0){
                cnt++;
                DFS(x);
            }
        }

    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<=com;i++){
            arr.add(new ArrayList<Integer>());
        }
        ch= new int[com+1];
        StringTokenizer st;


        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        T.DFS(1);

        System.out.println(cnt);


    }
}
