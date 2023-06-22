package jogo;

public class Certos {
	 public static int NumeroslgCorretos(int[] senha, int[] tentativa, int tamanhoSenha) {
	        int rept = 0;
	        int i;
	        for (i = 0; i < tamanhoSenha; i++) {
	            if (senha[i] == tentativa[i]) {
	                rept++;
	     }
	       }

	        return rept;
	    }
}
