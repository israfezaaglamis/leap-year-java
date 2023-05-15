package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        int answer =0;

        Scanner input = new Scanner(System.in);

            System.out.print(" Bir yıl giriniz : ");
            year = input.nextInt();

            if (year % 4 == 0 && year % 100!=0 || year % 400==0){
                System.out.println(" Artık bir yıl girdiniz");
            }else{
                System.out.println(year+" Artık bir yıl değildir ");
            }
    }




}