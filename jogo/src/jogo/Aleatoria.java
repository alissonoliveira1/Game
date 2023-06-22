package jogo;

import java.util.Random;

public class Aleatoria {
	 public static int[] SenhaAleatoria(int tamanhoSenha, int minNumero, int maxNumero) {
	        int[] senha = new int[tamanhoSenha];
	        Random ale = new Random();
	        int i;
	        for (i = 0; i < tamanhoSenha; i++) {
	            senha[i] = ale.nextInt(maxNumero - minNumero + 1) + minNumero;
	        }

	        return senha;
	    }
	      
	
}
