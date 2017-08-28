package br.cesed.unifacisa.si.exemplos;

public class SingletonConcorrenteComSincronizacaoMinima {

	/*
	 * Para melhorar um pouco a vers�o da classe "SingletonConcorrente",
	 * alguns autores prop�em a constru��o exemplificada abaixo:
	 */
	private volatile static SingletonConcorrenteComSincronizacaoMinima instancia;

	public static SingletonConcorrenteComSincronizacaoMinima getInstancia() {
		
		if (instancia == null) {
			synchronized (SingletonConcorrenteComSincronizacaoMinima.class) {
				if (instancia == null)
					instancia = new SingletonConcorrenteComSincronizacaoMinima();
			}
		}
		return instancia;
	}
	/*
	 * Isso faz com que a sincroniza��o ocorra somente na inicializa��o
	 * e n�o nas demais chamadas.
	 * 
	 * Por�m, note o modificador 'volatile' no atributo da classe.
	 * Ele � necess�rio mesmo com a sincroniza��o, pois devido ao modelo
	 * de mem�ria do Java, principalmente antes do Java 5, ainda poderiam ocorrer erros
	 * causados por um tipo de cache onde outras thread poderia ainda ver o valor null
	 * na vari�vel, mesmo ap�s a atribui��o por outra thread de modo at�mico.
	 * 
	 * Agora voc� deve ter alguns cuidados com algumas implementa��es,
	 * verifique a classe "MultiplosComandos", e fique mais por dentro do assunto.
	 */
}
