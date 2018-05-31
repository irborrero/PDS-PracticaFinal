package agc.tests;

import org.junit.Assert;
import org.junit.Test;

import agc.AGCManager;
import agc.exceptions.AGCException;
import agc.data.DistByAxes;

public class Test2 {
	
	///////////////7FALTA:
	// CASOS VALIDOS Y MODIFICAR EXCEPCIONES

	/* Caso de Prueba: <CP-RF1-03 - Fichero Inexistente>
	* Nodo/s del Árbol de Derivación: <1>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	
	AGCManager calculadora = new AGCManager();
	
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
	
	/* Caso de Prueba: <CP-RF1-04 - Omisión inicio objeto>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionInicio() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionInicio.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-05 - Adición inicio objeto>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionInicio() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionInicio.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-06 - Modificacion inicio objeto>
	* Nodo/s del Árbol de Derivación: <5>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionInicio() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionInicio.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	

	/* Caso de Prueba: <CP-RF1-07 - Omision inicio medicion>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionInicioMed() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionInicioMed.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	
	/* Caso de Prueba: <CP-RF1-08 - Adicion inicio medicion>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionInicioMed() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionInicioMed.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	

	/* Caso de Prueba: <CP-RF1-09 - Modificacion inicio medicion>
	* Nodo/s del Árbol de Derivación: <14>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionInicioMed() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionInicioMed.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-10 - OmisionTimeStamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionTimeStamp() {
		String message ="";
		
		try {
		calculadora.CalculateDist("SinTimeStamp.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	
	/* Caso de Prueba: <CP-RF1-11 - AdicionTimeStamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionTimeStamp() {
		String message ="";
		
		try {
		calculadora.CalculateDist("VariosTimeStamp.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-12 - OmisionEtiquetaTS>
	* Nodo/s del Árbol de Derivación: <15>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionEtiquetaTS() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionEtiquetaTS.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-13 - AdicionEtiquetaTS>
	* Nodo/s del Árbol de Derivación: <15>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionEtiquetaTS() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionEtiquetaTS.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-14 - ModificacionEtiquetaTS>
	* Nodo/s del Árbol de Derivación: <50>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionEtiquetaTS() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionEtiquetaTS.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-15 - OmisionSeparadorFecha>
	* Nodo/s del Árbol de Derivación: <17>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionSF() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionSF.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-16 - AdicionSeparadorFecha>
	* Nodo/s del Árbol de Derivación: <17>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionSF() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionSF.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-17 - ModifiacionSeparadorFecha>
	* Nodo/s del Árbol de Derivación: <52>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionSF() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionSF.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-18 - Omision medidas Accel>
	* Nodo/s del Árbol de Derivación: <8>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionMA() {
		String message ="";
		
		try {
		calculadora.CalculateDist("SinCampoDeEje.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-19 - Adición medidas Accel>
	* Nodo/s del Árbol de Derivación: <8>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionMA() {
		String message ="";
		
		try {
		calculadora.CalculateDist("VariosCamposDeEje.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-20 - Omision etiqueta Accel>
	* Nodo/s del Árbol de Derivación: <30>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionEtiquetaAccel() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionEtiquetaAccel.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-21 - Adicion etiqueta Accel>
	* Nodo/s del Árbol de Derivación: <30>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionEtiquetaAccel() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionEtiquetaAccel.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-22 - Modificacion etiqueta Accel>
	* Nodo/s del Árbol de Derivación: <65>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionEtiquetaAccel() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionEtiquetaAccel.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	
	/* Caso de Prueba: <CP-RF1-23 - Modificacion decimales Accel>
	* Nodo/s del Árbol de Derivación: <70>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionDecimalAccel() {
		String message ="";
		
		try {
		calculadora.CalculateDist("DecimalesImprecisos.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-24 - Omision punto Accel>
	* Nodo/s del Árbol de Derivación: <33>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionPuntoDecimal() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionPunto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-25 - Adicion punto Accel>
	* Nodo/s del Árbol de Derivación: <33>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionPuntoDecimal() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionPunto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-26 - Modificacion punto Accel>
	* Nodo/s del Árbol de Derivación: <69>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionPuntoDecimal() {
		String message ="";
		
		try {
		calculadora.CalculateDist("NoSeparadosPunto.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-27 -  Omision Latitud>
	* Nodo/s del Árbol de Derivación: <9>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("SinLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-28 -  Adicion Latitud>
	* Nodo/s del Árbol de Derivación: <9>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("VariosCamposDeLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-29 -  Omision etiqueta Latitud>
	* Nodo/s del Árbol de Derivación: <36>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionEtiquetaLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionEtiquetaLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-30 -  Adicion etiqueta Latitud>
	* Nodo/s del Árbol de Derivación: <36>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionEtiquetaLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionEtiquetaLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-31 -  Modificacion etiqueta Latitud>
	* Nodo/s del Árbol de Derivación: <72>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionEtiquetaLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionEtiquetaLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	
	/* Caso de Prueba: <CP-RF1-32 -  Modificacion signo Latitud>
	* Nodo/s del Árbol de Derivación: <73>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionSignoLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionSignoLatitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-33 -  Modificacion decimales Latitud>
	* Nodo/s del Árbol de Derivación: <77>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionDecimalesLatitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("LatitudNoExacta.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	

	/* Caso de Prueba: <CP-RF1-34 -  Omision Longitud>
	* Nodo/s del Árbol de Derivación: <10>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("SinLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	

	/* Caso de Prueba: <CP-RF1-35 -  Adicion Longitud>
	* Nodo/s del Árbol de Derivación: <10>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("VariosLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	
	/* Caso de Prueba: <CP-RF1-36 - Omision etiqueta Longitud>
	* Nodo/s del Árbol de Derivación: <42>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void OmisionEtiquetaLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("OmisionEtiquetaLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-37 - Adicion etiqueta Longitud>
	* Nodo/s del Árbol de Derivación: <42>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void AdicionEtiquetaLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("AdicionEtiquetaLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-38 - Modificacion etiqueta Longitud>
	* Nodo/s del Árbol de Derivación: <79>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionEtiquetaLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionEtiquetaLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-39 - Modificacion signo Longitud>
	* Nodo/s del Árbol de Derivación: <80>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionSignoLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("ModificacionSignoLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}
	
	/* Caso de Prueba: <CP-RF1-40 - Modificacion decimales Longitud>
	* Nodo/s del Árbol de Derivación: <84>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Error: could not read data from input file.>
	*/
	@Test
	public final void ModificacionDecimalesLongitud() {
		String message ="";
		
		try {
		calculadora.CalculateDist("LongitudNoExacta.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}


	/* Caso de Prueba: <CP-RF1-01 -  Funcionamiento Correcto>
	* Nodo/s del Árbol de Derivación: <Todos menos aquellos de signo negativo>
	 Tipo de Prueba: <Corecta>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <JSON con el resultado>
	*/
	
	@Test
	public final void valido1() throws AGCException {
		
		DistByAxes result = calculadora.CalculateDist("Prueba1.json", 60);
		
		Assert.assertEquals(0.0036f, result.getdist_X(), 0.0001f);
		Assert.assertEquals(0.0054f, result.getdist_Y(), 0.0001f);
		Assert.assertEquals(0.0018f, result.getdist_Z(), 0.0001f);
	}
	

	/* Caso de Prueba: <CP-RF1-02 -  Funcionamiento Correcto>
	* Nodo/s del Árbol de Derivación: <Todos menos aquellos de signo positivo>
	 Tipo de Prueba: <Corecta>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <JSON con el resultado>
	*/
	
	@Test
	public final void valido2() throws AGCException {
		
		DistByAxes result = calculadora.CalculateDist("PruebaNegativo.json", 60);
		
		////// no sale por pantalla
		Assert.assertEquals(0.0036f, result.getdist_X(), 0.0001f);
		Assert.assertEquals(0.0054f, result.getdist_Y(), 0.0001f);
		Assert.assertEquals(0.0018f, result.getdist_Z(), 0.0001f);
	}

}
