package CodGirls;

public class Calculadora {
	
	public static void soma(double n1, double n2) {
		
		double result = n1 + n2;
		
		System.out.println("A soma de " + n1 + " mais " + n2 + " é " + result);
	}
	
	public static void subtracao(double n1, double n2) {
		
		double result = n1 - n2;
		
		System.out.println("A subtração de " + n1 + " menos " + n2 + " é " + result);
	}
	
	public static void multiplicacao(double n1, double n2) {
		
		double result = n1 * n2;
		
		System.out.println("A multiplicação de " + n1 + " vezes " + n2 + " é " + result);
		
	}
	
	public static void divisao(double n1, double n2) {
		
		double result = n1 / n2;
		
		System.out.println("A divisão de " + n1 + " por " + n2 + " é " + result);
		
	}
}
