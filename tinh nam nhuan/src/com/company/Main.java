package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("nhập năm:");
	    int year= in.nextInt();

	    if(year % 4==0 && year % 100!=0  ){
            System.out.printf("year %d là năm nhuận",year);
        }else if(year % 100 == 0 && year %400 !=0){
            System.out.printf("year %d không là năm nhuận",year);
        }else if(year %100 == 0 && year % 400 ==0){
            System.out.printf("year %d là năm nhuận",year);
        }



    }
}
