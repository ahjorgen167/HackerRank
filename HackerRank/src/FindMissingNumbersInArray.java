
import java.util.*;

public class FindMissingNumbersInArray {

	public static void main(String[] args){
		
		
	}
	
	public static List<Integer> findNumbersA(int[] input, int min, int max){
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i : input){
			visited.put(i, true);
		}
		
		for(int i = min; i <= max; i++){
			if(visited.get(i) == null || visited.get(i) == false){
				output.add(i);
			}
		}
		
		return output;
	}
	
	public static List<Integer> findNumbersB(int[] input, int min, int max){
		ArrayList<Integer> output = new ArrayList<Integer>();
		Arrays.sort(input);
		
		for(int i = min; i < input[0]; i++){
			output.add(i);
		}
		
		for(int i = 1; i <= input.length; i++){
			if(Math.abs(input[i]) - Math.abs(input[i - 1]) > 1){
				for(int j = input[i - 1] + 1; j < input[i]; j++){
					output.add(j);
				}
			}
		}

		for(int i = input[input.length - 1]; i <= max; i++){
			output.add(i);
		}
		
		return output;
	}
	
}
