// 1. Write a java program to check the given number is prime or composite.

import java.util.Scanner;

public class program1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num,flag = 0;
        System.out.println("Enter the number : ");
        num = scan.nextInt();


        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(num + " is compostive .");
        }else{
            System.out.println(num + " is prime .");
        }

    }
}