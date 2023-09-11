
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static String Bomb(String str, String result){
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));

            if(s.size()>=result.length()){
                boolean ch = true;
                for(int j=0;j<result.length();j++){
                    if(s.get(s.size()-result.length()+j) != result.charAt(j)){
                        ch = false;
                        break;
                    }
                }

                if(ch){
                    for(int j=0; j<result.length();j++){
                        s.pop();
                    }
                }

            }
        }


        for(char x : s){
            sb.append(x);
        }

        if(sb.length()==0){
            return "FRULA";
        }else{
            return sb.toString();
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = br.readLine();

        System.out.println(Bomb(str,result));
    }
}
