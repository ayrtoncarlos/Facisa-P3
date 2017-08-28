package br.cesed.unifacisa.si.exemplos;

public class SingletonConcorrente {

	/*
	 * Para resolver o problema da classe "SingletonSemConcorrencia",
	 * a solução mais fácil é sincronizar o método, veja o exemplo abaixo:
	 * 
	 */
	private static SingletonConcorrente instancia;

	synchronized public static SingletonConcorrente getInstancia() {
		
		if (instancia == null)
			instancia = new SingletonConcorrente();
		return instancia;
	}
	/*
	 * Isso evita problemas de concorrências, mas gera um pequeno atraso em cada
	 * chamada ao método para gerenciar a concorrência, além do que se houverem 
	 * múltiplas threads somente uma poderá chamar o método por vez, possivelmente
	 * gerando gargalos num sistema altamente concorrente.
	 * 
	 * Para melhorar um pouco a versão acima, verifique à classe
	 * "SingletonConcorrenteComSincronizaçãoMinima".
	 * 
	 */
}
