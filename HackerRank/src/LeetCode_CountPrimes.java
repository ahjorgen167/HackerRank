import java.util.*;

public class LeetCode_CountPrimes {

	public static void main(String[] args){
		
		
	}
	
	public static int countPrimes(int input){
		if(input <= 1){
			return 0;
		}
		if (input == 2){
			return 1;
		}
		if(input == 3){
			return 2;
		}
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean isPrime = true;
		
		for(int i = 4; i < input; i++){
			
			for(int p : primes){
				if(i % p == 0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				primes.add(i);
			}
			
		}
		
		return primes.size();
		
	}
}
