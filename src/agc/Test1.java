package agc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.logic.Calculator;
import agc.data.SpeedByAxes;
import agc.exceptions.AGCException;

import agc.*;

public class Test1 {
	
	/* Caso de Prueba: <CP-RF1-03 - Fichero Inexistente>
	* Nodo/s del Árbol de Derivación: <1>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		AGCManager calculadora = new AGCManager();
		try {
		calculadora.CalculateDist("Prueba1.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			System.out.println("mal");
			message = ex.getMessage();
		}
	}
}
