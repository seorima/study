
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        String[] arr = new String[n+m];

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for(int i=0;i<n+m;i++){
            arr[i]=sc.nextLine();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>1) {
                cnt++; // 듣도보도못한사람 개수세김
                result.add(arr[i]);
            }
        }


        Collections.sort(result);
        System.out.println(cnt + " ");
        for(String x : result){
            System.out.println(x + " ");
        }

    }
}
