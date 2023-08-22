
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] ch;
    static int[][] arr;
    public static void sudoku(int row,int col){
        if(col == 9){
            col = 0;
            sudoku(row+1,col);
            return;
        }
        if(row == 9){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }

            System.out.println(sb);
            System.exit(0);
        }

         if(arr[row][col]==0){
             for(int i=1;i<=9;i++){
                 if(check(row,col,i)){
                     arr[row][col] = i;
                     sudoku(row,col+1);
                 }
             }
             arr[row][col] = 0;   //?
             return;


         }

         sudoku(row,col+1);

    }

    public static boolean check(int raw,int col, int val){
        for(int i=0;i<9;i++){
            if(arr[raw][i] == val){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(arr[i][col] == val){
                return false;
            }
        }

        for(int i=(raw/3)*3 ; i<(raw/3)*3 + 3 ; i++){
            for(int j = (col/3)*3 ; j<(col/3)*3 + 3; j++){
                if(arr[i][j]  == val){
                    return false;
                }
            }
        }

        return true;

    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[9][9];
        ch = new int[10];

        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0,0);


    }
}
