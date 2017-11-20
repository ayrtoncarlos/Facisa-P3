package br.cesed.unifacisa.si.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class represents a directed graph using adjacency list representation.
 * 
 * @author Ayrton Carlos
 * 
 */
public class Graph {

	private static final int INITIAL_SIZE = 1; // The initial size of the array.
	private int V; // Number of Vertices.
	Queue queue; // Create a queue for BFS.
	int[] array; // Create an array to store queue values.
	private int inserted; // Number of values in array.
	private LinkedList<Integer> adj[]; // Adjacency Lists.

	/**
	 * Class Builder.
	 * 
	 * @param v
	 *            int - Initial number of vertices of the graph.
	 */
	public Graph(int v) {

		this.array = new int[INITIAL_SIZE];
		this.V = v;
		this.queue = new Queue();
		this.inserted = 0;
		adj = new LinkedList[v];

		for (int i = 0; i < v; ++i) {

			adj[i] = new LinkedList();
		}
	}

	/**
	 * The function to add an edge into the graph.
	 * 
	 * @param v
	 *            int - A value representing the vertex v.
	 * @param w
	 *            int - A value representing the vertex w.
	 */
	public void addEdge(int v, int w) {

		adj[v].add(w);
	}

	/**
	 * The function that prints BFS traversal from a given vertex.
	 * 
	 * @param v
	 *            int - A value that represents the initial vertex.
	 */
	public void BFS(int v) {

		// Mark all the vertices as not visited (By default set as false).
		boolean visited[] = new boolean[V];

		// Mark the current vertex as visited and put it in the queue.
		visited[v] = true;
		queue.addElement(v);

		while (queue.getSize() != 0) {

			// Dequeue a vertex from queue and print it.
			v = (int) queue.getFirst();
			queue.removeElement();
			System.out.print(v + " ");
			
			this.addInArray(v); // add vertex in array.

			// Get all adjacent vertices of the dequeued vertex s.
			// If a adjacent has not been visited, then mark it,
			// visited and enqueue it.
			Iterator<Integer> i = adj[v].listIterator();

			// While the vertex i has neighboring vertices.
			while (i.hasNext()) {

				int n = i.next(); // It receives the neighboring vertex of i.

				// Checks if the previously received vertex was not visited.
				if (!visited[n]) {

					// Mark the vertex as visited and then add it in the queue.
					visited[n] = true;
					queue.addElement(n);
				}
			}
		}
	}

	/**
	 * The function that adds the values in the array.
	 * 
	 * @param value
	 *            int - A value that represents the vertex.
	 */
	public void addInArray(int value) {

		if (inserted == array.length) {

			internArrayOverflow();

		}

		array[inserted] = value;
		inserted++;
	}

	/**
	 * The function that returns a new array with greater capacity and with all the
	 * data from the previous array.
	 * 
	 * @return int[] - New array if array capacity exceeds.
	 */
	private int[] internArrayOverflow() {

		int[] newArray = new int[array.length * 2];

		for (int i = 0; i < array.length; i++) {

			newArray[i] = array[i];
		}

		return array = newArray;
	}

	/**
	 * The function that returns the array values.
	 * 
	 * @return String - Array values for tests in JUnit.
	 */
	public String getArray() {

		String vector = "";
		int i = 0;
		for (; i < array.length - 1; i++) {

			vector += array[i] + " ";
		}

		vector += array[i];
		return vector;
	}
}
