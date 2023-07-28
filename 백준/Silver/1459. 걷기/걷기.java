
import java.util.Scanner;

public class Main {
//    static int end_x,end_y;
//    static int min = Integer.MAX_VALUE;
//    public int solution(int x, int y){
//        if(x == end_x-1 && y == end_y-1){
//
//        }else{
//
//        }
//
//        return min;
//    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        long w = sc.nextInt();
        long s = sc.nextInt();
        long case1,case2,case3;

         case1 = (x+y)*w;
        if((x+y) % 2 == 0) {
             case2 = Math.max(x,y)*s;
        }else{
             case2 = (Math.max(x,y)-1)*s+w;
        }
        case3 =(Math.min(x, y))*s+(Math.abs(x-y))*w;

        System.out.println(Math.min(case1, Math.min(case2, case3)));






    }
}
