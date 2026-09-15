import java.util.Scanner;
public class KineticEnergy {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double m = 0; //kilograms
        double v = 0; //meters per second
        System.out.println("This program will provide the amount of kinetic energy an object has rounded to the nearest hundredth.");
        System.out.println("Please enter your objects mass in kilograms.");
        m = input.nextDouble();
        System.out.println("Please enter your objects velocity in meters per second.");
        v = input.nextDouble();
        double KE = kineticEnergy(m, v);
        System.out.printf("Your object has a kinetic energy of %.2f joules", KE);
    }//ends main

    public static double kineticEnergy(double m, double v)
    {
        double mass = m;
        double velocity = v;
        double kineticEnergy = .5 * (m * Math.pow(v, 2));
        return kineticEnergy;
    }//ends KE function
}//ends class
