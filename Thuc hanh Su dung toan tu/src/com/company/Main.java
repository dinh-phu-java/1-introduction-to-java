package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println("Nhập chiều dài");
        double a = in.nextDouble();
        System.out.println("Nhập chiều rộng");
        double b= in.nextDouble();

        double  s = a*b;

        System.out.printf("Diện tích hình chữ nhật là : %.2f",s);
    }
}
