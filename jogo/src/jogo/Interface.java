package jogo;
import java.util.Scanner;
public class Interface {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        Certos  ObjetoCertos = new Certos();
        Errados ObjetoErrados = new Errados();
        Aleatoria ObjetoAleatoria = new Aleatoria();
        Lertentativa ObjetoLertentativa = new Lertentativa();
        
              int maxNumero = 6;         
              int minNumero = 1;	        
              int tamanhoSen = 4;
              int numerosCorretos;
              int numerosDeslocados;
               
              int[] senha = ObjetoAleatoria.SenhaAleatoria(tamanhoSen, minNumero, maxNumero);
              int[] tentativa = new int[tamanhoSen];
              
        boolean acertou = false;
              int tentativas = 0;

            System.out.println("BEM-VINDO AO JOGO DA SENHA!");
            System.out.println("FIQUE ATENTO");
            System.out.println("*A senha contem numeros entre 1 a 6*");
            System.out.println("*Tente adivinhar a senha de 4 digitos*");

        while (!acertou) {
            System.out.println("\nTentativa #" + (tentativas + 1));
            Lertentativa.lerTentativa(tentativa, tamanhoSen, minNumero, maxNumero);
            tentativas++;

             numerosCorretos = ObjetoCertos.NumeroslgCorretos (senha, tentativa, tamanhoSen);
             numerosDeslocados = ObjetoErrados.NumerosLugarErrado (senha,tamanhoSen ,tentativa );

            System.out.println("Numeros corretos: " + numerosCorretos);
            System.out.println("Numeros Deslocado: " + numerosDeslocados);

            acertou = numerosCorretos == tamanhoSen;

       if (acertou) {
            System.out.println("\nParabens! Voce acertou a senha em " + tentativas + " tentativas!");
     } else {
           
    }
        }
    }


	}


