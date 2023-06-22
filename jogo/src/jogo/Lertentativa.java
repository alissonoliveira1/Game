package jogo;

import java.util.Scanner;

public class Lertentativa {
	public static void lerTentativa(int[] tentativa, int tamanhoSenha, int NumeroPeq, int GGNumero) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int i;
        for (i = 0; i < tamanhoSenha; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Digite o numero da posicao #" + (i + 1) + ": ");
                numero = sc.nextInt();
                if (numero >= NumeroPeq && numero <= GGNumero) {
                    tentativa[i] = numero;
                    valido = true;
                } else {
                    System.out.println("Digite um numero valido de 1 ate 6");
       }
          }
              }
    }

}
