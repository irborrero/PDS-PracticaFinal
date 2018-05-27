package agc;

import agc.exceptions.*;
import agc.data.*;

public interface AgcCalculatorInterface {

	DistByAxes CalculateDist (String InputFile, int time) throws AGCException;

	SpeedByAxes CalculateSpeed (String InputFile, int time) throws AGCException;

}
