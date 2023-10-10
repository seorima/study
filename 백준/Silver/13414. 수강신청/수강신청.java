
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i=0;i<l;i++){
            String num = br.readLine();
            if(set.contains(num)){
                set.remove(num);
            }
            set.add(num);
        }

        int index = 0;
        for(String x : set){
            index++;
            System.out.println(x);
            if(index == k) break;
        }


    }

}
