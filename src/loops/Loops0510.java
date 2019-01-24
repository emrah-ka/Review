package loops;

public class Loops0510 {
    /*
    (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.

     */

    public static void main(String[] args) {

        for (int i = 100; i <1001 ; i++) {
            if(i%5==0&&i%6==0){
                System.out.print(i+", ");
            }
        }







    }


}
