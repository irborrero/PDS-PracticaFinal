package agc.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.AGCCalculator;
import agc.data.FullTurnByAxes;
import agc.exceptions.AGCException;

public class RF2AnalisisSintacticoTest {
	
	private AGCCalculator calculadora;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculadora = new agc.AGCCalculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		calculadora = null;
	}
	
	/* Caso de Prueba: <CP-RF2-03 - Fichero Inexistente>
	* Nodo/s del Árbol de Derivación: <1>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("hola.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero inexistente", message);
	}

	/* Caso de Prueba: <CP-RF2-04 - Fichero sin corchete de inicio>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void SinCorchete() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("FicheroSinCorchete.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-05 - Fichero con dos corchetes>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void DosCorchetes() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("FicheroCon2Corchetes.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-06 - Fichero con inicio de objeto modificado>
	* Nodo/s del Árbol de Derivación: <5>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void InicioObjetoModificado() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("InicioObjetoModificado.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-07 - Omisión del inicio de medición>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void SinInicioMedicion() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("SinInicioMedicion.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-08 - Adición del inicio de medición>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void DosIniciosMedicion() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("DosIniciosMedicion.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-09 - Modificación del inicio de medición>
	* Nodo/s del Árbol de Derivación: <13>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void IniciosMedicionModificado() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("InicioMedicionModificado.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-10 - Omisión  timestamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionTimeStamp () {
		String message ="";
		try {
			calculadora.CalculateFullTurn("SinTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-11 - Adición timestamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionTimestamp() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-12 - Omision etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <14>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-13 - Adicion etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <14>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-14 - Modificación etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <64>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-15 - Omisión separador fecha>
	* Nodo/s del Árbol de Derivación: <16>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-16 - Adición separador fecha>
	* Nodo/s del Árbol de Derivación: <16>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-17 - Modificación separador fecha>
	* Nodo/s del Árbol de Derivación: <66>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF2-18 - Omisión medidas giroscopio>
	* Nodo/s del Árbol de Derivación: <8>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionMedidasGiro() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionMedidasGiro.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-19 - Adición medidas giroscopio>
	* Nodo/s del Árbol de Derivación: <8>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionMedidasGiro() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionMedidasGiro.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-20 - Omisión etiqueta giroX>
	* Nodo/s del Árbol de Derivación: <29>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionEtiquetaGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionEtiquetaGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-21 - Adición etiqueta giroX>
	* Nodo/s del Árbol de Derivación: <29>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionEtiquetaGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionEtiquetaGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-22 - Modificación etiqueta giroX>
	* Nodo/s del Árbol de Derivación: <79>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionEtiquetaGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionEtiquetaGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-23 - Modificación grados giro X>
	* Nodo/s del Árbol de Derivación: <80>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionGradosGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionGradosGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-24 - Modificación decimales giro X>
	* Nodo/s del Árbol de Derivación: <82>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionDecimalesGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionDecimalesGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-25 - Omisión separador campo giroX>
	* Nodo/s del Árbol de Derivación: <33>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionSeparadorGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionSeparadorGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-26 - Adición separador campo giroX>
	* Nodo/s del Árbol de Derivación: <33>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionSeparadorGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionSeparadorGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-27 - Modificación separador campo giroX>
	* Nodo/s del Árbol de Derivación: <83>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionSeparadorGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionSeparadorGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-28 - Omisión punto giroX>
	* Nodo/s del Árbol de Derivación: <36>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionPuntoGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("OmisionPuntoGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-29 - Adición punto giroX>
	* Nodo/s del Árbol de Derivación: <36>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionPuntoGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("AdicionPuntoGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-30 - Modificación punto giroX>
	* Nodo/s del Árbol de Derivación: <86>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionPuntoGiroX() {
		String message ="";
		try {
			calculadora.CalculateFullTurn("ModificacionPuntoGiroX.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF2-01 - Todos los nodos no terminales cubiertos>
	* Nodo/s del Árbol de Derivación: <Todos los nodos no terminales>
	 Tipo de Prueba: <Valor Normal>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Generación de un Fichero JSON con resultado>
	*/
	@Test
	public final void CorrectInput() throws AGCException {
	
		FullTurnByAxes result= calculadora.CalculateFullTurn("FicheroCorrecto.json", 0, 19);

		Assert.assertEquals(0.00000f, result.getFullTurn_X(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getFullTurn_Y(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getFullTurn_Z(), 0.0001f);

	}
}
