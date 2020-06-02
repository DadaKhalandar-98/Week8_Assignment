package com.sapient;


public class App 
{
    public static boolean checkPrime(int n)
    {
    	if (n <= 1) 
            return false; 
      
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
      
        return true;
    }
    
    public static boolean checkArmstrongNumber(int n)
    {
    	    int c=0,a,temp;  
    	    temp=n;  
    	    while(n>0)  
    	    {  
    	    a=n%10;  
    	    n=n/10;  
    	    c=c+(a*a*a);  
    	    }  
    	    if(temp==c)  
    	    {
    	    	return true;
    	    }
    	    else
    	    {
    	    	return false;
    	    }
    }
    public static boolean checkPalindrome(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("Invalid number.");
		int a = n, rev = 0;
		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		if (n != rev)
			return false;
		return true;

	}
}
