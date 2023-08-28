
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];
        int[] dy = new int[n];

        int answer = 0;
        int index = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        dy[0] = 1;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i] && dy[j]>max){
                    max = dy[j];
                }
            }
            dy[i] = max +1;
            if(answer < dy[i]){
                answer = dy[i];
                index = i;
            }
        }

        sb.append(answer+"\n");


//        for(int i=0;i<index;i++){
//            int start = arr[i];
//            result = new ArrayList<>();
//            result.add(start);
//            for(int j=i+1;j<=index;j++){
//                if(start<arr[j]){
//                    result.add(arr[j]);
//                    start = arr[j];
//                }
//            }
//
//            if(result.size()==answer) break;
//        }


//        for(int i=index;i>=0;i--){
//            if(dy[i]==answer){
//                result.add(arr[i]);
//                answer--;
//            }
//            if(answer==0) break;
//        }
//        Collections.sort(result);
//        for(int x : result){
//            sb.append(x + " ");
//        }

        Stack<Integer> s = new Stack<>();

        for(int i=n-1;i>=0 ; i--){
            if(answer == dy[i]){
                s.push(arr[i]);
                answer--;

            }
        }
        while(!s.isEmpty()){
            sb.append(s.pop() + " ");
        }


        System.out.println(sb);


    }
}
