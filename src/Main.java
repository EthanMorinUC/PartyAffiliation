import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What political party are you affiliated with (Democrat, Republican, or Independent ~ First letter of each party name)?");
        String party = in.nextLine();
        if (party.equals("D"))
        {
            System.out.println("You are Affiliated with Democrat");
        }
        else if (party.equals("R"))
        {
            System.out.println("You are Affiliated with Republican");
        }
        else if (party.equals("I"))
        {
            System.out.println("You are Affiliated with Independent");
        }
        else
            System.out.println("You are affiliated with another party");
    }
}