package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double exRate=23.221;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usd= in.nextDouble();
        double vnd = usd*exRate;

        System.out.printf(" %.2f dollar có giá trị bằng %.3f VND!",usd,vnd);

    }
}
