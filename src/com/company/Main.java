package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int FirstArray[][] = new int[3][3];
        int SecondArray[][] = new int[3][3];
        int sum[][] = new int[3][3];

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first matrix value");
        for (int i = 0; i < 3; i++) {
            {
                for (int j = 0; j < 3; j++)
                    FirstArray[i][j] = obj.nextInt();

            }
        }

        System.out.println("Enter the second value of matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                SecondArray[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = FirstArray[i][j] + SecondArray[i][j];
            }
        }

        System.out.println("sum of two matrix");
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+"   ");
            }

            System.out.println();
        }









            }
}