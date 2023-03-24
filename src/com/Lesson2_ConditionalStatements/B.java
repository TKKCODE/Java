package com.Lesson2_ConditionalStatements;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        
        System.out.println("From Lesson2 B.java");
        
        if (true) {
            System.out.println("Excute This Line");
        }

        if(!true){
            System.out.println("Try To Execute This Line");
        }
        else{
            System.out.println("Hey! I am from else block.");
        }

        Scanner scan = new Scanner(System.in);
        int a;
        do{
            
            System.out.println("Enter any positive Integer:- ");
            a = scan.nextInt();
            switch (a) {
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;            
                case 3:
                    System.out.println("It's Wednessday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("It's Firday");
                    break;            
                case 6:
                    System.out.println("It's Saturday");
                    break;
                case 7:
                    System.out.println("It' Holiday");
                default:
                    System.out.println("Out My Memory");
                    break;
            }
        }while(a <= 7);

        scan.close();
    }
}
