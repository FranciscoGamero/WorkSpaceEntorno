package ejemplo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El factorial de 5 es "+factorial(5));
	}
	public static int factorial(int n) {
		int resultado = 1;
		for (int i = n; i>=1 ; i++) {
			resultado=resultado*i;
		}
		return resultado;
	}
}

