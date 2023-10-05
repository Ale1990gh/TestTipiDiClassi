package it.test.secondo;

import it.test.secondo.ClasseConcreta;
import it.test.secondo.ClasseConcretaFinal;

public class Main {

	public static void main(String[] args) {

//		ClasseAstratta ca = new ClasseAstratta();//Errore: Cannot instantiate the type ClasseAstratta
		ClasseConcreta cc = new ClasseConcreta(null);
		@SuppressWarnings("unused")
		ClasseConcretaFinal ccf = new ClasseConcretaFinal();

		cc.metodoClasseConcreta("Ok !");
		
	}

}
