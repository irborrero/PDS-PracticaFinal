package agc.tests;


import org.junit.Assert;
import org.junit.Test;

import agc.AGCManager;
import agc.data.DistByAxes;
import agc.data.SpeedByAxes;
import agc.exceptions.AGCException;

public class TestAS2 {
	
		///////////////7FALTA:
		// CASOS VALIDOS Y MODIFICAR EXCEPCIONES

		/* Caso de Prueba: <CP-RF2-03 - Fichero Inexistente>
		* Nodo/s del Árbol de Derivación: <1>
		 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
	
	AGCManager calculadora = new AGCManager();
	
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
		
		/* Caso de Prueba: <CP-RF2-04 - Omisión inicio objeto>
		* Nodo/s del Árbol de Derivación: <2>
		 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionInicio() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionInicio.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-05 - Adición inicio objeto>
		* Nodo/s del Árbol de Derivación: <2>
		 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionInicio() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionInicio.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-06 - Modificacion inicio objeto>
		* Nodo/s del Árbol de Derivación: <5>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionInicio() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionInicio.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		

		/* Caso de Prueba: <CP-RF2-07 - Omision inicio medicion>
		* Nodo/s del Árbol de Derivación: <6>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionInicioMed() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionInicioMed.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		
		/* Caso de Prueba: <CP-RF2-08 - Adicion inicio medicion>
		* Nodo/s del Árbol de Derivación: <6>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionInicioMed() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionInicioMed.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		

		/* Caso de Prueba: <CP-RF2-09 - Modificacion inicio medicion>
		* Nodo/s del Árbol de Derivación: <14>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionInicioMed() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionInicioMed.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-10 - OmisionTimeStamp>
		* Nodo/s del Árbol de Derivación: <7>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: invalid input for Time in JSON.>
		*/
		@Test
		public final void OmisionTimeStamp() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("SinTimeStamp.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: invalid input for Time in JSON.", message);
		}
		
		
		/* Caso de Prueba: <CP-RF2-11 - AdicionTimeStamp>
		* Nodo/s del Árbol de Derivación: <7>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.">
		*/
		@Test
		public final void AdicionTimeStamp() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("VariosTimeStamp.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-12 - OmisionEtiquetaTS>
		* Nodo/s del Árbol de Derivación: <15>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionEtiquetaTS() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionEtiquetaTS.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-13 - AdicionEtiquetaTS>
		* Nodo/s del Árbol de Derivación: <15>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionEtiquetaTS() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionEtiquetaTS.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-14 - ModificacionEtiquetaTS>
		* Nodo/s del Árbol de Derivación: <50>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: invalid input for Time in JSON.>
		*/
		@Test
		public final void ModificacionEtiquetaTS() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionEtiquetaTS.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: invalid input for Time in JSON.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-15 - OmisionSeparadorFecha>
		* Nodo/s del Árbol de Derivación: <17>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionSF() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionSF.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-16 - AdicionSeparadorFecha>
		* Nodo/s del Árbol de Derivación: <17>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionSF() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionSF.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-17 - ModifiacionSeparadorFecha>
		* Nodo/s del Árbol de Derivación: <52>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionSF() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionSF.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-18 - Omision medidas Accel>
		* Nodo/s del Árbol de Derivación: <8>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: ACCEL_X in JSON input data is not a number.>
		*/
		@Test
		public final void OmisionMA() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("SinCampoDeEje.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: ACCEL_X in JSON input data is not a number.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-19 - Adición medidas Accel>
		* Nodo/s del Árbol de Derivación: <8>
		 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionMA() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("VariosCamposDeEje.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-20 - Omision etiqueta Accel>
		* Nodo/s del Árbol de Derivación: <30>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionEtiquetaAccel() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionEtiquetaAccel.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-21 - Adicion etiqueta Accel>
		* Nodo/s del Árbol de Derivación: <30>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionEtiquetaAccel() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionEtiquetaAccel.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-22 - Modificacion etiqueta Accel>
		* Nodo/s del Árbol de Derivación: <65>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionEtiquetaAccel() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionEtiquetaAccel.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		
		/* Caso de Prueba: <CP-RF2-23 - Modificacion decimales Accel>
		* Nodo/s del Árbol de Derivación: <70>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionDecimalAccel() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("DecimalesImprecisos.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-24 - Omision punto Accel>
		* Nodo/s del Árbol de Derivación: <33>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: Invalid separator for decimal number.>
		*/
		@Test
		public final void OmisionPuntoDecimal() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionPunto.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: Invalid separator for decimal number.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-25 - Adicion punto Accel>
		* Nodo/s del Árbol de Derivación: <33>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionPuntoDecimal() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionPunto.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-26 - Modificacion punto Accel>
		* Nodo/s del Árbol de Derivación: <69>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionPuntoDecimal() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("NoSeparadosPunto.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-27 -  Omision Latitud>
		* Nodo/s del Árbol de Derivación: <9>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("SinLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-28 -  Adicion Latitud>
		* Nodo/s del Árbol de Derivación: <9>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("VariosCamposDeLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-29 -  Omision etiqueta Latitud>
		* Nodo/s del Árbol de Derivación: <36>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionEtiquetaLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionEtiquetaLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-30 -  Adicion etiqueta Latitud>
		* Nodo/s del Árbol de Derivación: <36>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionEtiquetaLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionEtiquetaLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-31 -  Modificacion etiqueta Latitud>
		* Nodo/s del Árbol de Derivación: <72>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: LATITUDE in JSON input data is not a number.>
		*/
		@Test
		public final void ModificacionEtiquetaLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionEtiquetaLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: LATITUDE in JSON input data is not a number.", message);
		}
		
		
		/* Caso de Prueba: <CP-RF2-32 -  Modificacion signo Latitud>
		* Nodo/s del Árbol de Derivación: <73>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionSignoLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionSignoLatitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-33 -  Modificacion decimales Latitud>
		* Nodo/s del Árbol de Derivación: <77>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: less than 7 decimals for LATITUDE in JSON input data.>
		*/
		@Test
		public final void ModificacionDecimalesLatitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("LatitudNoExacta.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: less than 7 decimals for LATITUDE in JSON input data.", message);
		}
		

		/* Caso de Prueba: <CP-RF2-34 -  Omision Longitud>
		* Nodo/s del Árbol de Derivación: <10>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: LONGITUDE in JSON input data is not a number.>
		*/
		@Test
		public final void OmisionLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("SinLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: LONGITUDE in JSON input data is not a number.", message);
		}
		

		/* Caso de Prueba: <CP-RF2-35 -  Adicion Longitud>
		* Nodo/s del Árbol de Derivación: <10>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("VariosLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		
		/* Caso de Prueba: <CP-RF2-36 - Omision etiqueta Longitud>
		* Nodo/s del Árbol de Derivación: <42>
		 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void OmisionEtiquetaLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("OmisionEtiquetaLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-37 - Adicion etiqueta Longitud>
		* Nodo/s del Árbol de Derivación: <42>
		 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void AdicionEtiquetaLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("AdicionEtiquetaLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-38 - Modificacion etiqueta Longitud>
		* Nodo/s del Árbol de Derivación: <79>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: Invalid key value in input JSON>
		*/
		@Test
		public final void ModificacionEtiquetaLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionEtiquetaLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: Invalid key value in input JSON.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-39 - Modificacion signo Longitud>
		* Nodo/s del Árbol de Derivación: <80>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: could not read data from input file.>
		*/
		@Test
		public final void ModificacionSignoLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("ModificacionSignoLongitud.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: could not read data from input file.", message);
		}
		
		/* Caso de Prueba: <CP-RF2-40 - Modificacion decimales Longitud>
		* Nodo/s del Árbol de Derivación: <84>
		 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <Error: less than 7 decimals for LONGITUDE in JSON input data.>
		*/
		@Test
		public final void ModificacionDecimalesLongitud() {
			String message ="";
			
			try {
			calculadora.CalculateSpeed("LongitudNoExacta.json", 60);
			}catch(AGCException ex){
				ex.printStackTrace();
				message = ex.getMessage();
			}
			Assert.assertEquals("Error: less than 7 decimals for LONGITUDE in JSON input data.", message);
		}


		/* Caso de Prueba: <CP-RF2-01 -  Funcionamiento Correcto>
		* Nodo/s del Árbol de Derivación: <Todos menos aquellos de signo negativo>
		 Tipo de Prueba: <Corecta>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <JSON con el resultado>
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
		

		/* Caso de Prueba: <CP-RF2-02 -  Funcionamiento Correcto>
		* Nodo/s del Árbol de Derivación: <Todos menos aquellos de signo positivo>
		 Tipo de Prueba: <Corecta>  Técnica de prueba: Análisis Sintáctico
		* Resultado Esperado: <JSON con el resultado>
		*/
		
		@Test
		public final void valido2() throws AGCException {
			
			SpeedByAxes result = calculadora.CalculateSpeed("PruebaNegativo.json", 60);
			
			////// poner resultados que salgan por pantalla
			Assert.assertEquals(0.0036f, result.getX_Axis().getmeanSpeed(), 0.0001f);
			Assert.assertEquals(0.0054f, result.getY_Axis().getmeanSpeed(), 0.0001f);
			Assert.assertEquals(0.0018f, result.getZ_Axis().getmeanSpeed(), 0.0001f);
			Assert.assertEquals(0.0036f, result.getX_Axis().getvarSpeed(), 0.0001f);
			Assert.assertEquals(0.0054f, result.getY_Axis().getvarSpeed(), 0.0001f);
			Assert.assertEquals(0.0018f, result.getZ_Axis().getvarSpeed(), 0.0001f);
		}
	}


