import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();

        array = new int[N + 1];
        int count = 0;

        int n = 1; // 공의 위치

        while (true) {

            array[n]++;

            if (array[n] == M)
                break;

            if (array[n] % 2 == 1) {
                n += L;

                if (n > N) {
                    n -= N;
                }

            } else {
                n -= L;
                if (n < 1) {
                    n += N;
                }
            }

            count++;

        }

        System.out.println(count);
        sc.close();
    }

}