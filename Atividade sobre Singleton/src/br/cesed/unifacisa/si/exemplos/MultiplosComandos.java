package br.cesed.unifacisa.si.exemplos;

public class MultiplosComandos {

	/*
	 * Cuidado com inicializações em múltiplos comandos:
	 * 
	 * Um cuidado muito importante é não atribuir o objeto à variável estática
	 * antes dele estar completamente inicializado. Observe o código abaixo:
	 * 
	 */
	private volatile static MultiplosComandos instancia;

	public static MultiplosComandos getInstancia() {
		
		if (instancia == null) {
			synchronized (MultiplosComandos.class) {
				if (instancia == null) {
					instancia = new MultiplosComandos();
					//instancia.setAlgumaDependencia(new Dependencia()); <-- Problema
				}
			}
		}
		return instancia;
	}
	/*
	 * O código acima atribui uma nova instância de 'PEHandlerService' à 'instancia'
	 * e depois passa algum objeto para ela. O problema é que como 'instancia != null',
	 * outra thread pode chamar o método 'getInstancia' e recuperar o objeto antes dele
	 * receber a 'dependência'. Neste caso você poderia ter um 'NullPointerException'.
	 * 
	 * Para você evitar esses erros, verifique um exemplo na classe "SingletonPreCarregadoSemSincronizacao".
	 * 
	 */
}
