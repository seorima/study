
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int max = Integer.MIN_VALUE;

        HashMap<Character,Integer> map = new HashMap<>();
        int lt = 0;
        int rt = 0;

        while(rt<str.length()){

            map.put(str.charAt(rt),map.getOrDefault(str.charAt(rt),0)+1);

            while(map.size()>n){
                    map.put(str.charAt(lt),map.getOrDefault(str.charAt(lt),0)-1);
                    if(map.get(str.charAt(lt))==0){
                        map.remove(str.charAt(lt));
                    }
                lt++;

            }
            max = Math.max(max,rt-lt+1);
            rt++;


        }

        System.out.println(max);





    }
}
