import java.util.Scanner;

public class in0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] result = new int[s];
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int x : arr){
            int pos=-1;
            for(int i=0;i<n;i++) if(x==result[i]) pos = i;

            if(pos==-1){
                for(int i=n-1;i>=1;i--){
                    result[i]=result[i-1];
                }
                result[0]=x;
            }
            else{
                for(int i=pos;i>=1;i--){
                    result[i]=result[i-1];
                }
                result[0]=x;
            }
        }

        for(int x: result) System.out.println(x);
        }

    }

