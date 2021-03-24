package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaMarcaCarroTest {
	/*
	 * //3. campo marca, obrigatório, aceitar somente os valores (VW, GM) public
	 * Regra de negocio original ->  boolean validaMarcaCarro(String marca) {
	 * 								 if (marca.equals("VW") || marca.equals("GM")) { return true; } return false;}
	 * 
	 * 
	 */
	@Test
	public void TesteGM() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "VW";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMarcaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TesteVW() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "GM";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMarcaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}

	@Test
	public void TesteFiat() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Fiat";
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaMarcaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TesteGMMinusculo() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "gm";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMarcaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void TesteVWMinusculo() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "vw";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMarcaCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}



}
