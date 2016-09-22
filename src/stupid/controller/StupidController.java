package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private Scanner readKeyboardInput;
	boolean full;
	boolean name;
	boolean nameFriend;
	boolean pokemon;
	String userInput;
	String userInput1;

	public StupidController()
	{
		readKeyboardInput = new Scanner(System.in);
		full = true;
		name = true;
		nameFriend = true;
		pokemon = true;
	}

	public void start()
	{
		while (full)
		{
			begin();
			yourName();
			friendName();
			worldOfPokemon();
			pokedex();
			pokemon();
			end();
		}
	}

	private void begin()
	{
		waitSentence("\"Hi!\"");
		waitSentence("\"My name is Professor Oak!\"");
		name = true;
		nameFriend = true;
		pokemon = true;
	}

	private void yourName()
	{
		while (name)
		{
			waitSentence("\"What is your name?\"");
			String userInput = readKeyboardInput.nextLine(); // 1
			waitSentence("Your name is " + userInput + "?");

			userInput = readKeyboardInput.nextLine(); // 2
			if (userInput.equalsIgnoreCase("Yes"))
			{
				waitSentence("\"I like that name!\"");
				name = false;
			}
		}
	}

	private void friendName()
	{
		waitSentence("\"Is this your friend\"?");
		while (nameFriend)
		{
			waitSentence("\"What is his name?\"");

			String userInput = readKeyboardInput.nextLine();// 3
			waitSentence("\"His name is " + userInput + "?\"");
			userInput = readKeyboardInput.nextLine();// 4
			if (userInput.equalsIgnoreCase("Yes"))
			{
				waitSentence("\"Thats a nice name too\"");
				nameFriend = false;
			}
		}
	}

	private void worldOfPokemon()
	{

		waitSentence("\"Would you like to hear about the world of Pokemon?\"");
		userInput = readKeyboardInput.nextLine();// 5
		if (userInput.equalsIgnoreCase("Yes"))
		{
			waitSentence("\"Throughout this journey in the pokemon world you will\"");
			waitSentence("\"journey accross the world in search of these animals called");
			waitSentence("\"pokemon! Your goal will to be to catch them all!\"");
			waitSentence("\"Some poeple will use them as casual pets. Some people fight\"");
			waitSentence("\"with them for sport. Others will try to do evil things with\"");
			waitSentence("\"them. And some people use them for good. I hope you will\"");
			waitSentence("\"enjoy your journey and CATCH THEM ALL!\"");
			waitSentence("\"That reminde me...\"");

		} else
		{
			waitSentence("\"FINE YOU LAZY BUTT!\"");
		}
	}

	private void pokedex()
	{
		waitSentence("\"Would you like a pokedex? It helps you keep track of all the\"");
		waitSentence("\"pokemon you have caught or seen!\"");
		userInput = readKeyboardInput.nextLine();// 6
		if (userInput.equalsIgnoreCase("Yes"))
		{
			waitSentence("\"Ok! here you go!\"");
		} else
		{
			waitSentence("\"WAIT! I don't care what you think you are taking one if I have\"");
			waitSentence("\"to shove it down your throat\"");
			waitSentence("Will you willingly take it?");
			userInput = readKeyboardInput.nextLine();// 7
			if (userInput.equalsIgnoreCase("Yes"))
			{
				waitSentence("\"Here you go!\"");
			} else
			{
				waitSentence("It is shoved down your throat!");
			}
		}
	}

	private void pokemon()
	{

		while (pokemon)
		{
			waitSentence("\"What pokemon would you like?\"");
			userInput = readKeyboardInput.nextLine();// 8
			waitSentence("You would like a " + userInput);
			userInput1 = readKeyboardInput.nextLine();
			if (userInput1.equalsIgnoreCase("yes"))
			{
				waitSentence("\"Ok! Here is your " + userInput + "!\"");
				pokemon = false;
			} else
			{
				waitSentence("You sure? Ok!");
			}
		}
	}

	private void end()
	{
		waitSentence("\"Are you ready for your adventure?\"");
		userInput = readKeyboardInput.nextLine();// 9
		if (userInput.equalsIgnoreCase("Yes"))
		{
			waitSentence("\"Ok enjoy your Journey\"");
			full = false;
		} else
		{
			waitSentence("Do you want to change your charcter?");
			userInput = readKeyboardInput.nextLine();
			if (userInput.equalsIgnoreCase("Yes"))
			{
				full = false;
			} else
			{
				waitSentence("\"TOO BAD GET OUT OF MY OFFICE\"");
				waitSentence("You are forcefully ejected from the building!");
				full = false;
			}
		}
	}

	public void waitSentence(String sentence)
	{
		char[] chars = sentence.toCharArray();
		for (char c : chars)
		{
			try
			{
				Thread.sleep(50);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.print(c);
		}
		System.out.println("");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
