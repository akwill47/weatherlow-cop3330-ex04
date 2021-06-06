package ex04.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 William Weatherlow
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
