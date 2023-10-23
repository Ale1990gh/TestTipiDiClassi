package it.test.terzo;

public abstract class ClasseAstratta {

	private String primaVariabileClasseAstratta;
	public String secondaVariabilePublicClasseAstratta = ""
			+ "Non possono essere istanziate (Errore: Cannot instantiate the type ClasseAstratta),\"\r\n"
			+ "non possono essere \"final\" (Errore: The class ClasseAstratta can be either abstract or final, not both).\n";

	public ClasseAstratta(String primaVariabileClasseAstratta) {
		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;
	}

	public void metodoClasseAstratta() {
		System.out.println("test metodoClasseAstratta(): Ok !" + "\nLe classi astratte sono utilizzate per poter dichiarare caratteristiche comuni fra classi.");
	}
	
	public abstract void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta)/*{...}*/;

	//Nested class nella classe astratta:
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

//	static final abstract class NestedClassAstrattaFinale {
//		
//	}
	
}
