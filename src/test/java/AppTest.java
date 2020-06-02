package com.sapient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    private App app; 
	@Before
	public void setup()
	{
		app=new App();
		System.out.println("setup");
	}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(false,app.checkPrime(3));
        System.out.println("shouldAnswerWithTrue");
    }
    
    @Test
    public void shouldReturnWithTrue()
    {
    	assertEquals(false,app.checkArmstrongNumber(143));
    	System.out.println("shouldReturnWithTrue");
    }
    
    @Test
    public void shouldReturnWithTrueStatement()
    {
    	assertEquals(false,app.checkPalindrome(143));
    	System.out.println("shouldReturnWithTrue");
    }
    
}
