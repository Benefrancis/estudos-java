package br.com.benefrancis.estudos.temperaturas;

import java.util.Scanner;

/**
 * Ben e Tom enviam mensagens a voc� descrevendo a temperatura em seus
 * respectivos pa�ses. Ben vive nos EUA Tom vive no Reino Unido Ben usa
 * Fahrenheit Tom usa Celsius
 * 
 * Ben e Tom lhe enviar�o suas entradas como um inteiro cada b e t, separados
 * por um espa�o. Haver� n essas linhas de entradas. Para cada linha, emitir a
 * string "Superior" se a temperatura de Ben for maior que a de Tom, e emitir a
 * string "Inferior" se a temperatura de Ben for menor que a de Tom. Se as
 * temperaturas forem as mesmas, a linha "Same".
 * 
 * A convers�o de C Celsius para F Fahrenheit segue a f�rmula C x 9 / 5 + 32 = F
 * 
 * @author Francis
 *
 */
public class Temperatura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = 0;
		int t = 0;
		double resF = 0;

		for (int i = 0; i < n; i++) {
			b = in.nextInt();
			t = in.nextInt();

			resF = t * 9 / 5 + 32;

			if (resF == 0) {
				System.out.println("Higher");
			} else {
				if (b > resF) {
					System.out.println("Higher");
				} else if (resF > b) {
					System.out.println("Lower");
				} else {
					System.out.println("Same");
				}
			}
		}
	}
}
