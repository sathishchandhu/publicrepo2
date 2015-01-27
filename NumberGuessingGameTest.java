package com.test.games;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * 
 * @author SChandu
 *
 */
public class NumberGuessingGameTest extends  TestCase { 
	
	@Test
    public void testConcatenate() {
		NumberGuessingGameV7 myUnit = new NumberGuessingGameV7();
		
		
        int result = myUnit.playGame(1,100);

        assertEquals(-1, result);

    }

}
