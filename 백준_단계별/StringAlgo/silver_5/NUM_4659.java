package silver_5;

import java.io.*;

public class NUM_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String test = bufferedReader.readLine();
            if (test.equals("end"))
                break;
            bufferedWriter.write('<' + test);
            if (isValid(test))
                bufferedWriter.write("> is acceptable.\n");
            else
                bufferedWriter.write("> is not acceptable.\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

    static boolean isValid(String str) {
        boolean hasVowel = isVowel(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1))
                if (!(str.charAt(i) == 'e' || str.charAt(i) == 'o'))
                    return false;
            // 자음 -> 모음, 모음 -> 자음
            if (isVowel(str.charAt(i)) != isVowel(str.charAt(i - 1))) {
                hasVowel = true;
                count = 1;
            } // 모음 -> 모음, 자음 -> 자음
            else {
                count += 1;
                if (count >= 3)
                    return false;
            }
        }
        return hasVowel;
    }

    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
