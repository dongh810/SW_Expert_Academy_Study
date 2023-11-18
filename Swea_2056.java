package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swea_2056 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(in.readLine());


        for (int i = 1; i <= time; i++) {
            int result = 0;
            String s = in.readLine();
            String year = s.substring(0, 4);
            String month = s.substring(4, 6);
            String day = s.substring(6, 8);
            result = validate(month, day);
            if (result == 0) {
                System.out.println("#"+i+" "+year + "/" + month + "/" + day);
            } else if (result == -1) {
                System.out.println("#"+i+" "+result);
            }
        }

    }

    public static int validate(String month, String day) {
        int validateNum = -1;
        int dayNum = Integer.parseInt(day);
        if (month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07") || month.equals("08") || month.equals("10") || month.equals("12")) {
            if (dayNum >= 1 && dayNum <= 31) {
                validateNum = 0;
            } else validateNum = -1;
        } else if (month.equals("04") || month.equals("06") || month.equals("09") || month.equals("11")) {
            if (dayNum >= 1 && dayNum <= 30) {
                validateNum = 0;
            } else validateNum = -1;
        } else if (month.equals("02")) {
            if (dayNum >= 1 && dayNum <= 28) {
                validateNum = 0;
            } else validateNum = -1;
        }
        return validateNum;
    }
}
