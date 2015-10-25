import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
	
	public static boolean flag = test();
	public static long H, B;
	public static boolean test(){
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		B = in.nextInt();
		if(H <= 0 || B <= 0){
			System.out.print("java.lang.Exception: Breadth and height must be positive");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception{
		
	}
	
}
