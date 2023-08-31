
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class  Main {
    public static String VPS(String str){
        Stack<Character> s = new Stack<>();

        for(int j=0;j<str.length();j++){
            char tmp = str.charAt(j);
            if(tmp == ')'){
                if(s.isEmpty()){
                    return "NO";
                }else{
                    s.pop();
                }

            }else{
                s.push(tmp);
            }
        }

        if(!s.isEmpty()){
            return "NO";
        }

        return "YES";
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String str = br.readLine();
            System.out.println(T.VPS(str));
        }

    }
}
