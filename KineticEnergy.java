/*Kyler Krajcsovics
26FA15
Week 2
Lab 1
9/15/26
*/
import java.util.Scanner;
public class KineticEnergy {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double m = 0; //kilograms
        double v = 0; //meters per second
        System.out.println("This program will provide the amount of kinetic energy an object has rounded to the nearest hundredth.");
        //user input prompts
        System.out.println("Please enter your objects mass in kilograms.");
        m = input.nextDouble();
        System.out.println("Please enter your objects velocity in meters per second.");
        v = input.nextDouble();
        double KE = kineticEnergy(m, v);//initializes the variable KE as the return value of the method
        System.out.printf("Your object has a kinetic energy of %.2f joules", KE); //display statement formatted to the nearest hundredths place
    }//ends main

    public static double kineticEnergy(double m, double v) 
    //function that takes the arguments mass and velocity and uses them in the KE formula
    {
        double kineticEnergy = .5 * (m * Math.pow(v, 2));//math.pow to raise velocity to the second power
        return kineticEnergy;//returns KE
    }//ends KE function
}//ends class