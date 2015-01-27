package com.test.games;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author SChandu
 * 
 */
public class NumberGuessingGameV7 {

	public static void main(String args[])
	{	
		
		info("Welcome to Play a Number-guessing game");
		info("Guess a number between 1 and 100");
		info("***Type 'ready' to begin the game / 'Yes' or 'End' to Finish the Game***");
		
		//call the play method with lower and upper thresold
		playGame(1,100);
		info("Thanks");
		
	}
	
	 
	  static void info(String msg)
	  {
		  System.out.println(msg);
	  }
	  
	  static int playGame(int lower_limit, int upper_limit)
	  {
			
			String temp=null; 
			
			
			 
			
			
			
			//decl scanner
			Scanner kbinput = new Scanner(System.in);
			int numberToGuess=upper_limit/2;
			//take a first guess
			info("Is the number: "+numberToGuess);
			info("If Yes, type 'end' or 'yes';if not Type either 'higher' or 'lower're to proceed with guess");
			
			 temp=kbinput.nextLine(); 
		
			
			 //if it is not yes or end
			 if(!temp.equalsIgnoreCase("yes") 
					|| !temp.equalsIgnoreCase("end") )
			 {
				
				//if it is equal to higher or lower				 
				while(temp.equalsIgnoreCase("higher") || temp.equalsIgnoreCase("lower"))
				{
					
					if(temp.equalsIgnoreCase("higher"))
					{
						//info("inside higher");
						lower_limit=numberToGuess;
						lower_limit++;
						
					}
					else if(temp.equalsIgnoreCase("lower"))
					{
						//info("inside lower");
						upper_limit=numberToGuess;
						upper_limit--;
					}
					
					//info("upper_limit:"+upper_limit);
					//info("lower_limit:"+lower_limit);
					
					numberToGuess=(upper_limit+lower_limit)/2;
					info("Is the number: "+numberToGuess );
					temp=kbinput.nextLine();
				}
				
			}
			 
			if(!temp.equalsIgnoreCase("higher") || !temp.equalsIgnoreCase("lower"))
			{    numberToGuess=-1;
				info("***Thanks ***");
				
			}
			else
				if(temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("end"))
			{
				info("Number guessed is: "+numberToGuess);
				info("Thanks for playing the game");
			}
			 
			
			 kbinput.close();
			 return numberToGuess;
		
	  }
	  
	  
}
