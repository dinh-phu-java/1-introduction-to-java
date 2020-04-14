package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n ;
	    do{
            System.out.println("Nhập tháng: ");
            n= in.nextInt();
        }while(n>=13 || n <=0);

	    switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("tháng %d có 31 ngày",n);
                break;
            case 2:
                System.out.printf("tháng %d có thể có 28 hoặc 29 ngày",n);
                break;
            case 4:
            case 6:
            case  9:
            case 11:
                System.out.printf("tháng %d có 30 ngày",n);
                break;
            default:
                System.out.println("không phải tháng");
                break;
        }

    }
}
