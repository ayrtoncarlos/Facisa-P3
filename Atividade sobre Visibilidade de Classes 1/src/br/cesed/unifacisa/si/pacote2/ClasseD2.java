package br.cesed.unifacisa.si.pacote2;

import br.cesed.unifacisa.si.pacote1.ClasseP1;

class ClasseD2 {

	/*
	 * OBSERVA��ES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada s� pela pr�pria classe;
	 * Default/Package --> Pode ser acessada s� pelas classes do pr�prio pacote;
	 * Protected --> Pode ser acessada s� pelas classes herdadas.
	 * 
	 */
	
	public ClasseD2() {
		
		ClasseP1 cp1 = new ClasseP1();
//		ClasseD1 cd1 = new ClasseD1(); A classe Default do pacote 1 s� pode ser estanciada no mesmo pacote.
		ClasseP2 cp2 = new ClasseP2();
	}

}
