package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập cân nặng(kg): ");
        double weight = in.nextDouble();
        System.out.print("Nhập chiều cao(cm): ");
        double height= in.nextDouble();

        double bmi = weight/Math.pow(height/100,height/100);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi <25.0 && bmi >=18.5){
            System.out.println("Normal");
        }else if(bmi>=25.0 && bmi <30.0){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obese");
        }
    }
}
