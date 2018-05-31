package agc.tests;

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

public class TestCE2 {
	
	AGCManager calculadora = new AGCManager();
	
	/* Caso de Prueba: <CP-AGCRF02-01 - Ruta fichero inexistente>
	*Clase equivalencia: CEI2
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		
		try {
		calculadora.CalculateSpeed("Noexiste.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-AGCRF02-02 - Sintaxis incorrecta>
	*Clase equivalencia: CEI4
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void SintaxisIncorrecta() {
		String message ="";
		
		try {
		calculadora.CalculateSpeed("Incorrecto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-AGCRF02-03 - Time Stamp no aparece en el fichero de entrada>
	*Clase equivalencia: CEI7
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: invalid input for Time in JSON.>
	*/
	@Test
	public final void SinTimeStamp() {
		String message ="";
		
		try {
		calculadora.CalculateSpeed("SinTimeStamp.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: invalid input for Time in JSON.", message);
	}
		
		
	/* Caso de Prueba: <CP-AGCRF02-04 - Time Stamp aparece varias veces>
	*Clase equivalencia: CEI8
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: Invalid key value in input JSON.>
	*/
		@Test
		public final void VariosTimeStamp() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("VariosTimeStamp.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: Invalid key value in input JSON.", message);
	}
		
	/* Caso de Prueba: <CP-AGCRF02-05 - Time Stamp sin precisión de milisegundos>
	*Clase equivalencia: CEI9
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
		@Test
		public final void TimeStampImpreciso() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("Error: invalid input for Time in JSON.", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
			
	/*Caso de Prueba: <CP-AGCRF02-06 - Time Stamp tiene algún campo negativo>
	*Clase equivalencia: CEI10
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: invalid input for Time in JSON.>
	*/
			@Test
			public final void TimeStampNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("TimeStampNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: invalid input for Time in JSON.", message);
	}
			
	/* Caso de Prueba: < CP-AGCRF02-07 - Time Stamp no respeta intervalo de 20 ms>
	*Clase equivalencia: CEI11
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: time values in experiment are not consecutive with a 50Hz rate.>
	*/
			@Test
			public final void TimeStampIrrespetuoso() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("TimeStampIrrespetuoso.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: time values in experiment are not consecutive with a 50Hz rate.", message);
	}
			
	/* Caso de Prueba: < CP-AGCRF02-08 - El valor de aceleración del eje X no es un número decimal>
	 *Clase equivalencia: CEI13
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
	*/
			@Test
			public final void NoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("NoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
	}
		
	/* Caso de Prueba: < CP-AGCRF02-09 - Número decimal no separado por puntos>
	*Clase equivalencia: CEI14
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
			@Test
			public final void NoSeparadosPunto() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("NoSeparadosPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF02-10 - Número decimal con menos de tres posiciones decimales>
*Clase equivalencia: CEI15
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: less than 3 decimals for ACCEL_X in JSON input data.>
*/
			@Test
			public final void DecimalesImprecisos() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("DecimalesImprecisos.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 3 decimals for ACCEL_X in JSON input data.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF02-11 - No existe un campo para el eje X>
*Clase equivalencia: CEI16
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
*/
			@Test
			public final void SinCampoDeEje() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("SinCampoDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF02-12 - Existe más de un campo para el eje X>
 *Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para un eje>
*/
			@Test
			public final void VariosCamposDeEje() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("VariosCamposDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para un eje", message);
	}
			

/* Caso de Prueba: < CP-AGCRF02-13 - Existe más de un campo para la latitud>
*Clase equivalencia: CEI19
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para la latitud>
*/
			@Test
			public final void VariosCamposDeLatitud() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("VariosCamposDeLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para la latitud", message);
	}
		
/* Caso de Prueba: < CP-AGCRF02-14 - No existe un campo para la latitud>
*Clase equivalencia: CEI20
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LATITUDE in JSON input data is not a number.>
*/
			@Test
			public final void SinLatitud() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("SinLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LATITUDE in JSON input data is not a number.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF02-15 - El valor latitud no es un valor decimal>
*Clase equivalencia: CEI21
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LATITUDE in JSON input data is not a number.>
*/
			@Test
			public final void LatitudNoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LatitudNoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LATITUDE in JSON input data is not a number.", message);
	}
		
/* Caso de Prueba: < CP-AGCRF02-16 -La parte entera y decimal de la latitud no están separadas por un punto>
*Clase equivalencia: CEI22
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
*/
			
			@Test
			public final void LatitudNoPunto() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LatitudNoPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF02-17 -El valor latitud no tiene 7 decimales de precisión>
*Clase equivalencia: CEI23
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: less than 7 decimals for LATITUDE in JSON input data.>
*/
			@Test
			public final void LatitudNoExacta() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LatitudNoExacta.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 7 decimals for LATITUDE in JSON input data.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF02-18 -El valor latitud es -90.0000000>
*Valor limite asociado: AVL1
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.>
*/
			@Test
			public final void LatitudVLNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LatitudVLNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF02-19 -El valor latitud es 90.0000000>
*Valor limite asociado: AVL4
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.>
*/
			@Test
			public final void LatitudVLPositivo() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LatitudVLPositivo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF02-20 -Existe más de un campo para la longitud>
*Clase de Equivalencia: CEI25
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para longitud>
*/
			@Test
			public final void VariosLongitud() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("VariosLongitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para longitud", message);
	}	
			
/* Caso de Prueba: < CP-AGCRF02-21 -No existe un campo para la longitud>
*Clase de Equivalencia: CEI26
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LONGITUDE in JSON input data is not a number.>
*/
			
			@Test
			public final void SinLongitud() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("SinLongitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LONGITUDE in JSON input data is not a number.", message);
	}	
			

/* Caso de Prueba: < CP-AGCRF02-22 -El valor longitud no es un valor decimal>
*Clase de Equivalencia: CEI27
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LONGITUDE in JSON input data is not a number.>
*/
			@Test
			public final void LongitudNoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LongitudNoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LONGITUDE in JSON input data is not a number.", message);
	}
			
			
/* Caso de Prueba: < CP-AGCRF02-23 -La parte entera y decimal de la longitud no están separadas por un punto>
*Clase de Equivalencia: CEI28
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
*/
			@Test
			public final void LongitudNoPunto() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LongitudNoPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
			
/* Caso de Prueba: < CP-AGCRF02-24 -El valor longitud no tiene 7 decimales de precisión>
*Clase de Equivalencia: CEI29
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: less than 7 decimals for LONGITUDE in JSON input data.>
*/
			@Test
			public final void LongitudNoExacta() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LongitudNoExacta.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 7 decimals for LONGITUDE in JSON input data.", message);
	}	
			
			
/* Caso de Prueba: < CP-AGCRF02-25 -El valor longitud es -180.0000000>
*Valor limite asociado: AVL5
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.>
*/
			@Test
			public final void LongitudVLNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LongitudVLNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.", message);
	}	
			
	
/* Caso de Prueba: < CP-AGCRF02-26 -El valor longitud es 180.0000000>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.>
*/
			
			@Test
			public final void LongitudVLPositivo() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("LongitudVLPositivo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.", message);
	}	
		
	
			
/* Caso de Prueba: < CP-AGCRF02-27 -Variable duración con valores negativos>
*Clase de Equivalencia: CEI29
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: Invalid time value in input.>
*/
			@Test
			public final void VariableNegativa() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("Prueba1", -2);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: Invalid time value in input.", message);
	}	
			
			
/* Caso de Prueba: < CP-AGCRF02-28 -El valor de la variable duración es -1>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: Invalid time value in input.>
*/
			@Test
			public final void VariableAVL() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("Prueba1", -1);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: Invalid time value in input.", message);
	}	
			

/* Caso de Prueba: < CP-AGCRF02-29 -El valor de la variable duración es el límite superior +1>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
*/
			@Test
			public final void VariableAVL2() {
				String message ="";
				
				try {
				calculadora.CalculateSpeed("Prueba1", 101);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
	}	
				

/* Caso de Prueba: < CP-AGCRF01-30 -Correcto>
*Clase de Equivalencia: todas las validas
Técnica de prueba: <Clase de Equivalencia>  Resultado Esperado: <JSON con salida de distancia>
*/		
			
@Test
public final void valido1() throws AGCException {
	
	SpeedByAxes result = calculadora.CalculateSpeed("Prueba1.json", 60);
	
	////// poner resultados que salgan por pantalla
	Assert.assertEquals(0.0036f, result.getX_Axis().getmeanSpeed(), 0.0001f);
	Assert.assertEquals(0.0054f, result.getY_Axis().getmeanSpeed(), 0.0001f);
	Assert.assertEquals(0.0018f, result.getZ_Axis().getmeanSpeed(), 0.0001f);
	Assert.assertEquals(0.0036f, result.getX_Axis().getvarSpeed(), 0.0001f);
	Assert.assertEquals(0.0054f, result.getY_Axis().getvarSpeed(), 0.0001f);
	Assert.assertEquals(0.0018f, result.getZ_Axis().getvarSpeed(), 0.0001f);
}
}
