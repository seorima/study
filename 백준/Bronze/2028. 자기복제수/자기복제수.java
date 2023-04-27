import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<t;i++) {
			
		boolean ischeck = true;
		
			int n = Integer.parseInt(br.readLine());
			int num = n*n;
			
			while(n !=0) {
				int a = n % 10;
				int b = num % 10;
				
				if(a != b) {
					ischeck = false;
					sb.append("NO\n");
					break;
					
				}
					n /=10;
					num /=10;
				
			}
			
			if(ischeck) {

				sb.append("YES\n");
			}
			
			
			
		}
		
		System.out.println(sb);

	}

}
