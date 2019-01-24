package loops;

public class Loops0507 {
    /*
    (Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
*/

    public static void main(String[] args) {

        int tuition = 10000;
        int tenYearsTuition=0;
        int fourYearsTuition=0;
        int tenYearsTotal=0;

        for(int i=0;i<10;i++) {
            tuition *= 1.05;
            if (i == 3) {
                fourYearsTuition = tuition;
            }
            tenYearsTuition = tuition;
            tenYearsTotal+=tenYearsTuition;
        }

        System.out.println("Tuition after 10 years is $"+tenYearsTuition);
        System.out.println("Tuition after 4 years is $"+fourYearsTuition);
        System.out.println("Total in 10 years is $"+tenYearsTotal );



    }




}
