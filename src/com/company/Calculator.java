package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            //enter the operator
            System.out.print("Enter the operator: ");
            char ch = in.next().trim().charAt(0);
            if(ch =='+'||ch =='-'||ch =='*'||ch =='/'||ch =='%'){
                System.out.print("Enter the number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (ch == '+'){
                    ans = num1 + num2;
                }
                if (ch == '-'){
                    ans = num1 - num2;
                }
                if (ch == '*'){
                    ans = num1 * num2;
                }
                if (ch == '/'){
                    if(num2!=0) {
                        ans = num1 + num2;
                    }else{
                        System.out.println("not able to divide");
                    }
                }



            }else if(ch == 'x'|| ch =='X'){
                System.out.println("End the program");
                break;
            }else{
                System.out.println("Enter the correct operator");
            }
            System.out.println(ans);

        }




    }


}
