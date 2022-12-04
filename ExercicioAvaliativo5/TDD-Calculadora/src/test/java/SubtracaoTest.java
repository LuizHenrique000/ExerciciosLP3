import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SubtracaoTest {
	
	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "5,5,0", "9,5,4" })	
	public void deveRetornarUmaSubtracao(int a, int b, int expected) {
		assertEquals(expected, calculadora.subtrair(a,b));
	}

}
