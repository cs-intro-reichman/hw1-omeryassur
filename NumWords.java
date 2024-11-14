// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String num = args[0];

		char ones = num.charAt(num.length()-1);

		char tens;
		if (num.length() >= 2){
			tens = num.charAt(num.length()-2);
		} else {
			tens = '0';
		}

		int numInt = Integer.parseInt(num);
		int hundredsInt = numInt/100;

		System.out.println(hundredsInt+ " hundreds, "+ tens+ " tens, and "+ ones+ " ones");
	}
}
