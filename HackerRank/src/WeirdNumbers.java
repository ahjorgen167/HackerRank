import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeirdNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number % 2 != 0 || number >= 6 && number <= 20){
        	System.out.println("Weird");
        	return;
        }
        System.out.println("Not Weird");
        
        
    }
    
    
}