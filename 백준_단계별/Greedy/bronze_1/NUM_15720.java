package bronze_1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_15720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int numOfBurger = Integer.parseInt(stringTokenizer.nextToken());
        int[] burgers = new int[numOfBurger];
        int min = numOfBurger;

        int numOfSide = Integer.parseInt(stringTokenizer.nextToken());
        int[] sides = new int[numOfSide];
        min = Math.min(min, numOfSide);

        int numOfSoda = Integer.parseInt(stringTokenizer.nextToken());
        int[] sodas = new int[numOfSoda];
        min = Math.min(min, numOfSoda);

        int origin = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numOfBurger; i++) {
            burgers[i] = Integer.parseInt(stringTokenizer.nextToken());
            origin += burgers[i];
        }
        Arrays.sort(burgers);

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numOfSide; i++) {
            sides[i] = Integer.parseInt(stringTokenizer.nextToken());
            origin += sides[i];
        }
        Arrays.sort(sides);

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numOfSoda; i++) {
            sodas[i] = Integer.parseInt(stringTokenizer.nextToken());
            origin += sodas[i];
        }
        Arrays.sort(sodas);

        int discount = 0;
        for (int i = 0; i < numOfBurger; i++) {
            if (i >= numOfBurger - min) {
                discount += burgers[i] * 0.9;
            }else{
                discount += burgers[i];
            }
        }
        for (int i = 0; i < numOfSide; i++) {
            if (i >= numOfSide - min) {
                discount += sides[i] * 0.9;
            }else{
                discount += sides[i];
            }
        }
        for (int i = 0; i < numOfSoda; i++) {
            if (i >= numOfSoda - min) {
                discount += sodas[i] * 0.9;
            }else{
                discount += sodas[i];
            }
        }

        bufferedWriter.write(origin + " " + discount);
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
