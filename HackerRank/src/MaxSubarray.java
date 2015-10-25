import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxSubarray {

    public static void main(String[] args) {
    	
    	ArrayList<Integer> input = new ArrayList<Integer>();
    	input.add(1);
    	maxSubarray(input);
    	
    	input = new ArrayList<Integer>();
    	input.add(-1); input.add(-2); input.add(-3); input.add(-4); input.add(-5); input.add(-6);
    	maxSubarray(input);
    	
    	input = new ArrayList<Integer>();
    	input.add(1); input.add(-2); 
    	maxSubarray(input);
    	
    	input = new ArrayList<Integer>();
    	input.add(1); input.add(2); input.add(3);
    	maxSubarray(input);
    	
    	input = new ArrayList<Integer>();
    	input.add(-10);
    	maxSubarray(input);

    	input = new ArrayList<Integer>();
    	input.add(1);input.add(-1);input.add(-1);input.add(-1);input.add(-1);input.add(5);
    	maxSubarray(input);

    	/*Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int length;
		for(int i = 0; i < tests; i++){
			length = in.nextInt();
			for(int j = 0; j < length; j++){
				numbers.add(in.nextInt());
			}
			maxSubarray(numbers);
			numbers.clear();
		}*/	
	}
	
    public static void maxSubarray(ArrayList<Integer> numbers){
		if(numbers.size() == 0)
            return;
        
        int max_total = 0, run_max = 0;
        int non_concurrent_sub_max = -1;
        int backup_max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.size(); i++){
		    if(numbers.get(i) > backup_max)
                backup_max = numbers.get(i);
            
            if(numbers.get(i) > 0){
            	if(non_concurrent_sub_max == -1)
            		non_concurrent_sub_max = 0;
            	non_concurrent_sub_max += numbers.get(i);
            }
            
            if(run_max + numbers.get(i) > 0){
            	
            	
            	run_max += numbers.get(i);
            } else {
                run_max = 0;
            }
            
            if(run_max > max_total){
                max_total = run_max;
            }
        }
		
        if(non_concurrent_sub_max == -1){
           System.out.println(backup_max + " " + backup_max);
            return;
        }
        
		System.out.println(max_total + " " + non_concurrent_sub_max);
	}
}