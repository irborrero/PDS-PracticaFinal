package agc.logic;

import agc.data.ExperimentChunk;
import agc.data.Experiment;
import agc.data.DistByAxes;
import agc.exceptions.AGCException;

public class DistCalculator implements Calculator {

	// Effort spent: 29 minutos
	@Override
	public Object Calculate(Object obj) throws AGCException {
		Experiment myExperiment= (Experiment)obj;
		
		// We do not consider the initial sample, as it is the initial position from the gyroscope
		ExperimentChunk previousChunk = myExperiment.getItem(myExperiment.getSubExperimentInitialItem());
		double xValue = 0, yValue = 0, zValue = 0;
		
		// Skip to next element to process the remaining values 
		for (int i=myExperiment.getSubExperimentInitialItem()+1; i<myExperiment.getSubExperimentFinalItem(); i++){
			ExperimentChunk currentChunk = myExperiment.getItem(i);
			xValue += currentChunk.getAccel_x();
			System.out.println(currentChunk.getAccel_x());
			yValue += currentChunk.getAccel_y()*0.002;
			zValue += currentChunk.getAccel_z()*0.002;
			previousChunk = myExperiment.getItem(i);
		}
		DistByAxes result = new DistByAxes(xValue, yValue, zValue);
		return result;
	}

}
