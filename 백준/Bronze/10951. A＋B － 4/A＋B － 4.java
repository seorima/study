
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();

        while(true){
            str = br.readLine();
            if(str == null) break;
            else{
                st = new StringTokenizer(str," ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a+b).append("\n");
            }

        }


        System.out.print(sb);

    }
}
