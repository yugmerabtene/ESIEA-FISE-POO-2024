package interfaceAnimal;

public class Oiseau extends Animal implements Nageable, Volatile {
	@Override
	public void voler() {
		System.out.println(getNom() + "Vole dans le ciel bleu");
	}
	
	@Override 
	public void nager() {
		System.out.println(getNom() + "nage sur l'eau");
	}

}
