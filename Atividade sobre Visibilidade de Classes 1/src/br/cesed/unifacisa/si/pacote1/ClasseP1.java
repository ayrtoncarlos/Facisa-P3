package br.cesed.unifacisa.si.pacote1;

import br.cesed.unifacisa.si.pacote2.ClasseP2;

public class ClasseP1 {

	/*
	 * OBSERVAÇÕES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada só pela própria classe;
	 * Default/Package --> Pode ser acessada só pelas classes do próprio pacote;
	 * Protected --> Pode ser acessada só pelas classes herdadas.
	 * 
	 */
	
	public ClasseP1() {
		
		ClasseP2 cp2 = new ClasseP2();
//		ClasseD2 cd2 = new ClasseD2(); A classe Default do pacote 2 só pode ser estanciada no mesmo pacote.
		ClasseD1 cd1 = new ClasseD1();
	}

}
