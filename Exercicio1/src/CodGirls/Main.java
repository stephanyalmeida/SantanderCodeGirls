package CodGirls;

public class Main {
	
   public static void main(String[] args) {
	   
	   //calculadora
	    System.out.println("Exercício Calculadora");
	    Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obtemMensagem(9);
        Mensagem.obtemMensagem(14);
        Mensagem.obtemMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.DuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.TresParcelas());
        Emprestimo.calcular(1000, 5);
	    	
	    
   }
	
}
