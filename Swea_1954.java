package main;

import java.util.Scanner;

public class Swea_1954 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            Integer[] dx = {0, 1, 0, -1};
            Integer[] dy = {1, 0, -1, 0};

            for (int i = 1; i <= t; i++) {
                int n = in.nextInt();
                int a = 0;
                int b = 0;
                int k = 0;
                int[][] kira = new int[n][n];
                /*for(int l=0;l<n;l++){
                    for(int h=0;h<n;h++){
                        kira[l][h] = 0;
                    }
                }*/
                System.out.println("#"+i);
                for (int j = 1; j <= n * n; j++) {
                    kira[a][b] = j;
                    if (b+dy[k] == n || a+dx[k] == n || b+dy[k] == -1 || kira[a+dx[k]][b+dy[k]] > 0) {
                        if(k==3){
                            k=0;
                        }
                        else{
                            k++;
                        }
                    }
                    a = a + dx[k];
                    b = b + dy[k];
                }
                for(int z=0;z<n;z++){
                    for(int x = 0;x<n;x++){
                        System.out.print(kira[z][x]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }


            }
    }


}
