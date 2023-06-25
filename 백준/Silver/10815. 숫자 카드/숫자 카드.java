import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }

            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            int tmp = arr2[i];
            System.out.print(T.binarySearch(arr1,n,tmp) + " ");
        }



        //시간초과 남. ㅠㅅㅠ
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        ArrayList<Integer> arr1 = new ArrayList<>();
//
//        for(int i=0;i<n;i++){
//            arr1.add(sc.nextInt());
//        }
//
//        int m = sc.nextInt();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//
//        for(int i=0;i<m;i++){
//            arr2.add(sc.nextInt());
//        }
//
//        int[] result = new int[m];
//
//        for(int i=0;i<m;i++){
//            if(arr1.contains(arr2.get(i))){
//                result[i]=1;
//            }else{
//                result[i]=0;
//            }
//        }
//
//        for(int x : result){
//            System.out.print(x + " ");
//        }
//
//
//
    }
}
