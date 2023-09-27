
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;


        while(T -->0){
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int i=0;i<str.length();i++){
                for(int j=0;j<n;j++){
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);

        }

    }
}
