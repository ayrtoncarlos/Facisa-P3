package br.cesed.unifacisa.si.exemplos;

public class SingletonConcorrente {

	/*
	 * Para resolver o problema da classe "SingletonSemConcorrencia",
	 * a solu��o mais f�cil � sincronizar o m�todo, veja o exemplo abaixo:
	 * 
	 */
	private static SingletonConcorrente instancia;

	synchronized public static SingletonConcorrente getInstancia() {
		
		if (instancia == null)
			instancia = new SingletonConcorrente();
		return instancia;
	}
	/*
	 * Isso evita problemas de concorr�ncias, mas gera um pequeno atraso em cada
	 * chamada ao m�todo para gerenciar a concorr�ncia, al�m do que se houverem 
	 * m�ltiplas threads somente uma poder� chamar o m�todo por vez, possivelmente
	 * gerando gargalos num sistema altamente concorrente.
	 * 
	 * Para melhorar um pouco a vers�o acima, verifique � classe
	 * "SingletonConcorrenteComSincroniza��oMinima".
	 * 
	 */
}
