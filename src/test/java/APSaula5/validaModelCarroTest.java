package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class validaModelCarroTest {
	/*
	 * //2. campo modelo, obrigatório, máximo de caracteres 20 public boolean
	 * Regra de negocio original -> validaModelCarro(String modelo) {if (modelo.length() > 20) { return false; } return true;}
	 */
	@Test
	public void Teste3Caracteres() {
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Up!";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaModelCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void Teste19Caracteres() {				
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Huracan-Performante";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaModelCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void Teste20Caracteres() {				
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Mn-John-Cooper-Works";
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaModelCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void Teste21Caracteres() {				
		ValidaCarro objExerc = new ValidaCarro();		
		String entradaUser = "Huracan-Supperleggera";
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaModelCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
}
