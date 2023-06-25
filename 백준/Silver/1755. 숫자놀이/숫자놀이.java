import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int tmp = m;
        int n=sc.nextInt();
        int k = n-m+1;
        int[] num = new int[k];
        String[] result = new String[k]; // 영어변경된값 넣기

        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0;i<k;i++){
            num[i]= tmp;
            tmp++;
        }

        for(int i=0;i<k;i++){
            if(num[i]<10) {
                result[i]=eng[num[i]];
            }else{
                result[i]= eng[num[i]/10] + " " + eng[num[i]%10];
            }

        }
        Arrays.sort(result);

        for(int i=0;i<k;i++){
            for(int j=0;j<10;j++){ //eng는 인덱스번호가 그 숫자임
                if(result[i].equals(eng[j])){
                    result[i]= String.valueOf(j);
                }
                else if(result[i].contains(" ")){
                    String check[] = result[i].split(" ");
                    String tmp2 ="";
                    for(int x=0;x<2;x++){
                        for(int y=0;y<10;y++){
                            if(check[x].equals(eng[y])){
                                tmp2 +=y;
                            }
                        }

                    }
                    result[i] = tmp2;
                }
            }
        }



  int[] answer = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<k;i++){
            if(i != 0 && i%10==0){
                System.out.println();
            }
            System.out.print(answer[i] + " ");
        }








    }
}
