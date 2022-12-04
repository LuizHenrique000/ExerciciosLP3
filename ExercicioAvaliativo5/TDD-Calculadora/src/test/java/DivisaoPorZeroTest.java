import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class DivisaoPorZeroTest {

	Calculadora calculadora;

	private final int VALOR_A = 50;
	private final int ZERO = 0;
	
	@Before
    public void setup() {
        calculadora = new Calculadora();
    }
	
	@Test
    public void deveLancarUnsupportedOperationExceptionAoDividirPorZero() throws UnsupportedOperationException{
        assertThrows(UnsupportedOperationException.class, () -> calculadora.dividir(VALOR_A,ZERO));
    }


}
