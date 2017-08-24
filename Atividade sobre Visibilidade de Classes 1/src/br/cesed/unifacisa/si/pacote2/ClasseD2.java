package br.cesed.unifacisa.si.pacote2;

import br.cesed.unifacisa.si.pacote1.ClasseP1;

class ClasseD2 {

	/*
	 * OBSERVAÇÕES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada só pela própria classe;
	 * Default/Package --> Pode ser acessada só pelas classes do próprio pacote;
	 * Protected --> Pode ser acessada só pelas classes herdadas.
	 * 
	 */
	
	public ClasseD2() {
		
		ClasseP1 cp1 = new ClasseP1();
//		ClasseD1 cd1 = new ClasseD1(); A classe Default do pacote 1 só pode ser estanciada no mesmo pacote.
		ClasseP2 cp2 = new ClasseP2();
	}

}
