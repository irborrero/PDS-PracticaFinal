package agc.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.logic.Calculator;
import agc.data.DistByAxes;
import agc.data.SpeedByAxes;
import agc.exceptions.AGCException;

import agc.*;

public class Test1 {
	
	AGCManager calculadora = new AGCManager();
	
	/* Caso de Prueba: <CP-AGCRF01-01 - Ruta fichero inexistente>
	*Clase equivalencia: CEI2
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		
		try {
		calculadora.CalculateDist("Noexiste.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-AGCRF01-02 - Sintaxis incorrecta>
	*Clase equivalencia: CEI4
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void SintaxisIncorrecta() {
		String message ="";
		
		try {
		calculadora.CalculateDist("Incorrecto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-AGCRF01-03 - Time Stamp no aparece en el fichero de entrada>
	*Clase equivalencia: CEI7
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: invalid input for Time in JSON.>
	*/
	@Test
	public final void SinTimeStamp() {
		String message ="";
		
		try {
		calculadora.CalculateDist("SinTimeStamp.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: invalid input for Time in JSON.", message);
	}
		
		
	/* Caso de Prueba: <CP-AGCRF01-04 - Time Stamp aparece varias veces>
	*Clase equivalencia: CEI8
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: Invalid key value in input JSON.>
	*/
		@Test
		public final void VariosTimeStamp() {
			String message ="";
			
			try {
			calculadora.CalculateDist("VariosTimeStamp.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: Invalid key value in input JSON.", message);
	}
		
	/* Caso de Prueba: <CP-AGCRF01-05 - Time Stamp sin precisión de milisegundos>
	*Clase equivalencia: CEI9
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
		@Test
		public final void TimeStampImpreciso() {
			String message ="";
			
			try {
			calculadora.CalculateDist("Error: invalid input for Time in JSON.", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
			
	/*Caso de Prueba: <CP-AGCRF01-06 - Time Stamp tiene algún campo negativo>
	*Clase equivalencia: CEI10
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: invalid input for Time in JSON.>
	*/
			@Test
			public final void TimeStampNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateDist("TimeStampNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: invalid input for Time in JSON.", message);
	}
			
	/* Caso de Prueba: < CP-AGCRF01-07 - Time Stamp no respeta intervalo de 20 ms>
	*Clase equivalencia: CEI11
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: time values in experiment are not consecutive with a 50Hz rate.>
	*/
			@Test
			public final void TimeStampIrrespetuoso() {
				String message ="";
				
				try {
				calculadora.CalculateDist("TimeStampIrrespetuoso.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: time values in experiment are not consecutive with a 50Hz rate.", message);
	}
			
	/* Caso de Prueba: < CP-AGCRF01-08 - El valor de aceleración del eje X no es un número decimal>
	 *Clase equivalencia: CEI13
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
	*/
			@Test
			public final void NoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateDist("NoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
	}
		
	/* Caso de Prueba: < CP-AGCRF01-09 - Número decimal no separado por puntos>
	*Clase equivalencia: CEI14
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
	*/
			@Test
			public final void NoSeparadosPunto() {
				String message ="";
				
				try {
				calculadora.CalculateDist("NoSeparadosPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF01-10 - Número decimal con menos de tres posiciones decimales>
*Clase equivalencia: CEI15
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: less than 3 decimals for ACCEL_X in JSON input data.>
*/
			@Test
			public final void DecimalesImprecisos() {
				String message ="";
				
				try {
				calculadora.CalculateDist("DecimalesImprecisos.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 3 decimals for ACCEL_X in JSON input data.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF01-11 - No existe un campo para el eje X>
*Clase equivalencia: CEI16
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
*/
			@Test
			public final void SinCampoDeEje() {
				String message ="";
				
				try {
				calculadora.CalculateDist("SinCampoDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF01-12 - Existe más de un campo para el eje X>
 *Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para un eje>
*/
			@Test
			public final void VariosCamposDeEje() {
				String message ="";
				
				try {
				calculadora.CalculateDist("VariosCamposDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para un eje", message);
	}
			

/* Caso de Prueba: < CP-AGCRF01-13 - Existe más de un campo para la latitud>
*Clase equivalencia: CEI19
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para la latitud>
*/
			@Test
			public final void VariosCamposDeLatitud() {
				String message ="";
				
				try {
				calculadora.CalculateDist("VariosCamposDeLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para la latitud", message);
	}
		
/* Caso de Prueba: < CP-AGCRF01-14 - No existe un campo para la latitud>
*Clase equivalencia: CEI20
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero sin un campo para latitud>
*/
			@Test
			public final void SinLatitud() {
				String message ="";
				
				try {
				calculadora.CalculateDist("SinLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LATITUDE in JSON input data is not a number.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF01-15 - El valor latitud no es un valor decimal>
*Clase equivalencia: CEI21
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LATITUDE in JSON input data is not a number.>
*/
			@Test
			public final void LatitudNoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LatitudNoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LATITUDE in JSON input data is not a number.", message);
	}
		
/* Caso de Prueba: < CP-AGCRF01-16 -La parte entera y decimal de la latitud no están separadas por un punto>
*Clase equivalencia: CEI22
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
*/
			
			@Test
			public final void LatitudNoPunto() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LatitudNoPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF01-17 -El valor latitud no tiene 7 decimales de precisión>
*Clase equivalencia: CEI23
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valor de latitud no válido>
*/
			@Test
			public final void LatitudNoExacta() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LatitudNoExacta.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 7 decimals for LATITUDE in JSON input data.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF01-18 -El valor latitud es -90.0000000>
*Valor limite asociado: AVL1
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.>
*/
			@Test
			public final void LatitudVLNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LatitudVLNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.", message);
	}
			
/* Caso de Prueba: < CP-AGCRF01-19 -El valor latitud es 90.0000000>
*Valor limite asociado: AVL4
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.>
*/
			@Test
			public final void LatitudVLPositivo() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LatitudVLPositivo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LATITUDE cannot be less than -89.9999999 or greater than 89.9999999.", message);
	}
			

/* Caso de Prueba: < CP-AGCRF01-20 -Existe más de un campo para la longitud>
*Clase de Equivalencia: CEI25
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para longitud>
*/
			@Test
			public final void VariosLongitud() {
				String message ="";
				
				try {
				calculadora.CalculateDist("VariosLongitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Fichero con más de un campo para longitud", message);
	}	
			
/* Caso de Prueba: < CP-AGCRF01-21 -No existe un campo para la longitud>
*Clase de Equivalencia: CEI26
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LONGITUDE in JSON input data is not a number.>
*/
			
			@Test
			public final void SinLongitud() {
				String message ="";
				
				try {
				calculadora.CalculateDist("SinLongitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LONGITUDE in JSON input data is not a number.", message);
	}	
			

/* Caso de Prueba: < CP-AGCRF01-22 -El valor longitud no es un valor decimal>
*Clase de Equivalencia: CEI27
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: LONGITUDE in JSON input data is not a number.>
*/
			@Test
			public final void LongitudNoDecimal() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LongitudNoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: LONGITUDE in JSON input data is not a number.", message);
	}
			
			
/* Caso de Prueba: < CP-AGCRF01-23 -La parte entera y decimal de la longitud no están separadas por un punto>
*Clase de Equivalencia: CEI28
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: could not read data from input file.>
*/
			@Test
			public final void LongitudNoPunto() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LongitudNoPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: could not read data from input file.", message);
	}
			
			
/* Caso de Prueba: < CP-AGCRF01-24 -El valor longitud no tiene 7 decimales de precisión>
*Clase de Equivalencia: CEI29
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valor de longitud no válido>
*/
			@Test
			public final void LongitudNoExacta() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LongitudNoExacta.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: less than 7 decimals for LONGITUDE in JSON input data.", message);
	}	
			
			
/* Caso de Prueba: < CP-AGCRF01-25 -El valor longitud es -180.0000000>
*Valor limite asociado: AVL5
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.>
*/
			@Test
			public final void LongitudVLNegativo() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LongitudVLNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.", message);
	}	
			
	
/* Caso de Prueba: < CP-AGCRF01-26 -El valor longitud es 180.0000000>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.>
*/
			
			@Test
			public final void LongitudVLPositivo() {
				String message ="";
				
				try {
				calculadora.CalculateDist("LongitudVLPositivo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: value for LONGITUDE cannot be less than -179.9999999 or greater than 179.9999999.", message);
	}	
		
	
			
/* Caso de Prueba: < CP-AGCRF01-27 -Variable duración con valores negativos>
*Clase de Equivalencia: CEI29
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Error: Invalid time value in input.>
*/
			@Test
			public final void VariableNegativa() {
				String message ="";
				
				try {
				calculadora.CalculateDist("Prueba1", -2);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: Invalid time value in input.", message);
	}	
			
			
/* Caso de Prueba: < CP-AGCRF01-28 -El valor de la variable duración es -1>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Error: Invalid time value in input.>
*/
			@Test
			public final void VariableAVL() {
				String message ="";
				
				try {
				calculadora.CalculateDist("Prueba1", -1);
				}catch(AGCException ex){
					ex.printStackTrace();
					message = ex.getMessage();
				}
				Assert.assertEquals("Error: Invalid time value in input.", message);
	}	
			

/* Caso de Prueba: < CP-AGCRF01-29 -El valor de la variable duración es el límite superior +1>
*Valor limite asociado: AVL8
Técnica de prueba: <Valor limite>  Resultado Esperado: <Variable introducida incorrecta>
*/
			@Test
			public final void VariableAVL2() {
				String message ="";
				
				try {
				calculadora.CalculateDist("Prueba1", 101);
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
				
				DistByAxes result = calculadora.CalculateDist("Prueba1.json", 60);
				
				Assert.assertEquals(0.0036f, result.getdist_X(), 0.0001f);
				Assert.assertEquals(0.0054f, result.getdist_Y(), 0.0001f);
				Assert.assertEquals(0.0018f, result.getdist_Z(), 0.0001f);
			}		
			
}
