
public class SManipulation {

	public static void main(String[] args) {
		
		String j = "java is OO programming language";
		
		if(j.contains("java")) {
			System.out.println(j.toUpperCase());
		}
		else {
			System.out.println(j.toLowerCase());
		}
		
		if(j.indexOf("e") < 10) {
			int l = j.length();
			System.out.println(l);
		}
		else {
			System.out.println("I coundn't find a 'e' char in the first 10 char");
		}
		
		String s = "Kings & Queens";
		
		
	}

}
