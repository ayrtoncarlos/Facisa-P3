package br.cesed.unifacisa.si.example;

/**
 * A class to represent a weighted edge in graph.
 * 
 * @author Ayrton Carlos
 *
 */
public class Edge {

	private int source; // The source.
	private int destiny; // The destination source.
	private int weight; // The Edge Weight.

	/**
	 * Class Builder.
	 */
	public Edge() {

		this.source = this.destiny = this.weight = 0;
	}

	/**
	 * The function to return the value of the source.
	 * 
	 * @return int - The value of the source.
	 */
	public int getSource() {

		return source;
	}

	/**
	 * The function that receives and modifies the value of the source.
	 * 
	 * @param source
	 *            int - The value of the source.
	 */
	public void setSource(int source) {

		this.source = source;
	}

	/**
	 * The function to return the value of the destination source.
	 * 
	 * @return int - The value of the destination source.
	 */
	public int getDestiny() {

		return destiny;
	}

	/**
	 * The function that receives and modifies the destination value of the source.
	 * 
	 * @param destiny
	 *            int - The value of the destination source.
	 */
	public void setDestiny(int destiny) {

		this.destiny = destiny;
	}

	/**
	 * The function to return the value of the edge weight.
	 * 
	 * @return int - The value of the edge weight.
	 */
	public int getWeight() {

		return weight;
	}

	/**
	 * The function that receives and modifies the value of the edge weight.
	 * 
	 * @param weight
	 *            int - The value of the edge weight.
	 */
	public void setWeight(int weight) {

		this.weight = weight;
	}
}
