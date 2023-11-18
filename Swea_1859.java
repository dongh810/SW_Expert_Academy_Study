package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_1859 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(in.readLine());

        for (int i = 0; i < time; i++) {
            int n = Integer.parseInt(in.readLine());  //3
            long diff = 0;
            int max_value = 0;
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(in.readLine()); // 10 7 6
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] > max_value) { // 1
                    max_value = arr[j]; // 3
                }
                diff += max_value - arr[j]; // 1

            }
            System.out.printf("#%d %d\n", i + 1, diff);
        }
    }
}
