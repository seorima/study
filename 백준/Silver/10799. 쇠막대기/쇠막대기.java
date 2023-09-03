
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> s = new Stack<>();
        int result = 0; // 잘려진 막대 개수
        int stick = 0; // 막대 개수
        int laser = 0; // 레이저 개수
        boolean ch = false;

        for(int i=0;i<str.length();i++){

            char tmp = str.charAt(i);
            if(tmp == '(') s.push(tmp);
            else{
                s.pop();
                if(str.charAt(i-1) == '(') result +=s.size();
                else result++;
            }

//            char tmp = str.charAt(i);
//            if(tmp == '('){
//                if(str.charAt(i+1) == ')'){ //레이저일 경우
//                    laser ++;
//                    result += stick * (laser+1);
//                    ch = true;
//
//                }else{
//                    s.push(tmp);
//                    stick++;
//                }
//
//            }else{ // tmp==)
//                if(ch){
//                    ch=false;
//                    if(result==0){
//                        laser--;
//                    }
//
//                }else{
//                    stick--;
//                }
//            }
        }

        System.out.println(result);

    }
}
