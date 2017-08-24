package br.cesed.unifacisa.si.pacote2;

import br.cesed.unifacisa.si.pacote1.ClasseP1;

public class ClasseP2 {

	/*
	 * OBSERVAÇÕES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada só pela própria classe;
	 * Default/Package --> Pode ser acessada só pelas classes do próprio pacote;
	 * Protected --> Pode ser acessada só pelas classes herdadas.
	 * 
	 */
	
//	ClasseD1 cd1; Visibilidade
	ClasseD2 cd2;
	ClasseP1 cp1;
	ClasseP2 cp2;
	
	public ClasseP2() {
			
		cp1.metodo1P1();
//		cp1.metodo2P1();--\
//		cp1.metodo3P1();---> Visibilidade
//		cp1.metodo4P1();--/
		
		cp2.metodo1P2();
		cp2.metodo2P2();
		cp2.metodo3P2();
		cp2.metodo4P2();
		
		cd2.metodo1D2();
//		cd2.metodo2D2(); Visibilidade
		cd2.metodo3D2();
		cd2.metodo4D2();
	}
	
	public void metodo1P2(){}
	private void metodo2P2(){}
	protected void metodo3P2(){}
	void metodo4P2(){}

}
