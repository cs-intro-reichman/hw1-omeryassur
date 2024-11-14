
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		
		int lim = Integer.parseInt(args[0]);
		int number1 = (int)(Math.random()*lim);
		int number2 = (int)(Math.random()*lim);
		int number3 = (int)(Math.random()*lim);
		System.out.println(number1+ " "+ number2+ " "+ number3);
		int min = Math.min(number1,number2);
		min = Math.min(min,number3);
		int max = Math.max(number1,number2);
		max = Math.max(max,number3);
		int middle = number1+number2+number3-min-max;
		System.out.println(min+ " "+ middle+ " "+ max);
		

	}
}
