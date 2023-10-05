package it.test.primo;

public class ClasseConcreta extends ClasseAstratta {
/* 
 * Errori: #, ##
 */

	private String primaVariabileClasseAstratta = "prova";//Avviso: The value of the field ClasseConcreta.primaVariabileClasseAstratta is not used

	//##	Implicit super constructor ClasseAstratta() is undefined for default constructor. Must define an explicit constructor
	public ClasseConcreta(String primaVariabileClasseAstratta) {
		super(primaVariabileClasseAstratta);
		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;
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
		System.out.println(primaVariabileClasseAstratta + " metodoAstrattoClasseAstratta(): Ok !");
	}

//		public abstract void metodoAstrattoClasseConcreta();//Errore: The abstract method metodoAstrattoClasseConcreta in type ClasseConcreta can only be defined by an abstract class

}
