import java.util.*;

public class GregorianYear{

    public static void main(String []args){
        gregorianCheck();
    }

    public static boolean validYear(String input){
        if(input.length() == 0 || input.length() > 4){
            return false;
        }
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) < '0' || input.charAt(i) > '9')
                return false;
        }
        return true;
        
    }

	public static void gregorianCheck(){
		
		Scanner in = new Scanner(System.in);
		String year = "";
		while(true){
			if(in.hasNextLine()){
				year = in.nextLine();
				
				if(validYear(year)){
				    int input = Integer.parseInt(year);    
					if(input % 4 == 0){
						if(input % 100 == 0 && input % 400 != 0){
							System.out.println("this is not a leap year"); 
						} else {
							System.out.println("This is a leap year");
						}
					}
				} else {
					System.out.println("please input a valid year");
				}
				
			}
			
		}
	}
     
}
