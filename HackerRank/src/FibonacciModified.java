import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class FibonacciModified {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int size = in.nextInt();
		
		in.close();
		
		BigInteger[] knownNumbers = new BigInteger[size];
		knownNumbers[0] = BigInteger.valueOf(A);
		knownNumbers[1] = BigInteger.valueOf(B);
		
		for(int i = 2; i < size; i++){
			knownNumbers[i] = knownNumbers[i- 2].add(knownNumbers[i - 1].multiply(knownNumbers[i - 1]));
			System.out.println(knownNumbers[i].toString());

		}
		
		System.out.println(knownNumbers[size - 1].toString());
	}

	
}
