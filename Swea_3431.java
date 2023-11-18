package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_3431 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(in.readLine());

        for(int i=0; i<time;i++){
            StringTokenizer st = new StringTokenizer(in.readLine());
            int l = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            if(x<l){
                System.out.println("#"+(i+1)+" "+(l-x));
            }
            else if(x>=l && x<=u) {
                System.out.println("#"+(i+1)+" "+"0");
            }
            else if(x>u) {
                System.out.println("#"+(i+1)+" "+"-1");
            }
        }
    }
}
