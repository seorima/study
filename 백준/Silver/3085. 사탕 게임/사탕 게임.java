import java.util.Scanner;

public class Main {
    static int n;
    static char[][] arr;

    static int max ;


    public static void swap(int x1,int x2,int y1,int y2){
        char tmp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = tmp;

    }

    public static void find(int row, int col){


        for(int i=0;i<n;i++){
            int cnt =1;
            for(int j=0;j<n-1;j++){
                if(arr[i][j] == (arr[i][j+1])){
                    cnt++;
                }else{
                    cnt =1;
                }
                max = Math.max(max,cnt);
            }
        }

        for(int i=0;i<n;i++){
            int cnt =1;
            for(int j=0;j<n-1;j++){
                if(arr[j][i] == (arr[j+1][i])){
                    cnt++;

                }else{
                    cnt =1;
                }
                max = Math.max(max,cnt);
            }
        }


    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr = new char[n][n];
        max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0;i<n;i++){ // 행
            for(int j=0;j<n-1;j++){
                if(arr[i][j] != (arr[i][j+1])){
                    T.swap(i,i,j,j+1);
                    T.find(i,j);
                    T.swap(i,i,j+1,j);
                }
            }
        }

        for(int i=0;i<n;i++){ // 열
            for(int j=0;j<n-1;j++){
                if(arr[j][i] != (arr[j+1][i])){
                    T.swap(j,j+1,i,i);
                    T.find(j,i);
                    T.swap(j+1,j,i,i);
                }
            }
        }

        System.out.println(max);




    }
}
