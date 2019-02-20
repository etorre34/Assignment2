package cse360assign1;
/**
 * OrderedIntList class was edited and used to practice debugging and documentation.
 * <p>
 * This class has methods and constructors that uses an array with the size
 * of 10 and for loops to make a list of numbers with 5 integers per line.
 * Each integer is separated with a tab to help distinguish which values
 * are duplicated so an overflow can be detected if the array has more
 * than 10 integers. If the array becomes full, the last value that was
 * inserted is inserted while the last value is dropped off at the end
 * of the array.
 * <p>
 * 
 * @author Elias Torres
 * Class ID: 565
 * Assignemnt1
 * 
 */
public class OrderedIntList {
	/**
	 * Constructors
	 */
	private int a[]; //array
	private int c; // counter
	
	OrderedIntList()
	{
	/**
	 * Identifiers
	 */
	 a = new int[10];// initializes a for 10 variables
	 c = 0;// initializes c to equal 0
    }
	/**
	 * Mutator sets the insert method
	 * @param v inserts into the array
	 */
	public void insert(int v) {// helps to insert the integers for for loop
		int j = 0; // variable to drop off the next value
		for (int i = 0; i < c ; i++, j++) {
			if(v <= a[i]) {
				if (v == a[i]) { // helps to remove duplicate integers
					return; // returns v
				}
				break;
			}
		}
	 
		for (int i = c - 1; i > j;) {// for loop helps to remove the last element if the list after exceeding the array
				a[i] = a[i--]; 
			}
			a[j] = v; // moves the elements in the index
			c++;
			if(c == 10) {
			c = 10;
			}
	}
	/**
	 * Mutator
	 */
	public void print() { // helps to print the array
		for (int i = 0; i < c; i++) {
			if (i%5 == 0) {// line break after 5 integers
				System.out.println();// Prints the array
			}
			System.out.print(a[i] + "\t"); 
		}

	}
}


	

		
	



	


