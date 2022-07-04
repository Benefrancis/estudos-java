package br.com.benefrancis.estudos.distancia3d;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();

		String[] as = a.split("\\s+");
		String[] bs = b.split("\\s+");

		Integer soma = 0;
		DecimalFormat df = new DecimalFormat("0");
		df.setRoundingMode(RoundingMode.HALF_UP);

		for (int i = 0; i < as.length; i++) {
			Integer p = Integer.parseInt(as[i]);
			Integer p2 = Integer.parseInt(bs[i]);
			soma += Math.abs(p - p2) * Math.abs(p - p2);
		}

		Double resultado = (double) Math.sqrt(soma);
		System.out.println(df.format(resultado));
		in.close();
	}
}
/**
 * Input 50 60 10 30 20 8 Output 45
 */