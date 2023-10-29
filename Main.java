package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        int angka=100;
        System.out.println("No 1");
        for (int i = 1; i <= angka; i++) {
            if (i%15==0) {
                System.out.println("BIZZBUZZ");
            } else if(i%3==0){
                System.out.println("BIZZ");
            } else if (i%5==0) {
                System.out.println("BUZZ");
            }else System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("No 2");
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                if(j+1<i) {
                    System.out.print("_");
                } else System.out.print("");
            }
            for (int k = n-i+1; k <= i; k++) {
                System.out.print(2 * k - 1);
                if (k < i) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        for (int l = 2; l <= n-1; l++) {
            System.out.print(2 * l - 1);
            if (l < n-1) {
                System.out.print("_");
            }
        }

    }
}