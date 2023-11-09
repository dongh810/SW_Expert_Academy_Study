package main;

import java.util.Scanner;

public class Swea_2072 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        String num = in.nextLine();
        for(int i = 0; i<time ; i++) {
            num = in.nextLine();
            String[] split = num.split(" ");
            int sum = 0;
            for(int j=0; j<10 ; j++) {
                if(Integer.parseInt(split[j]) % 2 != 0){
                    sum = sum + Integer.parseInt(split[j]);
                }
            }
            System.out.print("#"+(i+1));
            System.out.println(" "+sum);
        }
    }
}
