
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Top { // 탑에 대한 정보
    int num; // 탑의 번호
    int height; // 탑의 높이

    Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Top> s = new Stack<>();
        for(int i=1;i<=N;i++){
            int height = Integer.parseInt(st.nextToken());

            if(s.isEmpty()){
                System.out.print("0 ");
                s.push(new Top(i,height));
            }else{
                while(true){
                    if(s.isEmpty()){
                        System.out.print("0 ");
                        s.push(new Top(i,height));
                        break;
                    }

                    Top top = s.peek();
                    if(top.height>height){
                        System.out.print(top.num + " ");
                        s.push(new Top(i,height));
                        break;
                    }else{
                        s.pop();
                    }
                }

            }
        }



    }
}
