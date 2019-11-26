package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int v = 3;
        BigInteger r = BigInteger.valueOf(1);
        for (int i = 1; i <=v ; i++) {
            r =  r.multiply(BigInteger.valueOf(i));
        }
        System.out.println(r);
    }
}
