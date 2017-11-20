package br.cesed.unifacisa.si.example;

/**
 * A class to represent a connected, directed and weighted graph.
 * 
 * @author Ayrton Carlos
 *
 */
public class Graph {

	private int V; // The number of vertices.
	private int E; // The number of edges.
	private Edge edge[]; // The array with the number of edges of the graph.

	/**
	 * Class Builder.
	 * 
	 * @param v
	 *            int - The number of vertices in the graph.
	 * @param e
	 *            int - The number of edges of the graph.
	 */
	public Graph(int v, int e) {

		this.V = v;
		this.E = e;
		this.edge = new Edge[e];

		for (int i = 0; i < e; ++i) {

			edge[i] = new Edge();
		}

	}

	/**
	 * The main function that finds shortest distances from source to all other
	 * vertices using Bellman-Ford algorithm.
	 * 
	 * The function also detects negative weight cycle.
	 * 
	 * @param source
	 *            int - The initial source of the graph.
	 */
	public void bellmanFord(int source) {

		// The array to store all distances from Source.
		int distances[] = new int[this.V];

		// Place a maximum value in all positions of the array of distances from Source,
		// because the goal is the smallest way.
		for (int i = 0; i < this.V; ++i) {

			distances[i] = Integer.MAX_VALUE;
		}

		// The distance from the initial source is zero.
		distances[source] = 0;

		for (int i = 1; i < this.V; ++i) {

			for (int j = 0; j < this.E; ++j) {

				int valueSource = this.getEdge()[j].getSource(); // Get the value of the source.
				int valueDestiny = this.getEdge()[j].getDestiny(); // Get the value of destination.
				int valueWeight = this.getEdge()[j].getWeight(); // Get the value of edge weight.

				if (distances[valueSource] != Integer.MAX_VALUE
						&& distances[valueSource] + valueWeight < distances[valueDestiny]) {

					distances[valueDestiny] = distances[valueSource] + valueWeight;
				}
			}
		}

		for (int j = 0; j < this.E; ++j) {

			int valueSource = this.getEdge()[j].getSource(); // Get the value of the source.
			int valueDestiny = this.getEdge()[j].getDestiny(); // Get the value of destination.
			int valueWeight = this.getEdge()[j].getWeight(); // Get the value of edge weight.

			if (distances[valueSource] != Integer.MAX_VALUE
					&& distances[valueSource] + valueWeight < distances[valueDestiny]) {

				System.out.println("The graph contains negative weight cycle");
			}
		}

		printArray(distances, this.V);
	}

	/**
	 * The function to print the vertices and weights of the edges of the graph.
	 * 
	 * @param distances
	 *            int[] - The array with all distances from Source.
	 * @param V
	 *            int - The number of vertices.
	 */
	public void printArray(int[] distances, int V) {

		System.out.println("Vertex   Distance from Source");

		for (int i = 0; i < V; ++i) {

			System.out.println(i + "\t\t" + distances[i]);
		}

	}

	/**
	 * The function that returns the number of edges of the graph.
	 * 
	 * @return Edge[] - The array with the number of edges of the graph.
	 */
	public Edge[] getEdge() {

		return edge;
	}

	/**
	 * The function to modify the array of edges of the graph.
	 * 
	 * @param edge
	 *            Edge[] - The array with the number of edges of the graph.
	 */
	public void setEdge(Edge[] edge) {

		this.edge = edge;
	}

}
