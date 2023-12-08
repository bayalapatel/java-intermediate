// 12. Write a java program to generate a random number between 1 and 100.
// [ Hint : int b = (int)(Math.random()*(max-min+1)+min);  ]

public class program12 {
    public static void main(String args[]){
        int min = 1 , max = 100;
        int random = Random(min, max);
        System.out.println("Random Number is " + random);
    }
    static int Random(int min , int max){

        int random = (int)(Math.random()*(max - min)+min);

        return random;
    }
}
