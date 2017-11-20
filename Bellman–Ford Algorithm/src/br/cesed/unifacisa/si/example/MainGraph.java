package br.cesed.unifacisa.si.example;

/**
 * Represents the Main Class of Bellman–Ford Algorithm.
 * 
 * @author Ayrton Carlos
 *
 */
public class MainGraph {

	public static void main(String[] args) {

		int V = 5;
		int E = 8;

		Graph graph = new Graph(V, E);

		graph.getEdge()[0].setSource(0);
		graph.getEdge()[0].setDestiny(1);
		graph.getEdge()[0].setWeight(-1);

		graph.getEdge()[1].setSource(0);
		graph.getEdge()[1].setDestiny(2);
		graph.getEdge()[1].setWeight(4);

		graph.getEdge()[2].setSource(1);
		graph.getEdge()[2].setDestiny(2);
		graph.getEdge()[2].setWeight(3);

		graph.getEdge()[3].setSource(1);
		graph.getEdge()[3].setDestiny(3);
		graph.getEdge()[3].setWeight(2);

		graph.getEdge()[4].setSource(1);
		graph.getEdge()[4].setDestiny(4);
		graph.getEdge()[4].setWeight(2);

		graph.getEdge()[5].setSource(3);
		graph.getEdge()[5].setDestiny(2);
		graph.getEdge()[5].setWeight(5);

		graph.getEdge()[6].setSource(3);
		graph.getEdge()[6].setDestiny(1);
		graph.getEdge()[6].setWeight(1);

		graph.getEdge()[7].setSource(4);
		graph.getEdge()[7].setDestiny(3);
		graph.getEdge()[7].setWeight(-3);

		graph.bellmanFord(0);
	}
}
