package test;

public class NumbersUtility {

	// 1
	public long istheSmallestNumberLong(long number1, long number2) {
		return number1 < number2 ? number1 : number2;
	}

	// 2
	public float istheSmallestNumberFloat(float number1, float number2) {
		return number1 < number2 ? number1 : number2;
	}

	// 3
	public int istheSmallestNumberInteger(int number1, int number2) {
		return number1 < number2 ? number1 : number2;
	}

	// 4
	public double istheSmallestNumberDouble(double number1, double number2) {
		return number1 < number2 ? number1 : number2;
	}

	// 5 - //7
	public int istheBiggestNumberInteger(int number1, int number2) {
		return number1 > number2 ? number1 : number2;
	}

	// 6
	public double istheBiggestNumberDouble(double number1, double number2) {
		return number1 > number2 ? number1 : number2;
	}

	// 8
	public long istheBiggestNumberLong(long number1, long number2) {
		return number1 > number2 ? number1 : number2;
	}

	// 9
	public double exponentsOfANumber(double number, double exponent) {
		double value = Math.pow(number, exponent);
		return value;
	}

	// 10
	public int addOneToNumber(int num) {
		int sum = 1 + num;
		return sum;
	}

	// 11
	public long addOnetoNumLong(long num) {
		long sum = 1 + num;
		return sum;
	}

	// 12
	public int subtractOneToNumber(int num) {
		int difference = num - 1;
		return difference;
	}

	// 13
	public long subtractOneToNumberLong(long num) {
		long difference = num - 1;
		return difference;
	}

	// 14
	public double squareRootDouble(double num) {
		double val = Math.sqrt(num);
		return val;
	}

	// 15
	public double cubicRoot(double num) {
		double value = Math.cbrt(num);
		return value;
	}
	
	//Bonus
	public double randNum() {
		double randNumber =  Math.random();
		System.out.println(randNumber);
		return randNumber;	
	}
}
