import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdicaoTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "5,5,10", "9,5,14" })	
	public void deveRetornarUmaSoma(int a, int b, int expected) {
		assertEquals(expected, calculadora.somar(a,b));
	}

}
