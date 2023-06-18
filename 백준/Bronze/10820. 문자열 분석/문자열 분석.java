import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";



        while((input = br.readLine()) != null){
            if (input.equals(""))
                break;
            int[] result = new int[4]; //결과 출력

            for(int i=0;i<input.length();i++){
                char word = input.charAt(i);
                if(word >= 97 && word <= 122){
                    result[0]++;
                }else if(word >= 64 && word <=90){
                    result[1]++;
                }else if(Character.isDigit(word)== true){
                    result[2]++;
                }

                result[3] = input.length()-input.replace(" ","").length();

            }
            for(int x : result){
                System.out.print(x + " ");
            }
            System.out.println();





        }





    }

}
