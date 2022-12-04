import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DivisaoTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setup() {
		calculadora = new Calculadora();
	}

	@ParameterizedTest
	@CsvSource({ "10,5,2", "9,9,1" })	
	public void deveRetornarUmaDivisao(int a, int b, int expected) {
		assertEquals(expected, calculadora.dividir(a, b));
	}

}
