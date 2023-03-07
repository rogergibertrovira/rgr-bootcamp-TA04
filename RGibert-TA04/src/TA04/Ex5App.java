package TA04;

public class Ex5App {

	public static void main(String[] args) {
		int A = 2;
		int B = 5;
		int C = 8;
		int D = 1;
		
		System.out.println("Valor de A = "+A);
		System.out.println("Valor de B = "+B);
		System.out.println("Valor de C = "+C);
		System.out.println("Valor de D = "+D);
		
		int b = B; //Variable extra per guardar valor de B
		B = C;
		C = A;
		A = D;
		D = b;
		
		System.out.println("Valor de A = "+A);
		System.out.println("Valor de B = "+B);
		System.out.println("Valor de C = "+C);
		System.out.println("Valor de D = "+D);

	}

}
