package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Angiv tallet du vil finde kvadratroden af: ");
        double a = scanner.nextDouble();
        double x = a/2;
        double x1 = (x+a/x)/2;
        boolean exit = false;

        while(!exit) {
            x = x1;
            x1 = (x + a / x) / 2;

                if ((x-x1)+1<1.0001){
                    System.out.println(x);
                    System.out.println(x1);
                    exit = true;

            }

            }
        }






        }




