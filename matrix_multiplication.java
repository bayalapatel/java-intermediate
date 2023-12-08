// java program to find the product of two matrices

import java.util.Scanner;

public class matrix_multiplication{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int product[][] = new int[3][3];
        
        System.out.println("Enter the first Matrix : ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ;j < 3 ; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the second Matrix : ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ;j < 3 ; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }

        // Product 
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ;j < 3 ; j++){
                product[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("Product = ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ;j < 3 ; j++){
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}