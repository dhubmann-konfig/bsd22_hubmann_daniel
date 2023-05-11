/*
 * Main
 * Represents main entry point of application
 * Author: Daniel Hubmann
 * Last Change: 11.05.2023
 */

package at.campus02.bsd;

public class Main {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(1, 2);
		c.minus(1, 2);
		c.divide(1, 2);
		c.multiply(1, 2);

	}

}
