import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class in0506 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String input = sc.next();
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i == str.length(); i++){
            q.offer(str.charAt(i));

        }

        for(char x: input.toCharArray()){
            if(q.contains(x)){
                if(x!=q.poll()) answer="NO";
            }
        }

        if(!q.isEmpty()) answer="NO";

        System.out.println(answer);





    }
}
