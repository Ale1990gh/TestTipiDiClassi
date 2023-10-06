package it.test.primo;

public abstract class ClasseAstratta {//Errore: The class ClasseAstratta can be either abstract or final, not both

	private String primaVariabileClasseAstratta;
	public String secondaVariabilePublicClasseAstratta = ""
			+ "Non possono essere istanziate (Errore: Cannot instantiate the type ClasseAstratta),\"\r\n"
			+ "non possono essere \"final\" (Errore: The class ClasseAstratta can be either abstract or final, not both).\n";

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
		System.out.println("test metodoClasseAstratta(): Ok !" + "\nLe classi astratte sono utilizzate per poter dichiarare caratteristiche comuni fra classi.");
	}
	
	public abstract void metodoAstrattoClasseAstratta(String primaVariabileClasseAstratta)/*{...}*/;

}
