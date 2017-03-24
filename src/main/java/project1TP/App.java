package project1TP;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String fName;
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Please enter you first name: ");
        fName = keyIn.next();
        System.out.println( "Hello\t" + fName+"\t and welcome IntelliJ" );
    }
}
