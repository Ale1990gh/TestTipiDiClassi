package it.test.primo;

public class Main {

	public static void main(String[] args) {

//		ClasseAstratta ca = new ClasseAstratta();//Errore: Cannot instantiate the type ClasseAstratta
		ClasseConcreta cc = new ClasseConcreta("variabile1");
		@SuppressWarnings("unused")
		ClasseConcretaFinal ccf = new ClasseConcretaFinal("variabile2");

		cc.metodoClasseAstratta();
		cc.metodoAstrattoClasseAstratta("test");
	}

}
