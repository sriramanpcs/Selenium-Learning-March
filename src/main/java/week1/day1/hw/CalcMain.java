package week1.day1.hw;

public class CalcMain {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		
		BasicCalculator bcal = new BasicCalculator();
		System.out.println(bcal.add(x, y));
		System.out.println(bcal.sub(x, y));
		System.out.println(bcal.mul(x, y));
		System.out.println(bcal.div(x, y));

	}

}