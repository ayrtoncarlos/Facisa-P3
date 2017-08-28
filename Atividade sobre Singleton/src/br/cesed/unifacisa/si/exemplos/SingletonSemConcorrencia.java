package br.cesed.unifacisa.si.exemplos;

public class SingletonSemConcorrencia {
	
	// A implementação do singleton pattern mais simples é desta forma:
	private static SingletonSemConcorrencia instancia;

	public static SingletonSemConcorrencia getInstancia() {
		
		if (instancia == null)
			instancia = new SingletonSemConcorrencia();
		return instancia;
	}
	/*
	 * esta versão poderia gerar duas instâncias num cenário um tanto incomum,
	 * isto é, se duas threads executassem o getInstance ao mesmo tempo
	 * na primeira chamada ao método.
	 * 
	 * Para ver uma solução deste caso, verifique à classe "SingletonConcorrente".
	 * 
	 */
}
