package agc.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agc.logic.Calculator;
import agc.data.AccelerationByAxes;
import agc.exceptions.AGCException;

public class RF1AnalisisSintacticoTest {
	
	private Calculator calculadora;
	
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
		calculadora = new AGCCalculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		calculadora= null;
	}

	/* Caso de Prueba: <CP-RF1-03 - Fichero Inexistente>
	* Nodo/s del Árbol de Derivación: <1>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero inexistente>
	*/
	@Test
	public final void FicheroInexistente() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("hola.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero inexistente", message);
	}
	
	/* Caso de Prueba: <CP-RF1-04 - Fichero sin corchete de inicio>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void SinCorchete() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("FicheroSinCorchete.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-05 - Fichero con dos corchetes>
	* Nodo/s del Árbol de Derivación: <2>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void DosCorchetes() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("FicheroCon2Corchetes.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-06 - Fichero con inicio de objeto modificado>
	* Nodo/s del Árbol de Derivación: <5>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void InicioObjetoModificado() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("InicioObjetoModificado.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-07 - Omisión del inicio de medición>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void SinInicioMedicion() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("SinInicioMedicion.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-08 - Adición del inicio de medición>
	* Nodo/s del Árbol de Derivación: <6>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void DosIniciosMedicion() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("DosIniciosMedicion.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF1-09 - Modificación del inicio de medición>
	* Nodo/s del Árbol de Derivación: <13>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void IniciosMedicionModificado() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("InicioMedicionModificado.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}

	/* Caso de Prueba: <CP-RF1-10 - Omisión  timestamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionTimeStamp () {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("SinTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-11 - Adición timestamp>
	* Nodo/s del Árbol de Derivación: <7>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionTimestamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-12 - Omision etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <14>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("OmisionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-13 - Adicion etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <14>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-14 - Modificación etiqueta TimeStamp>
	* Nodo/s del Árbol de Derivación: <64>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionEtiquetaTimestamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("ModificacionEtiquetaTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-15 - Omisión separador fecha>
	* Nodo/s del Árbol de Derivación: <16>
	 Tipo de Prueba: <Omision>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("OmisionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-16 - Adición separador fecha>
	* Nodo/s del Árbol de Derivación: <16>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-17 - Modificación separador fecha>
	* Nodo/s del Árbol de Derivación: <66>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionSeparadorFecha() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("ModificacionSeparadorFecha.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-31 - Omisión medidas acelerómetro>
	* Nodo/s del Árbol de Derivación: <9>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionMedidasAcc() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("OmisionMedidasAcc.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-32 - Adición medidas acelerómetro>
	* Nodo/s del Árbol de Derivación: <9>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionMedidasAcc() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionMedidasAcc.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-33 - Omisión etiqueta AccelY>
	* Nodo/s del Árbol de Derivación: <50>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionEtiquetaAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("OmisionEtiquetaAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-34 - Adición etiqueta AccelY>
	* Nodo/s del Árbol de Derivación: <50>
	 Tipo de Prueba: <Adición>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionEtiquetaAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionEtiquetaAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-35 - Modificación etiqueta AccelY>
	* Nodo/s del Árbol de Derivación: <101>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionEtiquetaAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("ModificacionEtiquetaAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-36 - Modificación decimales AccelY>
	* Nodo/s del Árbol de Derivación: <106>
	 Tipo de Prueba: <Modificación>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionDecimalesAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("ModificacionDecimalesAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-37 -  Omisión punto AccelY>
	* Nodo/s del Árbol de Derivación: <53>
	 Tipo de Prueba: <Omisión>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void OmisionPuntoAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("OmisionPuntoAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-38 - Adición punto AccelY>
	* Nodo/s del Árbol de Derivación: <53>
	 Tipo de Prueba: <Adicion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void AdicionPuntoAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("AdicionPuntoAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-39 -  Omisión punto AccelY>
	* Nodo/s del Árbol de Derivación: <105>
	 Tipo de Prueba: <Modificacion>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Fichero con sintaxis incorrecta>
	*/
	@Test
	public final void ModificacionPuntoAccelY() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("ModificacionPuntoAccelY.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero con sintaxis incorrecta", message);
	}
	
	/* Caso de Prueba: <CP-RF1-01 -  Todos los nodos terminales cubiertos menos aquellos de signo negativo>
	* Nodo/s del Árbol de Derivación: <Todos los nodos terminales excepto 96, 103, 110>
	 Tipo de Prueba: <Valor Normal>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Generación de un Fichero JSON con resultado>
	*/
	@Test
	public final void CorrectInputTerminalesPositivos() throws AGCException {
		int inicio = 0;
		int duracion = 19;
		String path = "FicheroCorrectoPositivo.json";
			
		AccelerationByAxes result= calculadora.CalculateMinMaxAcceleration(path, inicio, duracion);
		
		Assert.assertEquals(0.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: <CP-RF1-02 -  Todos los nodos terminales cubiertos menos aquellos de signo positivo>
	* Nodo/s del Árbol de Derivación: <Todos los nodos terminales excepto 95, 102, 109>
	 Tipo de Prueba: <Valor Normal>  Técnica de prueba: Análisis Sintáctico
	* Resultado Esperado: <Generación de un Fichero JSON con resultado>
	*/
	@Test
	public final void CorrectInputTerminalesNegativos() throws AGCException {
		int inicio = 21;
		int duracion = 1;
		String path = "FicheroCorrectoNegativo.json";
			
		AccelerationByAxes result= calculadora.CalculateMinMaxAcceleration(path, inicio, duracion);
		
		Assert.assertEquals(-1.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(-1.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(-1.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(-1.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(-1.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(-1.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-28 - Time Stamp no respeta intervalo de 20 ms>
	 *Clase equivalencia: CEI44
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <TimeStamp con intervalo incorrecto>
	 */
	@Test
	public final void TimeStampIrrespetuoso() {
		String message ="";
			try {
				calculadora.CalculateFullTurn("Fichero_TimeStampIrrespetuoso.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("TimeStamp con intervalo incorrecto", message);
	
	}
	
}
