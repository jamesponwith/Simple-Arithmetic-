package com.booya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("please enter a number");
            int userInput = scanner.nextInt();
            System.out.println(userInput);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
