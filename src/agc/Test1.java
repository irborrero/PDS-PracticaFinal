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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message ="hola";
		AGCManager calculadora = new AGCManager();
		System.out.println("Hola");
		try {
		calculadora.CalculateDist("Prueba1.json", 60);
		}catch(AGCException ex){
			System.out.println("mal");
			message = ex.getMessage();
		}
	}

}
