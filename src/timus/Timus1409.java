package timus;

import java.util.Scanner;

public class Timus1409 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int G = in.nextInt();
        int L = in.nextInt();

        int N = G + L - 1;

        int notGarry = N - G;
        int notLarry = N - L;

        System.out.println(notGarry + " " + notLarry);

        in.close();
    }
}
