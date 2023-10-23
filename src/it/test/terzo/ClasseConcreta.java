package it.test.terzo;

public class ClasseConcreta extends ClasseAstratta {

	private String primaVariabileClasseAstratta = "prova";

	public ClasseConcreta(String primaVariabileClasseAstratta) {
		super(primaVariabileClasseAstratta);
		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;
	}

	@Override
	public void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta) {
		System.out.println(primaVariabileClasseAstratta + "\nLe classi concrete possono estendere le classi astratte."
				+ "\nSe la classe contiene un metodo astratto, anche la classe deve essere astratta."
				+ "\n Il metodo astratto di una classe astratta, non contiene il \"corpo\" del metodo, ma solo la dichiarazione."
				+ "\n  Se la classe concreta estende una classe astratta, i metodi astratti devono essere implementati nella classe concreta.\n");
	}

	//Nested class nella classe concreta
	/*
 	static class NestedClassConcreta extends ClasseAstratta {

	public NestedClassConcreta(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}
	
	@Override
		public void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta) {}
	}
	 */
	/*
	static class NestedClassConcreta extends ClasseConcreta {

		public NestedClassConcreta(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}

	}
	 */
	/*
	static class NestedClassConcreta extends ClasseConcretaFinal {//Errore:The type NestedClassConcreta cannot subclass the final class ClasseConcretaFinal
	}
	 */
	/*
	static abstract class NestedClassAstratta extends ClasseAstratta {

		public NestedClassAstratta(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}

	}
	 */
	/*
	static abstract class NestedClassAstratta extends ClasseConcreta {

		public NestedClassAstratta(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}

	}
	 */
	/*
	static abstract class NestedClassAstratta extends ClasseConcretaFinal {//Errore: The type NestedClassAstratta cannot subclass the final class ClasseConcretaFinal	
	}
	 */
	/*
	static final class NestedClassConcretaFinale extends ClasseAstratta {

		public NestedClassConcretaFinale(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}

	@Override
	public void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta) {}

	}
	 */
	/*
	static final class NestedClassConcretaFinale extends ClasseConcreta {

		public NestedClassConcretaFinale(String primaVariabileClasseAstratta) {super(primaVariabileClasseAstratta);}

	}
	 */
	/*
	static final class NestedClassConcretaFinale extends ClasseConcretaFinal {//Errore: The type NestedClassConcretaFinale cannot subclass the final class ClasseConcretaFinal
	}
	 */

	//static final abstract class NestedClassAstrattaFinale {
	//
	//}

}
