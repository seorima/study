
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static boolean[] check = new boolean[10]; // 0~9까지 check
    static int n;
    static char[] a = new char[10]; // 부등호는 최대 9개임
    static ArrayList list = new ArrayList<>();

    static boolean ck(char a, char b, char c) {
        if (c == '<') {
            if (a > b) {
                return false;
            }
        }
        if (c == '>') {
            if (a < b) {
                return false;
            }
        }
        return true;
    }

    static void DFS(int index, String num) {
        if (index == n + 1) {
            list.add(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (check[i])
                continue;
            if (index == 0 || ck(num.charAt(index - 1), (char) (i + '0'), a[index - 1])) {
                check[i] = true;
                DFS(index + 1, num + Integer.toString(i));
                check[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray()[0];
        }

        DFS(0, "");
        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

}
