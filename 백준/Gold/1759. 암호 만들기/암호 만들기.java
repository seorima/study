
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int l,c;
    static String[] result;
    static boolean[] ch;
    public static void Word(int L,int start,String[] arr){

        if(L==l){
                if(check()){
                    for(String x : result){
                        System.out.print(x);
                }
                    System.out.println();
            }

        }else{
            for(int i=start;i<c;i++){
                if(ch[i]==false){
                    ch[i] = true;
                    result[L] = arr[i];
                    Word(L+1,i+1,arr);
                    ch[i] = false;
                }

            }
        }

    }

    public static boolean check(){
        int mo=0;
        int ja = 0;
        for(String x : result){
            if(x.equals("a") || x.equals("e") ||x.equals("i") ||x.equals("o") ||x.equals("u")){
                mo++;
            }else{
                ja++;
            }
        }

        if(mo>=1 && ja>=2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        String[] arr = new String[c];
        ch = new boolean[c];
        result = new String[l];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<c;i++){
            arr[i] = st.nextToken();
        }


        Arrays.sort(arr);

        Word(0,0,arr);



    }
}
