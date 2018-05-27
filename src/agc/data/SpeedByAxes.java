package agc.data;

public class SpeedByAxes {
	private MeanVarSpeed x_Axis;
	private MeanVarSpeed y_Axis;
	private MeanVarSpeed z_Axis;
	
	public MeanVarSpeed getX_Axis() {
		return x_Axis;
	}
	public MeanVarSpeed getY_Axis() {
		return y_Axis;
	}
	public MeanVarSpeed getZ_Axis() {
		return z_Axis;
	}


	// Effort spent: 5 minutes
	public SpeedByAxes ()
	{
		this.x_Axis = new MeanVarSpeed ();
		this.y_Axis = new MeanVarSpeed ();
		this.z_Axis = new MeanVarSpeed ();
	}

	// Effort spent: 5 minutes
	public SpeedByAxes (double xMinValue, double xMaxValue, double yMinValue, double yMaxValue, double zMinValue, double zMaxValue)
	{
		this.x_Axis = new MeanVarSpeed (xMinValue, xMaxValue);
		this.y_Axis = new MeanVarSpeed (yMinValue, yMaxValue);
		this.z_Axis = new MeanVarSpeed (zMinValue, zMaxValue);
	}
	
	@Override
	// Effort spent: 9 minutes
	public String toString() {
		return "{\n"
				+ "\t\"X_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Mean Speed\": "+ x_Axis.getmeanSpeed() + ",\n"
				+ "\t\t\"Variance Speed\": "+ x_Axis.getvarSpeed() + "\n"
				+ "\t},\n"
				+ "\t\"Y_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Mean Speed\": "+ y_Axis.getmeanSpeed() + ",\n"
				+ "\t\t\"Variance Speed\": "+ y_Axis.getvarSpeed() + "\n"
				+ "\t},\n"
				+ "\t\"Z_Axis\":\n"
				+ "\t{\n"
				+ "\t\t\"Mean Speed\": "+ z_Axis.getmeanSpeed() + ",\n"
				+ "\t\t\"Variance Speed\": "+ z_Axis.getvarSpeed() + "\n"
				+ "\t}\n"
				+ "}";
	}
}
