import java.util.*;
public class LeetCode_atoi {
/* incomplete */
	public static void main(String[] args){
		
	}
	
	public static int myAtoi(String str){
		char[] letters = str.toCharArray();
		int output = 0;
		boolean negative = false;
		
		for(char c : letters)
			if(c >= '0' && c <= '9'){
				output *= 10;
				output += (c - '0');
			} else {
				break;
			}
				
		return output;
	}
	
}
