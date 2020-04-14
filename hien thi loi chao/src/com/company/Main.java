package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.printf("Hiển thị lời chào: ");
        String name= in.nextLine();

        System.out.println("Your name is : "+name);
    }
}
