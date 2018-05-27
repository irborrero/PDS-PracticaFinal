package agc.data;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.json.JsonObject;

public class ExperimentChunk {

	private Date time;
	private double accel_x;
	private double accel_y;
	private double accel_z;
	private double latitude;
	private double longitude;

	// Effort spent: 3 minutos
	public ExperimentChunk(Date time, double accel_x, double accel_y, double accel_z, double latitude, double longitude) {
		this.time = time;
		this.accel_x = accel_x;
		this.accel_y = accel_y;
		this.accel_z = accel_z;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Date getTime() {
		return time;
	}

	public double getAccel_x() {
		return accel_x;
	}

	public double getAccel_y() {
		return accel_y;
	}

	public double getAccel_z() {
		return accel_z;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	
	// Effort spent: 12 minutos
	@Override
	public String toString() {
		String result = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
		result += "Time: " + formatter.format(time) + "\n";
		result += "ACCEL_X: " + accel_x + "\n";
		result += "ACCEL_Y: " + accel_y + "\n";
		result += "ACCEL_Z: " + accel_z+ "\n";
		result += "LATITUDE: " + latitude+ "\n";
		result += "LONGITUDE: " + longitude+ "\n";
		return result;
	}

}
