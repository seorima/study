import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();


        for(int tc = 0; tc<T ; tc++){
            int cnt = 0;
            int sum = 0;
            String result = sc.next();
            for(int i=0;i<result.length();i++){
                if(result.charAt(i)== 'O'){
                    cnt++;
                    sum += cnt;
                }else{
                    cnt = 0;
                }
            }
            System.out.println(sum);



        }

    }
}
