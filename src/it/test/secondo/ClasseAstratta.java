package it.test.secondo;

public /*final*/ abstract /*final*/ class ClasseAstratta extends ClasseConcreta {//Errore: The class ClasseAstratta can be either abstract or final, not both

	private String variabileClasseAstratta;	

	public ClasseAstratta(String variabileClasseConcreta, String variabileClasseAstratta) {
		super(variabileClasseConcreta);
		this.variabileClasseAstratta = variabileClasseAstratta;
	}

//	public String getVariabileClasseAstratta() {
//		return variabileClasseAstratta;
//	}
//
//	public void setVariabileClasseAstratta(String variabileClasseAstratta) {
//		this.variabileClasseAstratta = variabileClasseAstratta;
//	}

}
