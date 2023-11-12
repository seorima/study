
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int check = Integer.parseInt(st.nextToken());
            if(map.containsKey(check)){
                sb.append(map.get(check) + " ");
            }else{
                sb.append("0 ");
            }
        }

        System.out.print(sb);
    }
}
