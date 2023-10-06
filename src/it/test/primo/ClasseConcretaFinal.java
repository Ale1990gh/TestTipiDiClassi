package it.test.primo;

public final class ClasseConcretaFinal extends ClasseConcreta {
//	Implicit super constructor ClasseConcreta() is undefined for default constructor. Must define an explicit constructor

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

}
