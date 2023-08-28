
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Line implements Comparable<Line>{
    public int s;
    public int e;

    Line(int s, int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Line o) {
        return this.s-o.s;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Line> arr = new ArrayList<>();
        int[] ch = new int[n];
        int answer = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(new Line(a,b));

        }
        Collections.sort(arr);

//        for(int i=1;i<n;i++){
//            int min = arr.get(i).e;
//            for(int j=i-1;j>=0;j--){
//                if(min<arr.get(j).e && ch[j]==0){
//                    ch[j] = 1;
//                    answer++;
//                }
//            }
//        }

        for(int i=0;i<n;i++){
            ch[i] = 1;
            for(int j=0;j<i;j++){
                if(arr.get(i).e>arr.get(j).e){
                    ch[i] = Math.max(ch[i],ch[j]+1);

                }
            }

        }
        int max = 0;
        for(int x : ch){
            max = Math.max(max,x);
        }

        System.out.println(n-max);


    }
}
