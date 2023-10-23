package it.test.terzo;

public final class ClasseConcretaFinal extends ClasseConcreta {

	public ClasseConcretaFinal(String primaVariabileClasseAstratta) {
		super(primaVariabileClasseAstratta);
	}

	///*
	@Override
	public void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta) {
		System.out.println(primaVariabileClasseAstratta + "\nLe classi che \"derivano\" da una classe astratta"
				+ " possono \"sovrascrivere\" i metodi astratti delle classi astratte.\n"
				+ " Altrimenti, se non specificato (cioé se \"non fanno override\" del metodo),"
				+ " possono richiamare il metodo della classe che estendono.");
	}
	//*/

	//Nested class nella classe concreta finale
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
