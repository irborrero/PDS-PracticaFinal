package agc.tests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import agc.*;
import agc.data.AccelerationByAxes;
import agc.exceptions.AGCException;


public class RF1ClasesDeEquivalenciaTest {
	
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
		calculadora = new AGCCalculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		calculadora=null;
	}

	/* Caso de Prueba: <CP-AGCRF01-01 - Ruta fichero inexistente>
	*Clase equivalencia: CEI2
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero inexistente>
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

	/* Caso de Prueba: <CP-AGCRF01-02 - Sintaxis incorrecta>
	*Clase equivalencia: CEI4
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Sintaxis incorrecta>
	*/
	@Test
	public final void SintaxisIncorrecta() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("FicheroIncorrecto.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Sintaxis Incorrecta", message);
		
	}
	
	/* Caso de Prueba: <CP-AGCRF01-03 - Time Stamp no aparece en el fichero de entrada>
	*Clase equivalencia: CEI9
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero no contiene time_stamp>
	*/
	@Test
	public final void SinTimeStamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("Fichero_sinTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero no contiene time_stamp", message);
	}
	
	
	/* Caso de Prueba: <CP-AGCRF01-04 - Time Stamp aparece varias veces>
	*Clase equivalencia: CEI10
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero contiene varios time_stamp>
	*/
	@Test
	public final void VariosTimeStamp() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("Fichero_variosTimeStamp.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Fichero contiene varios time_stamp", message);
	}
	
	
	/* Caso de Prueba: <CP-AGCRF01-05 - Time Stamp sin precisión de milisegundos>
	*Clase equivalencia: CEI7
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Time Stamp sin precisión requerida>
	*/
	@Test
	public final void TimeStampImpreciso() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("Fichero_TimeStampImpreciso.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Time Stamp sin precisión requerida", message);
	}
	
	
	/*Caso de Prueba: <CP-AGCRF01-06 - Time Stamp tiene algún campo negativo>
	 *Clase equivalencia: CEI8
	 Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Time Stamp contiene algún campo negativo>
	*/
	@Test
	public final void TimeStampCampoNegativo() {
		String message ="";
		try {
			calculadora.CalculateMinMaxAcceleration("Fichero_TimeStampCampoNegativo.json", 1, 2);
		}catch(AGCException ex){
			message = ex.getMessage();
		}
		Assert.assertEquals("Time Stamp contiene algún campo negativo", message);
	}
	
	
	/* Caso de Prueba: < CP-AGCRF01-07 - El valor de aceleración del eje X no es un número decimal>
	 *Clase equivalencia: CEI12
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Valor de campo no es número decimal>
	 */
	@Test
	public final void ValorEjeNoDecimal() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_ValorEjeNoDecimal.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Valor de campo no es número decimal", message);
	}
	
	
	/* Caso de Prueba: < CP-AGCRF01-08 - Número decimal no separado por puntos>
	 *Clase equivalencia: CEI13
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con decimales en formato incorrecto>
	 */
	@Test
	public final void DecimalesSeparadosPuntos() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_DecimalesConPuntos.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Fichero con decimales en formato incorrecto", message);
	}
	
	
	/* Caso de Prueba: < CP-AGCRF01-09 - Número decimal con menos de tres posiciones decimales>
	 *Clase equivalencia: CEI14
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con valores con precisión incorrecta>
	 */
	@Test
	public final void MenosDeTresDecimales() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_MenosDeTresDecimales.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Fichero con valores con precisión incorrecta", message);
	}
	
	
	/* Caso de Prueba: < CP-AGCRF01-10 - No existe un campo para el eje X>
	 *Clase equivalencia: CEI19
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero sin campo de eje>
	 */
	@Test
	public final void SinCampoDeEje() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_SinCampoDeEje.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Fichero sin campo de eje", message);
	}
	

	/* Caso de Prueba: < CP-AGCRF01-11 - Existe más de un campo para el eje X>
	 *Clase equivalencia: CEI18
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Fichero con más de un campo para un eje>
	 */
	@Test
	public final void VariosCamposDeEje() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_VariosCamposDeEje.json", 1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Fichero con más de un campo para un eje", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-12 - Variable Inicio Negativa>
	 *Clase equivalencia: CEI21
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Variable Negativa no valida>
	 */
	@Test
	public final void VariableInicioNegativa() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", -5, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}
			Assert.assertEquals("Variable Negativa no valida", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-13 - Valor Variable Inicio: -1>
	 *Valor Límite Asociado: AVL5
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Variable negativa>
	 */
	@Test
	public final void VariableInicioValorLimiteInferior() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", -1, 2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Variable Negativa no valida", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-14 - Valor Inicio Variable: 0>
	 *Valor Límite Asociado: AVL6
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Ejecución correcta>
	 */
	@Test
	public final void VariableInicioValor0() throws AGCException {
		
		AccelerationByAxes result = calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", 0, 2);
		
		Assert.assertEquals(0.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-15 - Valor Inicio = Final-Inicial-Duracion>
	 *Valor Límite Asociado: AVL7
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Ejecución Correcta>
	 */
	@Test
	public final void VariableInicioDentroDeRango() throws AGCException {
		
		int inicio = 50; // 170 - 110 - 10 (Final-Inicial-Duracion)
		AccelerationByAxes result = calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", inicio, 10);

		Assert.assertEquals(3.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(2.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(3.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(2.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(2.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-16 - Valor Inicio = Final-Inicial-Duracion+1>
	 *Valor Límite Asociado: AVL8
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Variable introducida incorrecta>
	 */
	@Test
	public final void VariableInicioFueraDeRango() {
		String message ="";
		int inicio = 51; // 170 - 110 - 10 + 1 (Final-Inicial-Duracion+1)
			try {
				calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", inicio, 10);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Variable introducida incorrecta", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-17 - Variable Duracion Negativa>
	 *Clase equivalencia: CEI21
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Variable Negativa no valida>
	 */
	@Test
	public final void VariableDuracionNegativa() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("Fichero_CorrectoCE.json", 1, -2);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Variable Negativa no valida", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-18 - Valor Variable Duración: -1>
	 *Valor Límite Asociado: AVL5
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Variable Negativa no valida>
	 */
	@Test
	public final void VariableDuracionValorLimiteInferior() {
		String message ="";
			try {
				calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", 1, -1);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Variable Negativa no valida", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-19 - Valor Variable Duracion: 0>
	 *Valor Límite Asociado: AVL6
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Ejecución correcta>
	 */
	@Test
	public final void VariableDuracionValor0()  throws AGCException {
		
		AccelerationByAxes result = calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", 1, 0);
		
		Assert.assertEquals(0.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-20 - Valor Duracion = Final-Inicial-Inicio>
	 *Valor Límite Asociado: AVL9
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Ejecución Correcta>
	 */
	@Test
	public final void VariableDuracionDentroDeRango() throws AGCException {
		int duracion = 50; // 170 - 110 - 10 (Final-Inicial-Inicio)

		AccelerationByAxes result = calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", 10, duracion);

		Assert.assertEquals(3.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(3.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(3.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-21 - Valor Duracion = Final-Inicial-Inicio+1>
	 *Valor Límite Asociado: AVL10
	Técnica de prueba: <Valor Límite>  Resultado Esperado: <Variable introducida incorrecta>
	 */
	@Test
	public final void VariableDuracionFueraDeRango() {
		String message ="";
		int duracion = 21; // 140 - 110 - 10 + 1 (Final-Inicial-Inicio+1)
			try {
				calculadora.CalculateMinMaxAcceleration("FicheroCorrectoCE.json", 10, duracion);
			}catch(AGCException ex){
				message = ex.getMessage();
			}

			Assert.assertEquals("Variable introducida incorrecta", message);
	}
	
	/* Caso de Prueba: < CP-AGCRF01-22 - CORRECTO>
	 *Clase equivalencia: CLASES EQUIVALENCIA VÁLIDAS
	Técnica de prueba: <Clases de Equivalencia>  Resultado Esperado: <Ejecución correcta>
	 */
	@Test
	public final void CorrectInput() throws AGCException {
		int inicio = 1;
		int duracion = 19;
		String path = "FicheroCorrectoCE.json";
			
		AccelerationByAxes result= calculadora.CalculateMinMaxAcceleration(path, inicio, duracion);
		
		Assert.assertEquals(1.00000f, result.getX_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getX_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(1.00000f, result.getY_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getY_Axis().getMinAcceleration(), 0.0001f);
		Assert.assertEquals(1.00000f, result.getZ_Axis().getMaxAcceleration(), 0.0001f);
		Assert.assertEquals(0.00000f, result.getZ_Axis().getMinAcceleration(), 0.0001f);
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
