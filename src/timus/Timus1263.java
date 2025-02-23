package timus;

import java.util.Scanner;

public class Timus1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[] votes = new int[N];
        for (int i = 0; i < M; i++) {
            int v = in.nextInt();
            votes[v - 1] += 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f%%\n", (double) votes[i] / M * 100);
        }
        in.close();
    }
}
