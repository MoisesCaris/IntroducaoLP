package lista2;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float A, B, C;
		System.out.println("Informe o valor A");
		A = ler.nextFloat();
		System.out.println("Informe o valor B");
		B = ler.nextFloat();
		System.out.println("Informe o valor C");
		C = ler.nextFloat();
		String fab = String.format("%.2f", A + B);
		if (A + B < C) {
			System.out.println(
					"A + B < C pois " + "\n" + "A + B = " + fab + " e C = " + C + "\n" + A + " + " + B + " < " + C);

		} else {
			System.out.println("O valor não gerou a condição esperada.");
		}
	}
}