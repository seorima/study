
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Score implements Comparable<Score>{
    public String name;
    public int kor,eng,math;

    Score(String name, int kor, int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    @Override
    public int compareTo(Score o) {
        if(this.kor == o.kor) {
            // 국어점수가 같으면
            if(this.eng == o.eng) {
                // 영어점수도 같으면
                if(this.math==o.math) {
                    // 모든 점수가 같으면

                    return this.name.compareTo(o.name);
                }
                // 수학점수가 감소하는 순서로
                return o.math-this.math;
            }


            // 영어 점수가 증가하는 순서로
            return this.eng-o.eng;
        }
        // 국어 점수가 감소하는 순서로
        return o.kor-this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Score> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Score(name,a,b,c));

        }

        Collections.sort(arr);

        for(Score o : arr) System.out.println(o.name);

    }

}
