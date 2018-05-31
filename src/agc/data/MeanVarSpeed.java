package agc.data;

 public class MeanVarSpeed {
	public double meanSpeed;
	public double varSpeed;
		
	public double getmeanSpeed() {
		return meanSpeed;
	}
	
	public double getvarSpeed() {
		return varSpeed;
	}

	// Effort spent: 2 minutes
	public MeanVarSpeed ()
	{
		this.meanSpeed = 0.0d;
		this.varSpeed = 0.0d;
	}
	
	// Effort spent: 2 minutes
	public MeanVarSpeed (double meanValue, double varValue)
	{
		this.meanSpeed = meanValue;
		this.varSpeed = varValue;
	}
	
}
