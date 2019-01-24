package loops;

import java.util.Scanner;

public class Loops0501 {

/*
    (Count positive and negative numbers and compute the average of numbers) Write
    a program that reads an unspecified number of integers, determines how many
    positive and negative values have been read, and computes the total and average of
    the input values (not counting zeros). Your program ends with the input 0. Display
    the average as a floating-point number. Here is a sample run:

    Enter an integer, the input ends if it is 0: 1 2 -1 3 0
    The number of positives is 3
    The number of negatives is 1
    The total is 5.0
    The average is 1.25

    Enter an integer, the input ends if it is 0: 0
    No numbers are entered except 0

 */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Pleas enter some numbers");
        String answer="";
        int counter=0;
        Double sum=0.0;
        int pozitiveNumbers=0;
        int negNumbers=0;
        int pozCounter=0;
        int negCounter=0;

        for(int i =0;i<10000;i++) {
            int x = input.nextInt();
            System.out.println("Do you have more numbers? ('Yes' or 'No'");
            answer=input.next();

            if(x>0){
                pozCounter++;
                counter++;
            }else if(x<0){
                negCounter++;
                counter++;
            }
            sum+=x;
            if(answer.equalsIgnoreCase("No")){
                break;
            }
            //System.out.println(i+" ");
        }

        System.out.println("the number of positives is "+pozCounter);
        System.out.println("the number of negative is "+negCounter);
        System.out.println("The total is "+sum);
        System.out.println("The average is "+(sum/counter));


    }

}
