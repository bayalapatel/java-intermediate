// 11. Write a java program to the given number is armstrong or not.
// [hint : a^3 + b^3 + c^3 = abc]

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = scan.nextInt();

        int reverse = reverse(num);

        if(num == reverse){
            
        }



    }
    static int reverse(int num){
        int remainder , reverse = 0;

        while(num != 0){
            remainder = num % 10;
            reverse = reverse*10 + remainder;
            num = num / 10 ; 
        }

        return reverse;
    }
}
