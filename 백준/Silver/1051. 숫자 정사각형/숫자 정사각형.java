import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][m+1];
        int max = Integer.MIN_VALUE;

        int min = Math.min(n,m); //가로세로중에 작은거크기가 정사각형될수있는 최대 변의 길이

        for(int i=1;i<=n;i++){
            String str = sc.next();
            for(int j=0;j<m;j++){
                arr[i][j+1] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

//가로로 검사니까...행기준 처음으로 잡기
        for(int i=1;i<=min;i++){
            for(int k=1;k<=n+1-i;k++){  //정사각형 한변의 길이
                for(int j=1;j<=m+1-i;j++) { // 이동횟수,꼭짓점 시작.
                    if(arr[k][j] == arr[k][j+i-1] && arr[k][j] == arr[k+i-1][j] && arr[k][j] == arr[k+i-1][j+i-1]){
                        int tmp = i;
                        max = Math.max(max,tmp);
                    }



                }
            }
        }
//세로 검사..
        for(int i=1;i<=min;i++){
            for(int k=1;k<=m+1-i;k++){  //정사각형 한변의 길이
                for(int j=1;j<=n+1-i;j++) { // 이동횟수,꼭짓점 시작.
                    if(arr[j][k] == arr[j+i-1][k] && arr[j][k] == arr[j][k+i-1] && arr[j][k] == arr[j+i-1][k+i-1]){
                        int tmp = i;
                        max = Math.max(max,tmp);
                    }



                }
            }
        }


        System.out.println(max*max);





    }
}
