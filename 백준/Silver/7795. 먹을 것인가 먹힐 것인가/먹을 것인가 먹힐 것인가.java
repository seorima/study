
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc = 0; tc<T ; tc++){
            int cnt = 0;

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }

            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr2);

                for(int i=0;i<n;i++){
                    int tmp =0;
                    int lt = 0;
                    int rt = m-1;

                    while(lt<=rt){
                        int mid = (lt+rt)/2;

                        if(arr1[i]>arr2[mid]){

                            lt=mid+1;
                            tmp=lt;

                        }else{
                            rt=mid-1;
                        }




                }
                    cnt += tmp;

            }


//            for(int i : arr1){
//                for(int j : arr2){
//                    if(i<=j) break;
//                    else{
//                        cnt++;
//                    }
//                }
//            }


            System.out.println(cnt);


        }

    }
}
