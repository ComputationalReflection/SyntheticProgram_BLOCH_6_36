package es.uniovi.reflection.bloch_6_36.noncompliant;

public class B1 {
	int d;

	public B1() {
		d = 5;
	}

	public void a() {
		d = 7;
	}

	public void b() {
		d = 3;
	}

	@Deprecated
	public String toString(){
		return "Deprecated";
	}
}
