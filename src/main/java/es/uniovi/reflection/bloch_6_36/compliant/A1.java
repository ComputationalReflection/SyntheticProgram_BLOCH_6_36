package es.uniovi.reflection.bloch_6_36.compliant;

public class A1 {
	int d;

	public A1() {
		d = 5;
	}

	public void a() {
		d = 7;
	}

	public void b() {
		d = 3;
	}

	public static String toString(A1 a1){
		return "A1 " + a1 + " : " + a1.d;
	}
}
