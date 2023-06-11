import java.util.Scanner;

public class Main {
    static int[] check;
    static String str;
    static int cnt;
    public static void solution(){
        check = new int[26];
        int num=0;
        boolean one = false;
        for(int j=0;j<str.length();j++) {
            check[str.charAt(j) - 97]++;
        }

        for(int k=0;k<26;k++){
            if(check[k]>1){ //연속된 애들 확인하는거
                int index = str.indexOf(k+97);
                for(int z=1;z<check[k];z++){
                    if(str.charAt(index) != str.charAt(index+z)) {
                        return;
                    }
                }

                one=true;
            }
            else if(check[k]==1){
                num++;
            }

        }
        if(one==true){
            cnt++;
//            System.out.println(str+"999");
        }


        if(num==str.length()){
            cnt++;
//            System.out.println(str+"단어한개씩");
        }


    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        cnt=0;
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            str=sc.next();
            T.solution();
        }

        System.out.print(cnt);

    }
}
