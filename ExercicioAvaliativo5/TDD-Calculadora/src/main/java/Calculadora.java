public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0){
            throw new UnsupportedOperationException("Não é possivel dividir por 0");
        }
        return dividendo / divisor;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int potencia(int base, int expoente){
        return (int) Math.pow(base, expoente);
    }
    
    public double raizQuadrada(double radicando) {
    	return Math.sqrt(radicando);
    }
    
    public double raizCubica(double radicando) {
    	return Math.cbrt(radicando);
    }
}
