package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaAnoFabricacaoTest {
	/*
	 * //5. campo ano Fabricação, obrigatório, aceitar somente números acima de 1980
	 * public boolean validaAnoFabricacao(int ano) {
	 * 
	 * Regra de negocio original -> if (ano > 1980) { return true; } return false; }
	 */
	@Test
	public void TesteAno1979() {
		ValidaCarro objExerc = new ValidaCarro();		
			int entradaUser = 1979;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaAnoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TesteAno1980() {
		ValidaCarro objExerc = new ValidaCarro();		
			int entradaUser = 1980;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaAnoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TesteAno1981() {
		ValidaCarro objExerc = new ValidaCarro();		
			int entradaUser = 1981;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaAnoFabricacao(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}

}
