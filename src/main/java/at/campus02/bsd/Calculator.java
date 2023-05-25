/*
 * Calculator
 * Represents a calculator
 * Author: Daniel Hubmann
 * Last Change: 25.05.2023
 */

package at.campus02.bsd;

public class Calculator {

	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public double minus(double number1, double number2) {
		return number1 - number2;
	}

	public double divide(double number1, double number2) throws ArithmeticException {
		if (number2 == 0) {
			throw new ArithmeticException();
		}
		return number1 / number2;
	}

	public double multiply(double number1, double number2) {
		return number1 * number2;
	}

	public long factorial(int number) {

		if (number < 0) {
			return 0;
		}

		if (number == 0) {
			return 1;
		}

		return number * factorial(number - 1);
	}

}
