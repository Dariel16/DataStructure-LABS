package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(!usedMethod)
			throw new IllegalStateException("");
		else
		{
			current = current * commonFactor; 
			return current;
		}
	}
	
	public String toString(){
		String f=String.valueOf((int)super.firstValue());
		String cf=String.valueOf((int)commonFactor);
		return "Geom("+f+", "+cf+")";
	}

	@Override
	public double getTerm(int n){
		
		double value=super.firstValue()*Math.pow(commonFactor, n-1);
		return value;
	}
}
