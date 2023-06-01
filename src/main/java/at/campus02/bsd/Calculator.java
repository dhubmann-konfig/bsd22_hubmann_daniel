/*
 * Calculator
 * Represents a calculator
 * Author: Daniel Hubmann
 * Last Change: 01.06.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

	private static Logger logger = LogManager.getLogger();

	public double add(double number1, double number2) {
		logger.debug("add debug log", number1, number2);
		return number1 + number2;
	}

	public double minus(double number1, double number2) {
		logger.debug("minus debug log", number1, number2);
		return number1 - number2;
	}

	public double divide(double number1, double number2) throws ArithmeticException {
		logger.debug("divide debug log", number1, number2);

		if (number2 == 0) {
			logger.error("error log: division by zero");
			throw new ArithmeticException();
		}
		return number1 / number2;
	}

	public double multiply(double number1, double number2) {
		logger.debug("multiply debug log", number1, number2);
		return number1 * number2;
	}

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
