import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplicaoTest {
	
	private Calculadora calculadora;
	
	@BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

	@ParameterizedTest
	@CsvSource({ "5,6,30", "9,5,45" })	
    public void deveMultiplicarDoisNumerosCorretamente(int a, int b, int expected){
        assertEquals(expected, calculadora.multiplicar(a,b));
    }

}
