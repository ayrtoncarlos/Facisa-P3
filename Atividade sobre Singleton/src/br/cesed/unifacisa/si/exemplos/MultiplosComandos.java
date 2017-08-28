package br.cesed.unifacisa.si.exemplos;

public class MultiplosComandos {

	/*
	 * Cuidado com inicializa��es em m�ltiplos comandos:
	 * 
	 * Um cuidado muito importante � n�o atribuir o objeto � vari�vel est�tica
	 * antes dele estar completamente inicializado. Observe o c�digo abaixo:
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
	 * O c�digo acima atribui uma nova inst�ncia de 'PEHandlerService' � 'instancia'
	 * e depois passa algum objeto para ela. O problema � que como 'instancia != null',
	 * outra thread pode chamar o m�todo 'getInstancia' e recuperar o objeto antes dele
	 * receber a 'depend�ncia'. Neste caso voc� poderia ter um 'NullPointerException'.
	 * 
	 * Para voc� evitar esses erros, verifique um exemplo na classe "SingletonPreCarregadoSemSincronizacao".
	 * 
	 */
}
