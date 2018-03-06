package orderedStructures;

import orderedStructures.Progression;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(!usedMethod)
			throw new IllegalStateException("");
		else{current = current + commonDifference; 
		return current;}
	}
	public String toString(){
		String f=String.valueOf((int)super.firstValue());
		String cd=String.valueOf((int)commonDifference);
		return "Arith("+f+", "+cd+")";
	}

	@Override
	public double getTerm(int n){
		
		double value=super.firstValue()+commonDifference*(n-1);
		return value;
	}
}
