import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str = new String[n];


//왜 틀리다는지 모르겠음
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }

        int len = str[0].length();
        char[] result = new char[len];




        if(n == 1){
            System.out.print(str[0]);
        }
        else{
            for(int i=0;i<n;i++){
                    String tmp = str[i];
                    for(int j=0;j<n;j++){
                        if(i != j) { // 자기자신 제외하고 검사
                            for(int k=0;k<len;k++){
                                if(tmp.charAt(k) == str[j].charAt(k) && result[k]!='?'){
                                    result[k]=tmp.charAt(k);
                                }else{
                                    if(len == 1){
                                        System.out.println("?");
                                        return;
                                    }
                                    result[k] = '?';
                                }
                            }
                        }
                    }


            }


            for(char x : result){
                System.out.print(x);
            }

        }





    }
}
