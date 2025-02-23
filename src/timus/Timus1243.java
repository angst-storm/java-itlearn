package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Timus1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger N = in.nextBigInteger();

        System.out.println(N.remainder(new BigInteger("7")));
        in.close();
    }
}
