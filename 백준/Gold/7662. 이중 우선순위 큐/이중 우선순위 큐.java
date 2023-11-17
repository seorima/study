
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            TreeMap<Integer,Integer> map = new TreeMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if(str.equals("I")){
                    map.put(num, map.getOrDefault(num,0)+1);
                }else{
                    if(map.isEmpty()) continue;
                    else{
                        int key = num == 1 ? map.lastKey() : map.firstKey();
                        if(map.get(key) ==1){
                            map.remove(key);
                        }else{
                            map.put(key, map.get(key)-1);
                        }
                    }

                }



            }

            if(map.size()==0){
                System.out.println("EMPTY");
            }else{
                System.out.println(map.lastKey() + " " + map.firstKey());

            }




        }
    }
}
