package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaPlacaCarroTest {
	/*
	 * //4. campo placa, obrigatório, total de caracteres deve ser igual a 8. Ex:
	 * IEV-7889 public boolean validaPlacaCarro(String placa) {
	 * 
	 * Regra de negocio original -> if (placa.length() == 8) { return true; } return false;
	 * 
	 * }
	 */
	@Test
	public void TestePlaca7chars() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Abc1234";
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaPlacaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TestePlaca8chars() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Abcd1234";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaPlacaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TestePlaca9chars() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Abcd12345";
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaPlacaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}

}
