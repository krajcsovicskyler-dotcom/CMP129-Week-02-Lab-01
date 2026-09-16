/*Kyler Krajcsovics
26FA15
Week 2
Lab 3
9/15/26
*/
import java.util.Scanner;
public class FutureValue {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double p = 0;
        double i = 0;
        int t = 0;
        System.out.println("This program will calculate the future value of money earning compound interest in a savings account.");
        //this section prompts and collects user input
        System.out.println("Enter the present value of the account.");
        p = input.nextDouble();
        System.out.println("Enter the monthly interest rate of the account as a decimal.");
        i = input.nextDouble();
        System.out.println("Enter the nubmer of months you plan to leave the money in the account.");
        t = input.nextInt();
        //calls the function to make fv equal its return value
        double fv = futureValue(p, i ,t);
        //print statement formatted to two decimal points
        System.out.printf("The future value of the money in this account is $%.2f", fv);
    }//ends main

    public static double futureValue(double p, double i, double t)
    //this function takes the present value, interest, and months as arguments to use in the future value formula
    {
        double f = p * Math.pow(1 + i, t);//math.pow to raise 1+i to the power of t
        return f;//returns future value
    }//ends futureValue method
}//ends class