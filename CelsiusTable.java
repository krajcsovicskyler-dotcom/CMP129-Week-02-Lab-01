public class CelsiusTable {
    public static void main(String args[])
    {
        double c = 0;
        System.out.println("Fahrenheit:    Celsius:    ");
        for(int f = 0; f<21; f++)
        {
            c = celsius(f);
            if(f<10)
            {
                System.out.printf("    %d     =     %.2f%n", f, c);
            }
            else
            {
                System.out.printf("    %d    =     %.2f%n", f, c);
            }
        }//ends for loop
    }//ends main

    public static double celsius(int f)
    {
        double celsius = 5.0/9.0 * (f - 32);
        return celsius;
    }//ends celsius conversion method
}//ends class
