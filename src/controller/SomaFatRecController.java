/*
 * 6. 
 * Criar uma aplica��o em Java que tenha uma fun��o recursiva que, 
 * recebendo um n�mero inteiro (N), apresente a sa�da da somat�ria:
 * 
 * S = 1 + 1/2! + 1/3! + 1/4! + ... + 1/N!
 * 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a condi��o de parada;
 * 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a rela��o de chamada dos passos.
 * 
 */

package controller;

	public class SomaFatRecController {

	public SomaFatRecController() {
		
		super();
		
	}
	
	public static double somaFatorial(int n){
	    
		// Condi��o de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    
	    // Chama a fun��o somaFatorial passando n-1
	    // e soma ao resultado 1/n!
	    return somaFatorial(n-1) + (1.0/fatorial(n));
	}

	// Fun��o auxiliar para calcular o fatorial
	public static double fatorial(int n){
	    // Condi��o de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    
	    // Chama a fun��o fatorial passando n-1
	    // e multiplica numero por n
	    return fatorial(n-1) * n;
	}

}
