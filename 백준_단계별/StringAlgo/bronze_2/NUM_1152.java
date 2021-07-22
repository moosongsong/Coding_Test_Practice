package bronze_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NUM_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
}
