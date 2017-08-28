package br.cesed.unifacisa.si.exemplos;

public class SingletonConcorrenteSemSincronizacao {

	// Exemplo de uma classe com "Singleton concorrente sem sincroniza��o":
	private static class SingletonLoader {
		
		private static SingletonConcorrenteSemSincronizacao instancia = new SingletonConcorrenteSemSincronizacao();
	}

	public static SingletonConcorrenteSemSincronizacao getInstancia() {
		
		return SingletonLoader.instancia;
	}
	/*
	 * Outra alternativa � declarar a classe do tipo "Enum"
	 * 
	 * Verifique agora um exemplo na classe "EnumSingleClass".
	 * 
	 */
}
