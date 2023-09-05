
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int n,k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int len = n-k;

        Stack<Character> s = new Stack<>();
        String str = br.readLine();

        for(int i=0;i<n;i++){
            char x = str.charAt(i);
            if(!s.isEmpty()){
                while(!s.isEmpty() && s.peek()<x && k>0){
                    s.pop();
                    k--;
                }

            }
            s.push(x);
        }



        while(true){
            if(s.size()== len) break; // 왜 지정을.. ㅜ?
            s.pop();
        }

        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println(sb.reverse());

    }
}
