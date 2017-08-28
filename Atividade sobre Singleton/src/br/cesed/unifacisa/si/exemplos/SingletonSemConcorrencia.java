package br.cesed.unifacisa.si.exemplos;

public class SingletonSemConcorrencia {
	
	// A implementa��o do singleton pattern mais simples � desta forma:
	private static SingletonSemConcorrencia instancia;

	public static SingletonSemConcorrencia getInstancia() {
		
		if (instancia == null)
			instancia = new SingletonSemConcorrencia();
		return instancia;
	}
	/*
	 * esta vers�o poderia gerar duas inst�ncias num cen�rio um tanto incomum,
	 * isto �, se duas threads executassem o getInstance ao mesmo tempo
	 * na primeira chamada ao m�todo.
	 * 
	 * Para ver uma solu��o deste caso, verifique � classe "SingletonConcorrente".
	 * 
	 */
}
