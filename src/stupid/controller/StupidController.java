package stupid.controller;


import java.util.Scanner;

public class StupidController 
{
	private Scanner readKeyboardInput;
	
	public StupidController() 
	{
		readKeyboardInput = new Scanner(System.in);
	}
	
	 public void start()
	 {
		askQuestions();
	}
	 private void askQuestions()
	 {
		 waitSentence("Hi!");
		 waitSentence("My name is Professor Oak!");
		 waitSentence("What is your name?");
		 String userInput = readKeyboardInput.nextLine();
		 waitSentence("Your name is " + userInput + "?");
	 }
	 
	 public void waitSentence(String sentence)
	 {
		 char[] chars = sentence.toCharArray();
		 for(char c : chars)
		 {
			 try {
				Thread.sleep(65);
			} catch (InterruptedException e) 
			 {
				e.printStackTrace();
			}
			 System.out.print(c);
		 }
		 System.out.println("");
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			 {
				e.printStackTrace();
			}
	 }
}
