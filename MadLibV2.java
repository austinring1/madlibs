import java.util.Scanner;

public class MadLibV2
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

        String userInput1;
        String userInput2;
        String userInput3;


        String lib = "The sussy <noun> snuck up behind the <adjective> crewmate and <verb ending in ed> him.";
        
        firstChangeFirstLocation = lib.indexOf("<") + 1;
        firstChangeSecondLocation = lib.indexOf(">");
        
        firstChange = lib.substring(firstChangeFirstLocation, firstChangeSecondLocation);
        System.out.print("Input a " + firstChange + ": ");
        userInput1 = scanner.nextLine();
        lib = lib.replace(firstChange, userInput1);


        secondChangeFirstLocation = lib.indexOf("<", firstChangeFirstLocation + 1) + 1;
        secondChangeSecondLocation = lib.indexOf(">", firstChangeSecondLocation + 5);
        
        secondChange = lib.substring(secondChangeFirstLocation, secondChangeSecondLocation);
        System.out.print("Input a " + secondChange + ": ");
        userInput2 = scanner.nextLine();
        lib = lib.replace(secondChange, userInput2);

        thirdChangeFirstLocation = lib.indexOf("<", secondChangeSecondLocation + 1) + 1;
        thirdChangeSecondLocation = lib.indexOf(">", secondChangeSecondLocation + 1);
        
        thirdChange = lib.substring(thirdChangeFirstLocation, thirdChangeSecondLocation);
        System.out.print("Input a " + thirdChange + ": ");
        userInput3 = scanner.nextLine();
        lib = lib.replace(thirdChange, userInput3);

        lib = lib.replaceAll("<", "");
        lib = lib.replaceAll(">", "");

        System.out.println(lib);

    }
}