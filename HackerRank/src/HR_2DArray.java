import java.util.*;

public class HR_2DArray {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[][] input = new int[6][6];
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				input[i][j] = in.nextInt();
			}
		}
		
		findMaxHourglassSum(input);
		System.out.println(input);
	}
	
	public static void findMaxHourglassSum(int[][] input){
		
		int maxSum = Integer.MIN_VALUE, curSum = 0;
		
		for(int i = 1; i < 5; i++){
			for(int j = 1; j < 5; j++){
				curSum = input[i][j] + input[i - 1][j - 1] + input[i - 1][j] + input[i - 1][j + 1] + input[i + 1][j - 1] + input[i + 1][j] + input[i + 1][j + 1];
				if(maxSum < curSum){
					maxSum = curSum;
				}
			}
		}
		
		System.out.println(maxSum);
	}
	
}
