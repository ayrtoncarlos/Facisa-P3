package br.cesed.unifacisa.si.pacote1;

import br.cesed.unifacisa.si.pacote2.ClasseP2;

class ClasseD1 {

	/*
	 * OBSERVA��ES:
	 * 
	 * Public --> Pode ser acessada por qualquer classe;
	 * Private --> Pode ser acessada s� pela pr�pria classe;
	 * Default/Package --> Pode ser acessada s� pelas classes do pr�prio pacote;
	 * Protected --> Pode ser acessada s� pelas classes herdadas.
	 * 
	 */
	
	ClasseD1 cd1;
//	ClasseD2 cd2; Visibilidade
	ClasseP1 cp1;
	ClasseP2 cp2;
	
	public ClasseD1() {
	
		cd1.metodo1D1();
		cd1.metodo2D1();
		cd1.metodo3D1();
		cd1.metodo4D1();
		
		cp1.metodo1P1();
//		cp1.metodo2P1(); Visibilidade
		cp1.metodo3P1();
		cp1.metodo4P1();
		
		cp2.metodo1P2();
//		cp2.metodo2P2();--\
//		cp2.metodo3P2();---> Visibilidade
//		cp2.metodo4P2();--/
		
	}
	
	public void metodo1D1(){}
	private void metodo2D1(){}
	protected void metodo3D1(){}
	void metodo4D1(){}

}
