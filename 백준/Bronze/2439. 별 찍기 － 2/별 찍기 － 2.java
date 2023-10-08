
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

      for(int k=1;k<=n;k++){
          for(int i=n-k;i>0;i--){
              System.out.print(" ");
          }
          for(int j=1;j<=k;j++){
              System.out.print("*");
          }
          System.out.println();
      }


    }
}
