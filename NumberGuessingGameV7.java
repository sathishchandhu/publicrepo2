package com.test.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		 boolean flag=false;
		  String[] strArr= {"yes","end","higher","lower"};
		  List<String> list=new ArrayList<String>();
		  list=Arrays.asList(strArr);
		  String temp=""; 
			//decl scanner
			Scanner kbinput = new Scanner(System.in);
			//take a first guess - avg of upper limit
			int numberToGuess=upper_limit/2;
			
			info("Is it: "+numberToGuess+ " ?");
			info("If Yes, type 'end' or 'yes';if not Type either 'higher' or 'lower're to proceed with guess");
			
			 temp=kbinput.nextLine(); 
		
			
			 //if it is not yes or end
			 if (!temp.equalsIgnoreCase("yes") ||
					!temp.equalsIgnoreCase("end"))	
			 {
				
				//if it is equal to higher or lower				 
				while(temp.equalsIgnoreCase("higher") ||
						temp.equalsIgnoreCase("lower"))
				{
					
					if(temp.equalsIgnoreCase("higher"))
					{
						//info("inside higher");
						if(numberToGuess >=100) break;
						lower_limit=numberToGuess;
						lower_limit++;
						
					}
					else if(temp.equalsIgnoreCase("lower"))
					{
						//info("inside lower");
						if(numberToGuess <=1) break;
						upper_limit=numberToGuess;
						upper_limit--;
					}
					
					//info("upper_limit:"+upper_limit);
					//info("lower_limit:"+lower_limit);
					
					numberToGuess=(upper_limit+lower_limit)/2;
					info("Is it : "+numberToGuess +" ?" );
					temp=kbinput.nextLine();
					
				}
				
			}
			 
			 for(String str: list) {
				    if(str.trim().contains(temp))
				    	info("Number guessed is: "+numberToGuess);
				        flag=true;
				    	
				}
				 
			 	//logic for invalid input
				 if(!flag) numberToGuess=-1;		 
		
				 return numberToGuess;
			 
	  }}
