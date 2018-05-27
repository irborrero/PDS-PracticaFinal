package agc.logic;

import agc.data.SpeedByAxes;
import agc.data.Experiment;
import agc.data.ExperimentChunk;
import agc.exceptions.AGCException;

public class MeanVarSpeedCalculator implements Calculator {

	// Effort spent: 38 meanutos
	@Override
	public Object Calculate(Object obj) throws AGCException {
		Experiment myExperiment= (Experiment)obj;
		// Set initial var and mean values
		ExperimentChunk tempChunk = myExperiment.getItem(myExperiment.getSubExperimentInitialItem());
		double varx, vary, varz, meanx, meany, meanz;

		int SumSpeedX = 0;
		int SumSpeedY = 0;
		int SumSpeedZ = 0;
		int VarSpeedX = 0;
		int VarSpeedY = 0;
		int VarSpeedZ = 0;
		int  j=0;
		// Skip to next element to process the remaining values 
		for (int i=myExperiment.getSubExperimentInitialItem(); i<myExperiment.getSubExperimentFinalItem()+1; i++) {
			tempChunk = myExperiment.getItem(i);			
			SumSpeedX += SumSpeedX + myExperiment.getItem(1).getAccel_x()*0.002;
			SumSpeedY += SumSpeedY + myExperiment.getItem(2).getAccel_y()*0.002;
			SumSpeedZ += SumSpeedZ + myExperiment.getItem(3).getAccel_z()*0.002;
			j++;
		}
		
		meanx = SumSpeedX/j;
		meanx = SumSpeedY/j;
		meanx = SumSpeedY/j;
		
		j=0;
		for (int i=myExperiment.getSubExperimentInitialItem(); i<myExperiment.getSubExperimentFinalItem()+1; i++) {
			tempChunk = myExperiment.getItem(i);			
			VarSpeedX += SumSpeedX + myExperiment.getItem(1).getAccel_x()*0.002;
			VarSpeedY += SumSpeedY + myExperiment.getItem(2).getAccel_y()*0.002;
			VarSpeedZ += SumSpeedZ + myExperiment.getItem(3).getAccel_z()*0.002;
			j++;
		}
		
		SpeedByAxes result = new SpeedByAxes(meanx, varx, meany, vary, meanz, varz);		
		return result;
	}

}
