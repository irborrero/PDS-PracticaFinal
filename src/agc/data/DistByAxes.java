package agc.data;

public class DistByAxes {
	private double dist_X;
	private double dist_Y;
	private double dist_Z;
	
	public double getdist_X() {
		return dist_X;
	}

	public double getdist_Y() {
		return dist_Y;
	}

	public double getdist_Z() {
		return dist_Z;
	}
	
	// Effort spent: 3 minutes
	public DistByAxes ()
	{
		this.dist_X = 0.0d;
		this.dist_Y = 0.0d;
		this.dist_Z = 0.0d;
	}
	
	// Effort spent: 4 minutes
	public DistByAxes (double xValue, double yValue, double zValue)
	{
		this.dist_X = xValue;
		this.dist_Y = yValue;
		this.dist_Z = zValue;
	}
	
	@Override
	// Effort spent: 8 minutes
	public String toString() {
		return "{\n"
				+ "\t\"X_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Dist\": "+ dist_X + "\n"
				+ "\t},\n"
				+ "\t\"Y_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Dist\": "+ dist_Y + "\n"
				+ "\t},\n"
				+ "\t\"Z_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Dist\": "+ dist_Z + "\n"
				+ "\t}\n"
				+ "}";
	}
}
