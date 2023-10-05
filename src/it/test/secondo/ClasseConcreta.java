package it.test.secondo;

public class ClasseConcreta /*extends ClasseConcretaFinal*/ {//Errore: The type ClasseConcreta cannot subclass the final class ClasseConcretaFinal

	private String variabileClasseConcreta;

	public ClasseConcreta(String variabileClasseConcreta) {
		this.variabileClasseConcreta = variabileClasseConcreta;
	}

//	public String getVariabileClasseConcreta() {
//		return variabileClasseConcreta;
//	}
//
//	public void setVariabileClasseConcreta(String variabileClasseConcreta) {
//		this.variabileClasseConcreta = variabileClasseConcreta;
//	}

	public void metodoClasseConcreta(String variabileClasseConcreta) {
		System.out.println("test: " + variabileClasseConcreta);
	}

}
