/*
 * Calculator
 * Represents a calculator
 * Author: Daniel Hubmann
 * Last Change: 15.06.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class represents a basic calculator.
 * 
 * It supports the basic arithmetic operations addition, subtraction,
 * multiplication and division, and the factorial operation.
 * 
 * @author Daniel Hubmann
 *
 */

public class Calculator {

	private static Logger logger = LogManager.getLogger();

	/**
	 * Adds two numbers and returns the result
	 * 
	 * @author Daniel Hubmann
	 * @param number1 the first number
	 * @param number2 the second number
	 * @return the sum of number1 and number2
	 */
	public double add(double number1, double number2) {
		logger.debug("add debug log", number1, number2);
		return number1 + number2;
	}

	/**
	 * Subtracts the second number from the first number and returns the result
	 * 
	 * @author Daniel Hubmann
	 * @param number1 the first number
	 * @param number2 the second number
	 * @return the difference between number1 and number2
	 */
	public double minus(double number1, double number2) {
		logger.debug("minus debug log", number1, number2);
		return number1 - number2;
	}

	/**
	 * Divides the first number by the second number and returns the result
	 * 
	 * @author Daniel Hubmann
	 * @param number1 the first number
	 * @param number2 the second number
	 * @return the result of number1 divided by number2
	 * @throws ArithmeticException if number2 is equal to 0
	 */
	public double divide(double number1, double number2) throws ArithmeticException {
		logger.debug("divide debug log", number1, number2);

		if (number2 == 0) {
			logger.error("error log: division by zero");
			throw new ArithmeticException();
		}
		return number1 / number2;
	}

	/**
	 * Multiplies two numbers and returns the result
	 * 
	 * @author Daniel Hubmann
	 * @param number1 the first number
	 * @param number2 the second number
	 * @return the product of number1 and nubmer2
	 */
	public double multiply(double number1, double number2) {
		logger.debug("multiply debug log", number1, number2);
		return number1 * number2;
	}

	/**
	 * Calculates the factorial of a given number and returns the result.
	 * Returns 0 if the number is less than 0
	 * 
	 * @param number number to calculate the according factorial
	 * @return the factorial of number
	 */
	public long factorial(int number) {
		logger.debug("factorial debug log", number);

		if (number < 0) {
			return 0;
		}

		if (number == 0) {
			return 1;
		}

		return number * factorial(number - 1);
	}

}
