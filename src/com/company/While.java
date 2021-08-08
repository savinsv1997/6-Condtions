package com.company;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int sum =0;
        while(n != 0){
            sum = sum + n;
           // num +=1 ;
        }
        System.out.println("enter the sum:"+ sum);

    }
}
