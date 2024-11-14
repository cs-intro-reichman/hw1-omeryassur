// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		String currentValue = args[0];
		String rate = args[1];
		String years = args[2];
		int currentValueInt = Integer.parseInt(currentValue);
		double rateDouble = Double.parseDouble(rate);
		int yearsInt = Integer.parseInt(years);

		double futureValue = (currentValueInt*Math.pow(1+rateDouble/100,yearsInt));
		System.out.println("After "+ years+ " years, $"+ currentValue+ " saved at "+ rateDouble+ "% will yield $"+ (int)futureValue);
	}
}