package cse360assign2;

public class TestingCalculator {

	public static void main(String[] args) {
	
		Calculator myCalculator = new Calculator();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		
		//System.out.println("0+4-2*2+5" + " = " + myCalculator.getHistory());
		System.out.println(myCalculator.getHistory());
		
		//Calculator myCalculator2 = new Calculator();
		
		//myCalculator2.add(10);
	//	System.out.println(myCalculator.getHistory() + myCalculator.add(10));
		
	}

}
