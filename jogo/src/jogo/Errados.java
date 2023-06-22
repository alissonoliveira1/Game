package jogo;

import java.util.Arrays;

public class Errados {
	 public static int NumerosLugarErrado(int[] senha,int tamanho ,int[] tentativa ) {
	        int resto = 0;
	        int[] copia = Arrays.copyOf(senha, tamanho);
	        int[] copiatentativa = Arrays.copyOf(tentativa, tamanho);
	        int i;
	        for (i = 0; i < tamanho; i++) {
	            if (copia[i] == copiatentativa[i]) {
	                copia[i] = 0; 
	                copiatentativa[i] = 0; 
	            }
	        }
	       
	        for (i = 0; i < tamanho; i++) {
	            if (copiatentativa[i] != 0 && lacre(copia, copiatentativa[i])) {
	                resto++;
	                copia[Fechamento(copia, copiatentativa[i])] = 0;
	       }
	    }

	        return resto;
	      }

	    public static boolean lacre(int[] array, int value) {
	    	
	        for (int num : array) {
	            if (num == value) {
	                return true;
	      }
	   }
	        return false;
	      }

	    public static int Fechamento(int[] array, int value) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == value) {
	                return i;
	            }
	        }
	        return -1;
	 }
	}