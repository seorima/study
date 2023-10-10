
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            arr.add(br.readLine());
        }

        int cnt = 0;

        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(arr.contains(str)){
                cnt++;

            }

        }

        System.out.println(cnt);


    }

}
