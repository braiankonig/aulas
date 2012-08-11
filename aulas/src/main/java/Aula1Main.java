import br.com.senac.alp.aulas.PrimeiraAula;


public class Aula1Main {

	public static void main(String[] args) {
		
		testeComNull();
	}
		
	private static void testeComNull() {
			
		PrimeiraAula obj = null;
		double esperado = 0.0;
		double resultado = 0.0;
			
		obj = PrimeiraAula.getInstancia();
		resultado = obj.somaTotal(null);
		esperado = Double.NaN;
			
		if (Double.compare(resultado, esperado) == 0) {
			System.out.println("Teste com null: OK");
		} else {
			System.out.println("Teste com null: NOK");
		}
			
	}
		
		

	

}
