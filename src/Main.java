// Design and implement an application that reads
// from the user a group of numbers.  Store those
// numbers into an array.  Output the array of numbers.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int arraySize = 0;
        boolean validation = false;
        System.out.println("How many numbers do you want to output?");
        arraySize = scan.nextInt();
        int[] numArray = new int[arraySize];
        System.out.println("Input a number (0-50) for the following:");
        for (int i = 1; i < arraySize+1; i++)
        {
            validation = false;
            int numToAdd = 0;
            System.out.print( i + ": ");
            while (!validation)
            {
                numToAdd = scan.nextInt();
                if (numToAdd <= 50 && numToAdd >= 0)
                {
                    numArray[i - 1] = numToAdd;
                    validation = true;
                } else
                {
                    System.out.println("Try again. It has to be a number 0-50.");
                    System.out.print(i + ": ");
                }
            }
        }
        System.out.println("-----Output-----");
        for (int i = 0; i < numArray.length; i++)
        {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("\nFin.");

    }
}