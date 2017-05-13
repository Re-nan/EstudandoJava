package estudando.polimorfismo1;

public class Cachorro extends Animal {

	@Override
	void falar() {
		System.out.println("AuAu");
	}

	void morder() {
		System.out.println("Cachorro Mordendooo");
	}

}
