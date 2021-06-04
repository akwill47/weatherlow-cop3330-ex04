package ex04.base;
import java.util.Scanner;
/*Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
*/
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        System.out.print("Enter a noun: ");
        String noun = myApp.readInput();
        System.out.print("Enter a verb: ");
        String verb = myApp.readInput();
        System.out.print("Enter an adjective: ");
        String adj = myApp.readInput();
        System.out.print("Enter an adverb: ");
        String adv = myApp.readInput();

        String finalOutput = myApp.finalOutput(noun,verb,adj,adv);
        myApp.displayOutput(finalOutput);
    }
    private String readInput(){
        return in.nextLine();
    }
    private String finalOutput(String noun, String verb, String adj, String adv){
        String output = String.format("Do you %s your %s %s %s? That's hilarious!",verb, adj, noun, adv);
        return output;
    }
    private void displayOutput(String output){
        System.out.println(output);
    }
}
