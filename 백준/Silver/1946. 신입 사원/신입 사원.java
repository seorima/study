
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member>{
    public int x;
    public int y;

    Member(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Member o) {
        return this.x - o.x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());



        while(T --> 0){
            ArrayList<Member> arr = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            int max = Integer.MAX_VALUE;
            int cnt = 0;
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr.add(new Member(a,b));
            }
            Collections.sort(arr);


            for(Member ob : arr){
                if(ob.y<max){
                    max = ob.y;
                    cnt++;
                }

            }
            System.out.println(cnt);

        }




    }
}
