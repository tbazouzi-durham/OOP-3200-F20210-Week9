/**
 * @author Taylor Bazouzi 100579090
 * @date   November 11, 2020
 *
 */
package ca.durhamcollege;
import java.util.Scanner;

public class Main
{
    /**
     * This method gets a string from the console
     * @param prompt a friendly message to user
     * @return the value from the console
     */
    public static <T> T getConsoleInput(String prompt)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        return (T) console.nextLine();
    }

    /**
     * Prints the log to the console
     * @param log string array of input lines
     */

    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);

        }

    }

    /**
     * Entry point for application
     * @param args default argument
     */

    public static void main(String[] args)
    {
        String[] log = new String[Config.NUM_OF_STRINGS];

        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            log[i] = getConsoleInput("enter your info: ");

        }
        printLog(log);
    }
}
