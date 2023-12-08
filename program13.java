// 13. Write a java program to print the fibonacci series.
// fibonacci series is 0,1,1,2,3,5,8,13,21

public class program13 {
    public static void main(String args[]){

        int first_num = 0, second_num = 1, next_num , n = 10;

        System.out.print(first_num + " " + second_num + " ");
        for(int i = 1 ; i <= n ; i++ ){
            next_num = first_num + second_num;
            System.out.print(next_num + " ");
            first_num = second_num;
            second_num = next_num;
        }

    }    
}
