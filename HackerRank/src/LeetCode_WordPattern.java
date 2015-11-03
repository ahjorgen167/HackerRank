import java.util.*;

public class LeetCode_WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}

	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		HashMap<Character, String> patternToString = new HashMap<Character, String>();
		HashMap<String, Character> stringToPattern = new HashMap<String, Character>();
		if (pattern.length() != words.length) {
			return false;
		}
		for (int i = 0; i < words.length; i++) {
			if (patternToString.get(pattern.charAt(i)) == null && stringToPattern.get(words[i]) == null) {
				patternToString.put(pattern.charAt(i), words[i]);
				stringToPattern.put(words[i], pattern.charAt(i));
			} else if (patternToString.get(pattern.charAt(i)) == null || stringToPattern.get(words[i]) == null){
				return false;
			} else {
				if (!patternToString.get(pattern.charAt(i)).equals(words[i]) && !stringToPattern.get(words[i]).equals(pattern.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}
}
