package com.company;

import java.util.Scanner;

public class LinearEquationResolver  {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        System.out.println("Phương trình bậc nhất có dạng là ax+b=0");
        System.out.println("Nhập a: ");
        double a= in.nextDouble();
        System.out.println("Nhập b: ");
        double b= in.nextDouble();

        if (a ==0){
            System.out.println("Phương trình vô nghiệm!");
        }else{
            double rs = -b/a;
            System.out.printf("Nghiệm của chương trình là %.3f",rs);
        }

    }
}
