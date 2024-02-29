package view;

import controller.SomaFatRecController;

public class Principal {

	public static void main(String[] args) {
		
		SomaFatRecController sf = new SomaFatRecController ();
		
		System.out.println("Soma Fatorial: " + sf.somaFatorial(5));
		
	}

}
