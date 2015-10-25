import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Voting {

    	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double total = in.nextDouble();
		HashMap<String, Double> candidates = new HashMap<String, Double>();
		HashSet<String> candidateNames = new HashSet<String>();
		in.nextLine();
		String candidateName;
		for(double i = 0; i < total; i++){
			candidateName = in.nextLine();
			if(candidates.get(candidateName) == null 
					|| candidates.get(candidateName) == 0.0){
				candidates.put(candidateName, 1.0);
			} else {
				candidates.put(candidateName, candidates.get(candidateName) + 1);
			}
			candidateNames.add(candidateName);
		}
		
		for(String n : candidateNames){
			if(candidates.get(n) / total > .5){
				System.out.println(n);
				return;
			}
		}
	}
}