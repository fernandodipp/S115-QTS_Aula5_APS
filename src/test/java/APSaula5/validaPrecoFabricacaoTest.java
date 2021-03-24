package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaPrecoFabricacaoTest {
	/*
	 * //7. campo valor total, somente números, entre 1 à 50.000 public boolean
	 * validaPrecoFabricacao(float valor) {
	 * 
	 * Regra de negocio original -> if (valor > 1 && valor < 50000) { return true; } return false; }
	 */
	@Test
	public void TestePrecoLimMin() {
		ValidaCarro objExerc = new ValidaCarro();		
			float entradaUser = 1;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaPrecoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TestePrecoLimMax() {
		ValidaCarro objExerc = new ValidaCarro();		
			float entradaUser = 50000;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaPrecoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TestePrecoValido1() {
		ValidaCarro objExerc = new ValidaCarro();		
			float entradaUser = 45000;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaPrecoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TestePrecoInvalido1() {
		ValidaCarro objExerc = new ValidaCarro();		
			float entradaUser = 120000;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaPrecoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}

}
