
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] ch;
    static int min = Integer.MAX_VALUE;
    public void Soccer(int L,int start){
        if(L==n/2){
            dif();
            return;

        }else{
            for(int i=start;i<n;i++){
                if(!ch[i]) {
                    ch[i] = true;	// 방문으로 변경
                    Soccer(L + 1, i + 1);	// 재귀 호출
                    ch[i] = false;	// 재귀가 끝나면 비방문으로 변경
                }
            }

        }
    }

    public static void dif(){
        int team_start = 0;
        int team_link = 0;

        for (int i = 1; i < n ; i++) {
            for (int j = i + 1; j <=n; j++) {
                // i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스
                if (ch[i] == true && ch[j] == true) {
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                }
                // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
                else if (ch[i] == false && ch[j] == false) {
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }

        int result= Math.abs(team_start-team_link);

        if (result == 0) {
            System.out.println(result);
            System.exit(0);
        }

        min = Math.min(result, min);


    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        ch = new boolean[n+1];

        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T.Soccer(0,1);

        System.out.println(min);

    }
}
