/*
 * 6. 
 * Criar uma aplicação em Java que tenha uma função recursiva que, 
 * recebendo um número inteiro (N), apresente a saída da somatória:
 * 
 * S = 1 + 1/2! + 1/3! + 1/4! + ... + 1/N!
 * 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a condição de parada;
 * 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a relação de chamada dos passos.
 * 
 */

package controller;

	public class SomaFatRecController {

	public SomaFatRecController() {
		
		super();
		
	}
	
	public static double somaFatorial(int n){
	    
		// Condição de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    
	    // Chama a função somaFatorial passando n-1
	    // e soma ao resultado 1/n!
	    return somaFatorial(n-1) + (1.0/fatorial(n));
	}

	// Função auxiliar para calcular o fatorial
	public static double fatorial(int n){
	    // Condição de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    
	    // Chama a função fatorial passando n-1
	    // e multiplica numero por n
	    return fatorial(n-1) * n;
	}

}
