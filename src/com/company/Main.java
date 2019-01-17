package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        for (int num = 1; num <= 1000; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}


