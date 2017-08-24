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
	
//	ClasseD1 cd1; Visibilidade
	ClasseD2 cd2;
	ClasseP1 cp1;
	ClasseP2 cp2;

	public ClasseD2() {
		
		cp1.metodo1P1();
//		cp1.metodo2P1();--\
//		cp1.metodo3P1();---> Visibilidade
//		cp1.metodo4P1();--/
		
		cp2.metodo1P2();
//		cp2.metodo2P2(); Visibilidade
		cp2.metodo3P2();
		cp2.metodo4P2();
		
		cd2.metodo1D2();
		cd2.metodo2D2();
		cd2.metodo3D2();
		cd2.metodo4D2();
	}
	
	public void metodo1D2(){}
	private void metodo2D2(){}
	protected void metodo3D2(){}
	void metodo4D2(){}

}
