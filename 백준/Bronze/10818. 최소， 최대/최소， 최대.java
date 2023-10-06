
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(Collections.min(list) + " " + Collections.max(list));


    }
}
