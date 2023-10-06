package it.test.primo;

public class Main {

	public static void main(String[] args) {

//		ClasseAstratta ca = new ClasseAstratta();//Errore: Cannot instantiate the type ClasseAstratta
		ClasseConcreta cc = new ClasseConcreta("variabile1");
		ClasseConcretaFinal ccf = new ClasseConcretaFinal("variabile2");
		String className;

		className = cc.getClass().getSimpleName();
		Class<?> superClassName = cc.getClass().getSuperclass();

		System.out.println("--------------------------------------------------------------"
				+ "\nistanza: \"" + className + "\" che estende la \"" + superClassName.getSimpleName() + "\".");
		cc.metodoClasseAstratta();
		System.out.println(cc.secondaVariabilePublicClasseAstratta);
		cc.metodoAstrattoClasseAstratta("test metodoAstrattoClasseAstratta(): Ok !");

		className = ccf.getClass().getSimpleName();
		superClassName = ccf.getClass().getSuperclass();
		
		System.out.println("--------------------------------------------------------------"
				+ "\nistanza: \"" + className + "\" che estende la \"" + superClassName.getSimpleName() + "\", "
				+ "la quale estende a sua volta la \"" + superClassName.getSuperclass().getSimpleName() + "\".");
		ccf.metodoClasseAstratta();
		ccf.metodoAstrattoClasseAstratta("test metodoAstrattoClasseAstratta(): Ok !");

	}

}
