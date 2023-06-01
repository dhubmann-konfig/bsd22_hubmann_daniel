/*
 * Main
 * Represents main entry point of application
 * Author: Daniel Hubmann
 * Last Change: 01.06.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) {

		logger.info("info logger");
		
		Calculator c = new Calculator();
		c.add(1, 2);
		c.minus(1, 2);
		c.divide(1, 2);
		c.multiply(1, 2);
		
		logger.error("error logger");

		
	}
	
	private static Logger logger = LogManager.getLogger();


}
