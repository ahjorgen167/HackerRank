import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Scanner in = new Scanner(System.in);

class Prime{

	public static void checkPrime(int... numbers){
        for(int n : numbers){
        	if(isPrime(n))
        		System.out.println(n + " ");
        }
    }
	
	private static boolean isPrime(int i){
		for(int j = 0; i < Math.sqrt(i);i++){
			if(i % j == 0)
				return false;
		}
		return true;
	}
}
