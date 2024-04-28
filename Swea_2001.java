package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea_2001 {
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(in.readLine().trim());  // 총 시도 회수
        sb = new StringBuilder();

        for (int i = 0; i < max; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine().trim());
            int N = Integer.parseInt(st.nextToken());   // 파리 영역
            int M = Integer.parseInt(st.nextToken());   // 파리채 영역

            int[][] narray = new int[N][N]; // 영역에 존재하는 파리수
            int[][] marray = new int[M][M]; // 파리채 내리치는 영역
            int kill = 0;   // 지금까지 파리채 영역중 제일 많이 죽은 파리의 값

            // 영역에 존재하는 파리수 다 받아옴
            for (int j = 0; j < N; j++) {
                StringTokenizer nums = new StringTokenizer(in.readLine().trim());
                for (int k = 0; k < N; k++) {
                    narray[j][k] = Integer.parseInt(nums.nextToken());
                }
            }
            // 파리채 영역을 구해서 계산 N N+1 이거를 M-1까지로 계산
            for (int j = 0; j < N-M+1; j++) {
                for (int k = 0; k < N-M+1; k++) {
                    int sum = 0;    // 파리채 영역에 있는 파리수를 더한 값
                    // M x M 공간의 덧셈을 모두 구하는것
                    for (int x = 0; x < M ; x++) {
                        for (int y = 0; y < M; y++) {
                            sum += narray[j+x][k+y];
                        }
                    }
//                    틀렸던 부분
//                    for (int x = j-1; x < j+M-1 ; x++) {
//                        for (int y = k-1; y < k+M-1; y++) {
//                            sum += narray[x][y];
//                        }
//                    }
                    if(kill == 0 || kill < sum){
                        kill = sum;
                    }

                }
            }
            sb.append("#").append(i+1).append(" ").append(kill).append("\n");
        }
        System.out.println(sb);
    }
}

