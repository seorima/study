
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n,l,r;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static ArrayList<Node> list;

    public static int BFS(int x, int y){

        Queue<Node> q = new LinkedList<>();
        list = new ArrayList<>();

        q.offer(new Node(x, y));
        list.add(new Node(x, y));
        visited[x][y] = true;

        int sum = arr[x][y];
        while(!q.isEmpty()) {
            Node current = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    int diff = Math.abs(arr[current.x][current.y] - arr[nx][ny]);
                    if(l <= diff && diff <= r) {
                        q.offer(new Node(nx, ny));
                        list.add(new Node(nx, ny));
                        sum += arr[nx][ny];
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return sum;
    }

    public static int move() { //더 이상 인구이동이 일어나지 않을 때까지 반복
        int result = 0;
        while(true) {
            boolean isMove = false;
            visited = new boolean[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(!visited[i][j]) {
                        int sum = BFS(i, j); //bfs탐색으로 열릴 수 있는 국경선 확인 하며 인구 이동할 총 인구수 반환
                        if(list.size() > 1) {
                            changePopulation(sum); //열린 국경선 내의 노드들 인구 변경
                            isMove = true;
                        }
                    }
                }
            }
            if(!isMove) return result;;
            result++;
        }
    }

    public static void changePopulation(int sum) {
        int avg = sum / list.size();
        for(Node n : list) {
            arr[n.x][n.y] = avg;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(move());



    }
}
