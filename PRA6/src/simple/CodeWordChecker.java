package simple;

import java.util.HashMap;

public class CodeWordChecker {

	HashMap<String, String> words;
	
	public CodeWordChecker (){
		words = new HashMap<String, String>();
	}
	
	public void addWord(String codeWord, String respons) {
		if (words.containsKey(codeWord)) {
			System.out.println("WARNING: The value of " + codeWord + " has been changed");
			words.put(codeWord, respons);
		}
		else {
			words.put(codeWord, respons);		
		 }
	}
	
	public void showRespons (String codeWord) {
		if(words.containsKey(codeWord)) {
		System.out.println(words.get(codeWord));
		}
		if(!words.containsKey(codeWord)) {
			System.out.println("WARNING! Code Word doesn't exist!");
		}
	}
	public void removeCodePair(String codeWord) {
		words.remove(codeWord);
	}
	
}
