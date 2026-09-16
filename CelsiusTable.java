/*Kyler Krajcsovics
26FA15
Week 2
Lab 2
9/15/26
*/
public class CelsiusTable {
    public static void main(String args[])
    {
        double c = 0;
        System.out.println("Fahrenheit:    Celsius:    ");//table header
        System.out.println("-----------------------");
        for(int f = 0; f<21; f++)
            //this for loop uses f to run 20 times and stores itself each time to use as fahrenheit values 0-20
        //it prints with each run to get the celsius value for the corresponding number of loops
        //this works because the number of loops = the fahrenheit value
        {
            c = celsius(f);//calls the conversion method 
            if(f<10) //if statement that removes a space when f goes over double digits to keep the table aligned
            {
                System.out.printf("%d              %.2f%n", f, c);
                //prints fahrenheit and celsius values next to each other but spaced to match the table
            }
            else
            {
                System.out.printf("%d             %.2f%n", f, c);
            }
        }//ends for loop
    }//ends main

    public static double celsius(int f)//this function takes each fahrenheit value and converts it to celsius using the formula
    {
        double celsius = 5.0/9.0 * (f - 32);
        return celsius;//returns celsius
    }//ends celsius conversion method
}//ends class