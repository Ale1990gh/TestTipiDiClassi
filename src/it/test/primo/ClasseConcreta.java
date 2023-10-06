package it.test.primo;

public class ClasseConcreta extends ClasseAstratta {
/* 
 * Errori: #, ##
 */

	private String primaVariabileClasseAstratta = "prova";//Avviso: The value of the field ClasseConcreta.primaVariabileClasseAstratta is not used

	//##	Implicit super constructor ClasseAstratta() is undefined for default constructor. Must define an explicit constructor
	public ClasseConcreta(String primaVariabileClasseAstratta) {
		super(primaVariabileClasseAstratta);//prova ClasseConcreta: private String primaVariabileClasseAstratta
		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;//variabile1 da "ClasseConcreta cc = new ClasseConcreta("variabile1");"
//		this.setPrimaVariabileClasseAstratta(primaVariabileClasseAstratta);
	}

//	public String getPrimaVariabileClasseAstratta() {
//		return primaVariabileClasseAstratta;
//	}
//
//	public void setPrimaVariabileClasseAstratta(String primaVariabileClasseAstratta) {
//		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;
//	}

	//#	The type ClasseConcreta must implement the inherited abstract method ClasseAstratta.metodoAstrattoClasseAstratta()
	@Override
	public void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta) {
		System.out.println(primaVariabileClasseAstratta + "\nLe classi concrete possono estendere le classi astratte."
				+ "\nSe la classe contiene un metodo astratto, anche la classe deve essere astratta."
				+ "\n Il metodo astratto di una classe astratta, non contiene il \"corpo\" del metodo, ma solo la dichiarazione."
				+ "\n  Se la classe concreta estende una classe astratta, i metodi astratti devono essere implementati nella classe concreta.\n");
	}

//		public abstract void metodoAstrattoClasseConcreta();//Errore: The abstract method metodoAstrattoClasseConcreta in type ClasseConcreta can only be defined by an abstract class

}
