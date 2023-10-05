package it.test.primo;

public abstract class ClasseAstratta {//Errore: The class ClasseAstratta can be either abstract or final, not both

	private String primaVariabileClasseAstratta;
	private String secondaVariabileClasseAstratta;

	public ClasseAstratta(String primaVariabileClasseAstratta) {
		this.primaVariabileClasseAstratta = primaVariabileClasseAstratta;
	}

//	public String getPrimaVariabileClasseAstratta() {
//		return primaVariabileClasseAstratta;
//	}
//
//	public void setPrimaVariabileClasseAstratta(String variabileClasseAstratta) {
//		this.primaVariabileClasseAstratta = variabileClasseAstratta;
//	}
//	
//	public String getSecondaVariabileClasseAstratta() {
//		return secondaVariabileClasseAstratta;
//	}
//	
//	public void setSecondaVariabileClasseAstratta(String secondaVariabileClasseAstratta) {
//		this.secondaVariabileClasseAstratta = secondaVariabileClasseAstratta;
//	}

	public void metodoClasseAstratta() {
		System.out.println("test metodoClasseAstratta(): Ok !");
	}
	
	public abstract void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta)/*{...}*/;

}
