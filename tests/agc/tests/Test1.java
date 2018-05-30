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

public class Test1 {
	
	/* Caso de Prueba: <CP-AGCRF01-01 - Ruta fichero inexistente>
	*Clase equivalencia: CEI2
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		AGCManager calculadora = new AGCManager();
		try {
		calculadora.CalculateDist("Noexiste.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			System.out.println("Fichero inexistente");
			message = ex.getMessage();
		}
	}
	
	/* Caso de Prueba: <CP-AGCRF01-02 - Sintaxis incorrecta>
	*Clase equivalencia: CEI4
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Sintaxis incorrecta>
	*/
	@Test
	public final void SintaxisIncorrecta() {
		String message ="";
		AGCManager calculadora = new AGCManager();
		try {
		calculadora.CalculateDist("Incorrecto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			System.out.println("Sintaxis Incorrecta");
			message = ex.getMessage();
		}
	}
	
	/* Caso de Prueba: <CP-AGCRF01-03 - Time Stamp no aparece en el fichero de entrada>
	*Clase equivalencia: CEI7
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero no contiene time_stamp>
	*/
	@Test
	public final void SinTimeStamp() {
		String message ="";
		AGCManager calculadora = new AGCManager();
		try {
		calculadora.CalculateDist("SinTimeStamp.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			System.out.println("Fichero no contiene time_stamp");
			message = ex.getMessage();
		}
	}
		
		
	/* Caso de Prueba: <CP-AGCRF01-04 - Time Stamp aparece varias veces>
	*Clase equivalencia: CEI8
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero contiene varios time_stamp>
	*/
		@Test
		public final void VariosTimeStamp() {
			String message ="";
			AGCManager calculadora = new AGCManager();
			try {
			calculadora.CalculateDist("VariosTimeStamp.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				System.out.println("Fichero contiene varios time_stamp");
				message = ex.getMessage();
			}
	}
		
	/* Caso de Prueba: <CP-AGCRF01-05 - Time Stamp sin precisión de milisegundos>
	*Clase equivalencia: CEI9
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Time Stamp sin precisión requerida>
	*/
		@Test
		public final void TimeStampImpreciso() {
			String message ="";
			AGCManager calculadora = new AGCManager();
			try {
			calculadora.CalculateDist("TimeStampImpreciso.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				System.out.println("Time Stamp sin precisión requerida");
				message = ex.getMessage();
			}
		}
			
	/*Caso de Prueba: <CP-AGCRF01-06 - Time Stamp tiene algún campo negativo>
	*Clase equivalencia: CEI10
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Time Stamp contiene algún campo negativo>
	*/
			@Test
			public final void TimeStampNegativo() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("TimeStampNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Time Stamp contiene algún campo negativo");
					message = ex.getMessage();
				}
	}
			
	/* Caso de Prueba: < CP-AGCRF01-07 - Time Stamp no respeta intervalo de 20 ms>
	*Clase equivalencia: CEI11
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <TimeStamp con intervalo incorrecto>
	*/
			@Test
			public final void TimeStampIrrespetuoso() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("TimeStampIrrespetuoso.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("TimeStamp con intervalo incorrecto");
					message = ex.getMessage();
				}
	}
			
	/* Caso de Prueba: < CP-AGCRF01-08 - El valor de aceleración del eje X no es un número decimal>
	 *Clase equivalencia: CEI13
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Valor de campo de eje no es número decimal>
	*/
			@Test
			public final void NoDecimal() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("NoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Valor de campo de eje no es número decimal");
					message = ex.getMessage();
				}
	}
		
	/* Caso de Prueba: < CP-AGCRF01-09 - Número decimal no separado por puntos>
	*Clase equivalencia: CEI14
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con decimales en formato incorrecto>
	*/
			@Test
			public final void NoSeparadosPunto() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("NoSeparadosPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con decimales en formato incorrecto");
					message = ex.getMessage();
				}
	}
			
/* Caso de Prueba: < CP-AGCRF01-10 - Número decimal con menos de tres posiciones decimales>
*Clase equivalencia: CEI15
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valores con precisión incorrecta>
*/
			@Test
			public final void DecimalesImprecisos() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("DecimalesImprecisos.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con valores con precisión incorrecta");
					message = ex.getMessage();
				}
	}
			

/* Caso de Prueba: < CP-AGCRF01-11 - No existe un campo para el eje X>
*Clase equivalencia: CEI16
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero sin campo de eje>
*/
			@Test
			public final void SinCampoDeEje() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("SinCampoDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero sin campo de eje");
					message = ex.getMessage();
				}
	}
			
/* Caso de Prueba: < CP-AGCRF01-12 - Existe más de un campo para el eje X>
 *Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para un eje>
*/
			@Test
			public final void VariosCamposDeEje() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("VariosCamposDeEje.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con más de un campo para un eje");
					message = ex.getMessage();
				}
	}
			

/* Caso de Prueba: < CP-AGCRF01-13 - Existe más de un campo para la latitud>
*Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para la latitud>
*/
			@Test
			public final void VariosCamposDeLatitud() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("VariosCamposDeLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con más de un campo para la latitud");
					message = ex.getMessage();
				}
	}
		
/* Caso de Prueba: < CP-AGCRF01-14 - No existe un campo para la latitud>
*Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero sin un campo para latitud>
*/
			@Test
			public final void SinLatitud() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("SinLatitud.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero sin un campo para latitud");
					message = ex.getMessage();
				}
	}
			
/* Caso de Prueba: < CP-AGCRF01-15 - El valor latitud no es un valor decimal>
*Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valor de latitud no decimal>
*/
			@Test
			public final void LatitudNoDecimal() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("LatitudNoDecimal.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con valor de latitud no decimal");
					message = ex.getMessage();
				}
	}
		
/* Caso de Prueba: < CP-AGCRF01-16 -La parte entera y decimal de la latitud no están separadas por un punto>
*Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valor de latitud no válido>
*/
			
			@Test
			public final void LatitudNoPunto() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("LatitudNoPunto.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con valor de latitud no válido");
					message = ex.getMessage();
				}
	}
			
/* Caso de Prueba: < CP-AGCRF01-17 -El valor latitud no tiene 7 decimales de precisión>
*Clase equivalencia: CEI17
Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valor de latitud no válido>
*/
			@Test
			public final void LatitudNoExacta() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("LatitudNoExacta.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con valor de latitud no válido");
					message = ex.getMessage();
				}
	}
			

/* Caso de Prueba: < CP-AGCRF01-18 -El valor latitud es -90.0000001>
*Valor limite asociado: CEI17
Técnica de prueba: <Valor limite>  Resultado Esperado: <Fichero con valor de latitud fuera de rango negativo>
*/
			@Test
			public final void LatitudVLNegativo() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("LatitudVLNegativo.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("Fichero con valor de latitud no válido");
					message = ex.getMessage();
				}
	}
			
			@Test
			public final void validoe() {
				String message ="";
				AGCManager calculadora = new AGCManager();
				try {
				calculadora.CalculateDist("Prueba1.json", 60);
				}catch(AGCException ex){
					ex.printStackTrace();
					System.out.println("caca");
					message = ex.getMessage();
				}
			}
}
