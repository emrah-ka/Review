package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class loops0509 {
    /*
    (Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please specify the number of students: ");
        int totalStudent=input.nextInt();
        List<String> names = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        int highScore=0;
        String studentWithHighScore="";
        int secondHishScore=0;
        String secontStudent="";


        for(int i=0;i<totalStudent;i++){
            System.out.println("Please enter student number: ");
            number.add(input.nextInt());

            System.out.println("Please enter the name of student number: " +number.get(i));
            names.add(input.next());

            System.out.println("Please enter the score of student name: "+names.get(i));
            scores.add(input.nextInt());

        }

        for(int i=0;i<totalStudent;i++){
            if(highScore<scores.get(i)){
                highScore=scores.get(i);
                studentWithHighScore=names.get(i);
            }
            for (int j = 0; j < totalStudent; j++) {
                if(secondHishScore<scores.get(j)&&i!=j){
                    secondHishScore=scores.get(j);
                    secontStudent=names.get(j);

                }
            }

        }

        System.out.println();
        System.out.println("******************");
        System.out.println("The student with the highest score is "+studentWithHighScore +" score is: "+highScore);
        System.out.println("the student with the second-highest score is "+secontStudent+" score is: "+secondHishScore);






    }

}
