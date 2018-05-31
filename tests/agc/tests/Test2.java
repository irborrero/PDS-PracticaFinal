package agc.tests;

import org.junit.Assert;
import org.junit.Test;

import agc.AGCManager;
import agc.exceptions.AGCException;

public class Test2 {

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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionInicio() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionInicio() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionInicio() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionInicioMed() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionInicioMed() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionInicioMed() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionTimeStamp() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionTimeStamp() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionEtiquetaTS() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionEtiquetaTS() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionEtiquetaTS() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionSF() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionSF() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionSF() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionMA() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionMA() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionEtiquetaAccel() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionEtiquetaAccel() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionEtiquetaAccel() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionDecimalAccel() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionPuntoDecimal() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionPuntoDecimal() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionPuntoDecimal() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionEtiquetaLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionEtiquetaLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionEtiquetaLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionSignoLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionDecimalesLatitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void OmisionEtiquetaLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void AdicionEtiquetaLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionEtiquetaLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
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
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void ModificacionSignoLongitud() {
		String message ="";
		AGCManager calculadora = new AGCManager();
		try {
		calculadora.CalculateDist("ModificacionSignoLongitud.json", 60);
		}catch(AGCException ex){
			ex.printStackTrace();
			message = ex.getMessage();
		}
		Assert.assertEquals("Error: could not read data from input file.", message);
	}


}