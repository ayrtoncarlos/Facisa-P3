package br.cesed.unifacisa.si.exemplos;

public class SingletonConcorrenteComSincronizacaoMinima {

	/*
	 * Para melhorar um pouco a versão da classe "SingletonConcorrente",
	 * alguns autores propõem a construção exemplificada abaixo:
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
	 * Isso faz com que a sincronização ocorra somente na inicialização
	 * e não nas demais chamadas.
	 * 
	 * Porém, note o modificador 'volatile' no atributo da classe.
	 * Ele é necessário mesmo com a sincronização, pois devido ao modelo
	 * de memória do Java, principalmente antes do Java 5, ainda poderiam ocorrer erros
	 * causados por um tipo de cache onde outras thread poderia ainda ver o valor null
	 * na variável, mesmo após a atribuição por outra thread de modo atômico.
	 * 
	 * Agora você deve ter alguns cuidados com algumas implementações,
	 * verifique a classe "MultiplosComandos", e fique mais por dentro do assunto.
	 */
}
