import java.util.Scanner;
import java.lang.Math;

public class EquationSolver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// GIAI PHUONG TRINH TUYEN TINH BAC NHAT
		System.out.println("===============================");
		System.out.println("Giai phuong trinh a * x + b = 0");

		// Nhap a, b tu ban phim
		System.out.print("Input a = ");
		Double a = sc.nextDouble();

		System.out.print("Input b = ");
		Double b = sc.nextDouble();

		if (a != 0.0) {
			Double result = -b / a;
			System.out.println("x = " + result);
		} else {
			if (b == 0.0) {
				System.out.println("Phuong trinh vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		}


		// GIAI HE PHUONG TRINH TUYEN TINH BAC NHAT 2 AN
		System.out.println("===============================");
		System.out.println("Giai he phuong trinh a11 * x1 + a12 * x2 = b1; a21 * x1 + a22 * x2 = b2");

		// Nhap a11, a12, b1, a21, a22, b2 tu ban phim
		System.out.print("Input a11 = ");
		Double a11 = sc.nextDouble();
		System.out.print("Input a12 = ");
		Double a12 = sc.nextDouble();
		System.out.print("Input b1 = ");
		Double b1 = sc.nextDouble();
		System.out.print("Input a21 = ");
		Double a21 = sc.nextDouble();
		System.out.print("Input a22 = ");
		Double a22 = sc.nextDouble();
		System.out.print("Input b2 = ");
		Double b2 = sc.nextDouble();

		// Tinh cac dinh thuc
		Double d = a11 * a22 - a12 * a21;
		Double d1 = b1 * a22 - b2 * a12;
		Double d2 = a11 * b2 - a21 * b1;

		// Giai he phuong trinh
		Double x1, x2;

		if (d != 0.0) {
			x1 = d1 / d;
			x2 = d2 / d;
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		} else {
			if (d1 == 0.0 && d2 == 0) {
				System.out.println("He co vo so nghiem.");
			} else {
				System.out.println("He vo nghiem.");
			}
		}

		// GIAI PHUONG TRINH DA THUC BAC 2
		System.out.println("===============================");
		System.out.println("Giai he phuong trinh a * x^2 + b * x + c = 0");

		// Nhap a, b, c tu ban phim
		System.out.print("Input a = ");
		Double A = sc.nextDouble();
		System.out.print("Input b = ");
		Double e = sc.nextDouble();
		System.out.print("Input c = ");
		Double f = sc.nextDouble();

		// Tinh delta
		Double delta = e * e - 4 * d * f;

		if (delta < 0) {

			System.out.println("Phuong trinh vo nghiem.");
		} else if (delta == 0.0) {
			Double result = - e / (2 * A);

			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + result);
		} else {
			Double qx1 = (- e - Math.sqrt(delta)) / (2 * A);
			Double qx2 = (- e + Math.sqrt(delta)) / (2 * A);

			System.out.println("Phuong trinh co 2 nghiem phan biet:");
			System.out.println("x1 = " + qx1);
			System.out.println("x2 = " + qx2);
		}

		sc.close();
	}
}
