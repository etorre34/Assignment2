package cse360assign2;

/**
 * Calculator class, initial version, created by the instructor. This class will be edited 2 times.
 * <p>
 * This class has methods and a constructor that will be used for another class that will act as a calculator.
 * This class is the initial version, the instructor created, which all methods and variables must be added.
 * Following the instructions for the second version and the third version, the testing class must be able
 * to show the history of the basic operations such as addition, subtraction, multiplication, and division 
 * after all methods and additional methods are applied to the initial version.
 * of the Calculator class.
 * <p>
 * 
 * @author Elias Torres
 * Class ID: 565
 * Assignment 2
 *
 */
public class Calculator {
	
		/**
		 * Constructors
		 */
		private int total;
		private String history;
		
		public Calculator () {
			total = 0;  // not needed - included for clarity
			history = "0"; //added to start initial input
		}
		
		/**
		 * Returns the total to zero
		 * @return
		 */
		public int getTotal () {
			return total;
		}
		
		/**
		 * Mutator that adds the value parameter
		 * @param value
		 */
		public void add (int value) {
			total = value + total;
			history = history + " + " + value;	
		}
		
		/**
		 * Mutator that subtracts the value parameter
		 * @param value
		 */
		public void subtract (int value) {
			total = total - value;
			history = history + " - " + value;	
		}
		
		/**
		 * Mutator that multiplies the value parameter
		 * @param value
		 */
		public void multiply (int value) {
			total = total * value;
			history = history + " * " + value;
		}
		
		/**
		 * Mutator that divides the value parameter
		 * @param value
		 */
		public void divide (int value) {
			if (value == 0) {
				total = 0;
			}
			else
			{
				total = total / value;
			}	
			history = history + " / " + value;
			return;
		}
		
		/**
		 * A String method to return history
		 * @return
		 */
		public String getHistory () {
			return history;
		}
	}

	
	
