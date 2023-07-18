
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
    public int x, y,z;

    Tomato(int x , int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {
    static int n,m,h;
    static int[][][] arr;
    static Queue<Tomato> q;

    static int[] dx = {-1,0,1,0,0,0};
    static int[] dy = {0,1,0,-1,0,0};
    static int[] dz = {0,0,0,0,1,-1};

    static int cnt=0;
    public static void BFS(){

        while(!q.isEmpty()){
            int len = q.size();
            for(int k=0;k<len;k++){
                Tomato tmp = q.poll();
                for(int i=0;i<6;i++){
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    int nz = tmp.z + dz[i];
                    if(nx>=1 && ny>=1 && nz>=1 && ny<=m && nx<=n && nz<=h && arr[nz][nx][ny] == 0){ //조건의 순서도... 중요하구나...?
                        arr[nz][nx][ny] = 1;
                        q.offer(new Tomato(nx,ny,nz));
                    }
                }

            }

            cnt++; // 하루치가 움직였으니까?

            if(check()){
                System.out.println(cnt);
                break;
            }
        }



        if(!check()){
            System.out.println("-1");
        }


    }

    public static boolean check(){
        for(int z=1;z<=h;z++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(arr[z][i][j] == 0){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        q= new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        h=sc.nextInt();
        arr = new int[h+1][n+1][m+1];

        for(int z=1;z<=h;z++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    arr[z][i][j] = sc.nextInt();
                    if(arr[z][i][j] ==1 ){
                        q.offer(new Tomato(i,j,z));
                    }
                }
            }
        }

        if(check()){
            System.out.println("0"); // 전부 익어있을경우 먼저 확인
        }else{
            BFS();
        }



    }
}
