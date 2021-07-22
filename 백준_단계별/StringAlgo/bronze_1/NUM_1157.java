package bronze_1;

import java.util.Scanner;

public class NUM_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] count = new int['z' - 'a' + 1];

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 'a' && temp <= 'z') {
                count[temp - 'a'] += 1;
            } else {
                count[temp - 'A'] += 1;
            }
        }

        int max_index=0;
        for (int i = 0; i < count.length; i++) {
            if (count[i]>count[max_index]){
                max_index=i;
            }
        }

        int num=0;
        for (int j : count) {
            if (j == count[max_index]) {
                num++;
            }
        }

        if (num != 1){
            System.out.println("?");
        }else{
            System.out.println((char) ('A'+max_index));
        }

    }
}
