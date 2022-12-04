import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadiciacaoQuadradaTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "81,9" })	
	public void deveRetornarARaizQuadrada(double a, double expected) {
		assertEquals(expected, calculadora.raizQuadrada(a), 1);
	}


}
