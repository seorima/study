import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean check = true;
        int[][] arr = new int[3][2];

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<arr[0][0];i++){
            int[][] result = new int[3][2]; //왜 여기안에서 선언을 하는걸까

            result[0][0] = i;
            result[0][1] = arr[0][0] - i ;

            result[1][1] = arr[2][1] - result[0][1];
            result[1][0] = arr[1][0] - result[1][1];
            result[2][0] = arr[0][1] - result[1][0];
            result[2][1] = arr[2][0] - result[2][0];

            if(result[0][0]>=0 && result[0][1]>=0 && result[1][0]>=0 && result[1][1]>=0 && result[2][0]>=0 && result[2][1]>=0 ){
                System.out.println(1);
                System.out.println(result[0][0]+" "+result[0][1]);
                System.out.println(result[1][0]+" "+result[1][1]);
                System.out.println(result[2][0]+" "+result[2][1]);
                check = false;
                break;
            }



        }

        if(check){
            System.out.println(0);
        }



//        result[0][0] = Math.min(arr[0][0],arr[1][1]);
//        arr[1][1] = arr[0][0]-result[0][0];
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//
//            }
//        }





    }
}
