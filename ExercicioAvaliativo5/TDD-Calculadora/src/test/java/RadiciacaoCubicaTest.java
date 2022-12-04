import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadiciacaoCubicaTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "27,3" })	
	public void deveRetornarARaizCubica(double a, double expected) {
		assertEquals(expected, calculadora.raizCubica(a), 1);
	}

}
