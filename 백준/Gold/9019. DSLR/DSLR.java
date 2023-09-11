
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while( T --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[10000]; // BFS 탐색의 방문 여부 체크
            String[] command = new String[10000]; // 정답 명령어를 담는 배열


            q.add(A); // a를 큐에 담고
            visited[A] = true; // 방문 표시한다
            Arrays.fill(command,  "");


            while (!q.isEmpty() && !visited[B]) {
                int now = q.poll(); // 큐에서 값을 뺀다 = 현재 탐색 위치

                int D = (2 * now) % 10000;
                int S = 0;
                if(now == 0){
                    S = 9999;
                }else{
                    S = now-1;
                }

                int L = (now % 1000) * 10 + now / 1000;
                int R = (now % 10) * 1000 + now / 10;
                if (!visited[D]) {
                    q.add(D); // 큐에 넣는다
                    visited[D] = true; // 방문처리한다
                    command[D] = command[now] + "D"; // 명령어를 추가한다
                }

                if (!visited[S]) {
                    q.add(S);
                    visited[S] = true;
                    command[S] = command[now] + "S";
                }

                if (!visited[L]) {
                    q.add(L);
                    visited[L] = true;
                    command[L] = command[now] + "L";
                }

                if (!visited[R]) {
                    q.add(R);
                    visited[R] = true;
                    command[R] = command[now] + "R";
                }
            }
            sb.append(command[B]);
            sb.append("\n");
        }

        System.out.print(sb);



    }
}
