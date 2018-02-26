package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}

	@Override
	public String toString(){	
		return "Arith(" + (int) this.firstValue() + "," + (int) commonDifference + ")";	
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
		throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 		
			return this.firstValue()+commonDifference*(n-1);
	
}
}
