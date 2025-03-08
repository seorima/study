
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int one = 0;
        int zero = 0;
        boolean flag = false;
        String result="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                zero++;
                if(i % 2!=1){
                    flag = true;
                    break;
                }
            }else if(str.charAt(i) == '1'){
                one++;
                if(i % 2!=0){
                    flag = true;
                    break;
                }
            }

        }

        if(flag){
            System.out.println("001");
        }else{
            for(int i=0;i<zero/2;i++){
                result += "0";
            }
            for(int i=0;i<one/2;i++){
                result += "1";
            }
            System.out.println(result);
        }
    }
}
