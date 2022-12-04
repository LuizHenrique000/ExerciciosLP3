import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExponenciacaoTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "5,2,25", "2,2,4" })	
	public void deveRetornarUmProdutoDeUmaPotenciaDeUmValor(int a, int b, int expected) {
		assertEquals(expected, calculadora.potencia(a,b));
	}

}
