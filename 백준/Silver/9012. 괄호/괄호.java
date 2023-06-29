import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution(String n){
        String result = "NO";

        Stack<String> stack = new Stack<>();
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '('){
                stack.push("(");
            }else{
                if(stack.isEmpty()) return result;
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            result="YES";
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc = 0; tc<T; tc++){
            String str = sc.next();
            System.out.println(solution(str));
        }

    }
}
