package bronze_5;

import java.math.BigInteger;
import java.util.Scanner;

public class NUM_1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger total = scanner.nextBigInteger();
        BigInteger per = scanner.nextBigInteger();
        System.out.println(total.divide(per));
        System.out.println(total.remainder(per));
    }
}
