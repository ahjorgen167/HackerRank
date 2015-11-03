import java.util.*;

public class LeetCode_ValidNumber {

	public static void main(String[] args){
		isNumber(" 005047e+6");
	}
	
	public static boolean isNumber(String s){
		String request = s.trim();
		boolean containsNums = false;
		boolean containsDec = false;
		boolean containsE = false;
		if(request.length() == 0){
			return false;
		}
		
		int startNumber = 0;
		
		if(request.charAt(0) == '+' || request.charAt(0) == '-'){
			startNumber = 1;
		}
		
		if(request.length() >= startNumber + 1 && request.charAt(startNumber) == '.'){
		    startNumber++;
		    containsDec = true;
		}
		
		for(int i = startNumber; i < request.length(); i++){
			if(request.charAt(i) == '.' && containsNums){
					if(containsDec || containsE)
					    return false;
					containsDec = true;
					continue;
		    }
			
			if(request.charAt(i) == '+' || request.charAt(i) == '-'){
				if(request.charAt(i - 1) != 'e')
				    return false;
				continue;
			}
			if(request.charAt(i) == 'e' && containsNums){
				if(containsE)
				    return false;
				containsE = true;
				containsNums = false;
				continue;
			}
			if(request.charAt(i) >= '0' && request.charAt(i) <= '9'){
				containsNums = true;
			} else {
				return false;
			}
		}
		
		return containsNums;
	}
	
}
