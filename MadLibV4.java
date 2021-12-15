import java.util.Scanner;

public class MadLibV4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String firstChange = "";
        int firstChangeFirstLocation = 0;
        int firstChangeSecondLocation = 0;
        String secondChange = "";
        int secondChangeFirstLocation = 0;
        int secondChangeSecondLocation = 0;
        String thirdChange = "";
        int thirdChangeFirstLocation = 0;
        int thirdChangeSecondLocation = 0;
        
            //stores all of the locations changes that need to be made to the mad lib.


        String userInput1;
        String userInput2;
        String userInput3;
        
             //stores all of the user input that will change the mad lib.


        String lib = "The sussy <noun> went up to the <adjective> crewmate, and <past-tense verb> him.";
           
            //the mad lib itself is stored here, and will be edited seperately later


        firstChangeFirstLocation = lib.indexOf("<") + 1;
        firstChangeSecondLocation = lib.indexOf(">");
            
            //gets the locations of the first arrows and stores them to a variable
        
        firstChange = lib.substring(firstChangeFirstLocation, firstChangeSecondLocation);
           
            //based on the locations of the arrows, the string inside is stored to a new variable.
        
        System.out.print("Input " + firstChange + ": ");
            
            //asks the user for the first change
       
        userInput1 = scanner.nextLine();

        
        secondChangeFirstLocation = lib.indexOf("<", firstChangeFirstLocation + 1) + 1;
        secondChangeSecondLocation = lib.indexOf(">", firstChangeSecondLocation + 2);
        secondChange = lib.substring(secondChangeFirstLocation, secondChangeSecondLocation);
        System.out.print("Input " + secondChange + ": ");
        userInput2 = scanner.nextLine();

        thirdChangeFirstLocation = lib.indexOf("<", secondChangeFirstLocation + 1) + 1;
        thirdChangeSecondLocation = lib.indexOf(">", secondChangeSecondLocation + 2);
        thirdChange = lib.substring(thirdChangeFirstLocation, thirdChangeSecondLocation);
        System.out.print("Input " + thirdChange + ": ");
        userInput3 = scanner.nextLine();



        lib = lib.replaceAll("<", "");
        lib = lib.replaceAll(">", "");

            //removes all of the arrows in the text

        lib = lib.replaceFirst(firstChange, userInput1);
        lib = lib.replaceFirst(secondChange, userInput2);
        lib = lib.replaceFirst(thirdChange, userInput3);

             //makes the changes to the mad lib based on the user's inputs, which were stored to variables before

        System.out.println(lib);

             //prints out the finished mad lib.

    }
}