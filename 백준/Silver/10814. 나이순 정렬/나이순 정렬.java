
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member>{
    int age;
    String name;
    int num;
    Member(int age, String name,int num){
        this.age = age;
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(Member o) {
        if(this.age == o.age) return this.num - o.num;
        return this.age-o.age;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Member> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            int b = i;
            arr.add(new Member(a,str,b));
        }
        Collections.sort(arr);

        for(Member x : arr){
            System.out.println(x.age + " " + x.name);
        }


    }
}
