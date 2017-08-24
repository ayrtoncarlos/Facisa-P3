package br.cesed.unifacisa.si.pacote1;

import br.cesed.unifacisa.si.pacote2.ClasseP2;

class ClasseD1 {

	/*
	 * OBSERVAÇÕES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada só pela própria classe;
	 * Default/Package --> Pode ser acessada só pelas classes do próprio pacote;
	 * Protected --> Pode ser acessada só pelas classes herdadas.
	 * 
	 */
	
	public ClasseD1() {

		ClasseP1 cp1 = new ClasseP1();
//		ClasseD2 cd2 = new ClasseD2(); A classe Default do pacote 2 só pode ser estanciada no mesmo pacote.
		ClasseP2 cp2 = new ClasseP2();
	}

}
