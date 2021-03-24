package APSaula5;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import APSaula5.ValidaCarro;

public class ValidaIdCarroTest {
	/*
	 * //1. campo id, aceitar somente número acima de 0 public boolean
	 * Regra de negocio original -> validaIdCarro(int id) { if (id < 0) { return false; } return true;}
	 */
	@Test
		public void ValidaIdNegativo() {				
			ValidaCarro objExerc = new ValidaCarro();		
				int entradaUser = -1;
				boolean resultadoesperado = false;
				boolean resultadoPrograma = objExerc.validaIdCarro(entradaUser);
				Assert.assertEquals(resultadoesperado, resultadoPrograma);
			}
	@Test
	public void ValidaIdZero() {				
		ValidaCarro objExerc = new ValidaCarro();		
			int entradaUser = 0;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaIdCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void ValidaIdCorreto() {				
		ValidaCarro objExerc = new ValidaCarro();		
			int entradaUser = 1;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaIdCarro(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	}
