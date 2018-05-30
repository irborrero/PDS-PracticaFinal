package agc;

import agc.data.SpeedByAxes;
import agc.data.Experiment;
import agc.data.DistByAxes;
import agc.io.ExperimentDataFileManager;
import agc.exceptions.AGCException;
import agc.logic.Calculator;
import agc.logic.DistCalculator;
import agc.logic.MeanVarSpeedCalculator;

public class AGCManager implements AgcCalculatorInterface {

	@Override
	public DistByAxes CalculateDist(String InputFile, int time) throws AGCException {
		ExperimentDataFileManager myDataManager = new ExperimentDataFileManager();
		Experiment myExperiment = myDataManager.Parse(InputFile);		
		myExperiment.identifySubExperiment(0,time);
		
		DistCalculator myCalculator = new DistCalculator();
		DistByAxes result = (DistByAxes) myCalculator.Calculate(myExperiment);
		System.out.println(result.toString());
		return result;
	}
	
	@Override
	public SpeedByAxes CalculateSpeed(String InputFile, int time) throws AGCException {
		ExperimentDataFileManager myDataManager = new ExperimentDataFileManager();
		Experiment myExperiment = myDataManager.Parse(InputFile);		
		myExperiment.identifySubExperiment(0,time);
		
		Calculator myCalculator = new MeanVarSpeedCalculator ();
		SpeedByAxes result = (SpeedByAxes) myCalculator.Calculate(myExperiment);
		System.out.println(result.toString());
		return result;
	}

}
