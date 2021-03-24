package APSaula5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ validaAnoFabricacaoTest.class, ValidaIdCarroTest.class, validaMarcaCarroTest.class,
		validaModelCarroTest.class, validaPlacaCarroTest.class, validaPrecoFabricacaoTest.class })
public class ValidaCarroTests {

}
