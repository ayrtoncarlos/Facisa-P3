package br.cesed.unifacisa.si.exemplos;

public class SingletonPreCarregadoSemSincronizacao {

	/*
	 * Para evitar aquele problema visto na classe "MultiplosComandos" e outros problemas
	 * relacionados, a solu��o mais simples apontada � simplesmente inicializar o
	 * seu objeto singleton fora do m�todo getInstancia, exatamente como no
	 * nosso primeiro exemplo:
	 */
	private static SingletonPreCarregadoSemSincronizacao instancia = new SingletonPreCarregadoSemSincronizacao();

	public static SingletonPreCarregadoSemSincronizacao getInstancia() {
		
		return instancia;
	}
	/*
	 * Se for necess�rio algum tipo de inicializa��o, � poss�vel usar um bloco
	 * de inicializa��o est�tico, veja o exemplo abaixo:
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
	 * A maior diferen�a desta abordagem � que o objeto n�o ser� mais inicializado
	 * por demanda (lazy initialization), mas logo que a classe for usada pela primeira
	 * vez (eager initialization). Isso pode ser bom ou ruim, dependendo do caso.
	 * 
	 * Para tentar juntar tudo, isto �, evitar sincroniza��o e carregar o singleton
	 * em modo lazy, existem algumas alternativas, uma delas consiste em usar uma
	 * terceira classe para carregar a vari�vel est�tica somente quando a mesma for
	 * acessada. Verifique um exemplo na classe "SingletonConcorrenteSemSincronizacao".
	 * 
	 */
}
