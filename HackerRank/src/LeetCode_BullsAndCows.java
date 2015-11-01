import java.util.*;

public class LeetCode_BullsAndCows {

	public static void main(String[] args){
		
	}
	
	public static String getHint(String secret, String guess){
		int cows = 0;
		int bulls = 0;
		int[] bullTracker = new int[10];
		
		
		for(int i = 0; i < secret.length(); i++){
			bullTracker[secret.charAt(i) - '0']++;
		}
		
		for(int i = 0; i < secret.length() && i < guess.length(); i++){
			if(secret.charAt(i) == guess.charAt(i)){
				cows++;
			}
			if(bullTracker[guess.charAt(i) - '0'] > 0){
				bulls++;
				bullTracker[guess.charAt(i) - '0']--;
			}
		}
		
		return String.format("%dA%dB", cows, (bulls - cows));
	}
	
}
