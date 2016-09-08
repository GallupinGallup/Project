package stupid.controller;


import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public StupidController() {
		myName = "TylerGallup";
		readKeyboardInput = new Scanner(System.in);
	}
	
	 public void start()
	 {
		System.out.println("agg dduee");
		System.out.println(myName);
		askQuestions();
	}
	 private void askQuestions()
	 {
		 System.out.println("Whats you name?");
		 String userInput = readKeyboardInput.nextLine();
		 System.out.println("Your name is " + userInput + "?");
	 }
}
