package CodGirls;

public class Emprestimo {

	public static int DuasParcelas() {
		return 2;
	}
	
	public static int TresParcelas() {
		return 3;
	}
	
	public static double TaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double TaxaTresParcelas() {
		return 0.45;
	}
	
  public static void calcular(double valor, int parcelas) {
	  
	  if(parcelas == 2) {
		  
		  double ValorFinal = valor + (valor * TaxaDuasParcelas());
		  System.out.println("Valor final do empréstimo para 2 parcelas: R$"+ ValorFinal);
	  }
	  else if(parcelas == 3) {
		 
		  double ValorFinal = valor + (valor * TaxaTresParcelas());
		  System.out.println("Valor final do empréstimo para 3 parcelas: R$"+ ValorFinal);  
	  }
	  else {
		  System.out.println("Quantidade d eparcelas não aceita!");
	  }
  }
}
