package cuadrado;

import java.util.Scanner;

public class CuadradoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();// Tamaño del cuadrado
		int[][] cuadrado = new int[n][n];
		llenarCeros(cuadrado);// lo rellenamos de ceros
		cuadrado(n, cuadrado);// lo rellenamos
		imprimir(cuadrado);
	}

	public static void cuadrado(int n, int[][] cuadrado) {

		int c = n / 2;
		int f = 0;
		int ci = 0;
		int fi = 0;

		cuadrado[f][c] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (f - 1 < 0) {
				f = n - 1;
			} else {
				f = f - 1;
			}
			if (c + 1 > n - 1) {
				c = 0;
			} else {
				c = c + 1;
			}
			if (cuadrado[f][c] == 0) {
				cuadrado[f][c] = i;
				fi = f;
				ci = c;// guardamos la ultima posicion rellenada
			} else {
				f = fi + 1;
				c = ci;// recuperamos la ultima posicion rellenada
				cuadrado[f][c] = i;
			}
		}

	}

	public static void llenarCeros(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = 0;
			}

		}
	}

	public static void imprimir(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();

		}
	}

}
