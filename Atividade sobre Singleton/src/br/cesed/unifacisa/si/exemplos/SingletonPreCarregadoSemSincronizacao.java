package br.cesed.unifacisa.si.exemplos;

public class SingletonPreCarregadoSemSincronizacao {

	/*
	 * Para evitar aquele problema visto na classe "MultiplosComandos" e outros problemas
	 * relacionados, a solução mais simples apontada é simplesmente inicializar o
	 * seu objeto singleton fora do método getInstancia, exatamente como no
	 * nosso primeiro exemplo:
	 */
	private static SingletonPreCarregadoSemSincronizacao instancia = new SingletonPreCarregadoSemSincronizacao();

	public static SingletonPreCarregadoSemSincronizacao getInstancia() {
		
		return instancia;
	}
	/*
	 * Se for necessário algum tipo de inicialização, é possível usar um bloco
	 * de inicialização estático, veja o exemplo abaixo:
	 * 
	 * private static SingletonPreCarregadoSemSincronizacao instancia;
	 * 
	 * static {
	 * 			instancia = new SingletonPreCarregadoSemSincronizacao();
	 * 			instancia.setDependencia(new Dependencia());
	 * }
	 * 
	 * public static SingletonPreCarregadoSemSincronizacao getInstancia() {
	 * 
	 * 		return instancia;
	 * }
	 * 
	 */
	
	/*
	 * A maior diferença desta abordagem é que o objeto não será mais inicializado
	 * por demanda (lazy initialization), mas logo que a classe for usada pela primeira
	 * vez (eager initialization). Isso pode ser bom ou ruim, dependendo do caso.
	 * 
	 * Para tentar juntar tudo, isto é, evitar sincronização e carregar o singleton
	 * em modo lazy, existem algumas alternativas, uma delas consiste em usar uma
	 * terceira classe para carregar a variável estática somente quando a mesma for
	 * acessada. Verifique um exemplo na classe "SingletonConcorrenteSemSincronizacao".
	 * 
	 */
}
