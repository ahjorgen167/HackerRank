
public class LeetCoide_ATOI {

	public static void main(String[] args){
		//myAtoi("-2147483648");
		System.out.println(Integer.MAX_VALUE);
	}
	
	public static int myAtoi(String str){
		long output = 0;
		String request = str.trim();
		int startNumber = 0;
		boolean negative = false;
		if(request.length() == 0){
			return (int) output;
		}
		
		if(request.charAt(0) == '-'){
			startNumber = 1;
			negative = true;
		}
		
		if(request.charAt(0) == '+'){
			startNumber = 1;
		}
		
		for(int i = startNumber; i < request.length(); i++){
			if(request.charAt(i) >= '0' && request.charAt(i) <= '9'){
				output = output * 10 + (request.charAt(i) - '0');
			} else {
				break;
			}
			if(i - startNumber > 10)
			    break;
		}
		
		if(!negative && output > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		} else if (negative && output > Integer.MAX_VALUE){
			return Integer.MIN_VALUE;
		} else {
			return negative ? (int) (-1 * output) : (int) output;
		}
	}
}
