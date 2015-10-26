import java.util.*;

public class LeetCode_ContainsDuplicates {

	public static void main(String[] args){
		
	
	}
	
	public static boolean containsDuplicate(int[] nums){
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++){
			if(nums[i - 1] == nums[i])
				return true;
		}
		return false;
	}
	
}
