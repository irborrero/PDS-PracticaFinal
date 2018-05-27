package agc.logic;

import agc.data.SpeedByAxes;

import java.util.ArrayList;

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
		double SumSpeedX = 0;
		double SumSpeedY = 0;
		double SumSpeedZ = 0;
		double SumSpeedXsquared = 0;
		double SumSpeedYsquared = 0;
		double SumSpeedZsquared = 0;

		ArrayList<Double> SpeedX = new ArrayList<Double>();
		ArrayList<Double> SpeedY = new ArrayList<Double>();
		ArrayList<Double> SpeedZ = new ArrayList<Double>();;
		ArrayList<Double> VarX = new ArrayList<Double>();;
		ArrayList<Double> VarY = new ArrayList<Double>();;
		ArrayList<Double> VarZ = new ArrayList<Double>();;
		
		SpeedX.add(0,0.0);
		SpeedY.add(0,0.0);
		SpeedZ.add(0,0.0);



		int  j=1;
		// Skip to next element to process the remaining values 
		for (int i=myExperiment.getSubExperimentInitialItem(); i<myExperiment.getSubExperimentFinalItem()+1; i++) {
			
			tempChunk = myExperiment.getItem(i);		
			
			SpeedX.add(SpeedX.get(j-1) + tempChunk.getAccel_x()*0.002);
			SpeedY.add(SpeedY.get(j-1) + tempChunk.getAccel_y()*0.002);
			SpeedZ.add(SpeedZ.get(j-1) + tempChunk.getAccel_z()*0.002);
			
			SumSpeedX += SumSpeedX + SpeedX.get(j);
			SumSpeedY += SumSpeedY + SpeedY.get(j);
			SumSpeedZ += SumSpeedZ + SpeedZ.get(j);
			
			SumSpeedXsquared += SumSpeedXsquared + Math.pow(SpeedX.get(j),2);
			SumSpeedYsquared += SumSpeedYsquared + Math.pow(SpeedY.get(j),2);
			SumSpeedZsquared += SumSpeedZsquared + Math.pow(SpeedZ.get(j),2);
			
			j++;
		}
		
		meanx = SumSpeedX/SpeedX.size();
		meany = SumSpeedY/SpeedY.size();
		meanz = SumSpeedY/SpeedZ.size();
		
		varx = (SumSpeedXsquared/SpeedX.size()) - Math.pow(meanx,2);
		vary = (SumSpeedYsquared/SpeedY.size()) - Math.pow(meany,2);
		varz = (SumSpeedZsquared/SpeedZ.size()) - Math.pow(meanz,2);
		
		SpeedByAxes result = new SpeedByAxes(meanx, varx, meany, vary, meanz, varz);		
		return result;
	}

}
