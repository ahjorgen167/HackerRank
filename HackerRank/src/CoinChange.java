import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int change = in.nextInt();
    	int size = in.nextInt();
    	int index = 0;
    	int[] changeList = new int[size];
    	while(in.hasNextInt()){
    		changeList[index] = in.nextInt();
    		System.out.println(changeList[index]);
    		index++;
    	}
    	
    	long[] changeCounter = new long[change + 1];
    	changeCounter[0] = 1;
    	
    	
    	for(int i = 0; i < size; i++){
    		for(int j = changeList[i]; j <= change; j++){
    			changeCounter[j] += changeCounter[j - changeList[i]];
    		}
    	}
    	
    	System.out.println(changeCounter[change]);
    
    }
}