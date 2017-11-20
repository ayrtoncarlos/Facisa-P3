package br.cesed.unifacisa.si.example;

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
	private int V; // Number of vertices
	int[] array; // Create an array to store values.
	private int inserted; // Number of values in array.
	private LinkedList<Integer> adj[]; // Array of lists for Adjacency List Representation.

	/**
	 * Class Builder.
	 * 
	 * @param v
	 *            int - Initial number of vertices of the graph.
	 */
	public Graph(int v) {

		this.V = v;
		this.array = new int[INITIAL_SIZE];
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

		adj[v].add(w); // Add w to v's list.
	}

	/**
	 * The function to do DFS traversal. It uses the method recursive_DFS().
	 * 
	 * @param v
	 *            int - A value that represents the initial vertex.
	 */
	public void DFS(int v) {

		// Mark all the vertices as not visited(set as false by default in java).
		boolean visited[] = new boolean[this.V];

		System.out.printf("Following is Depth First Traversal " + "(starting from vertex %d): ", v);
		// Call the recursive helper function to print DFS traversal.
		recursive_DFS(v, visited);
	}

	/**
	 * The function to do DFS traversal for disconnected graphs. It uses the method
	 * recursive_DFS().
	 */
	public void DFS() {

		// Mark all the vertices as not visited(set as false by default in java).
		boolean visited[] = new boolean[this.V];

		System.out.print("Following is Depth First Traversal: ");
		// Call the recursive helper function to print DFS traversal,
		// starting from all vertices one by one.
		for (int i = 0; i < V; ++i) {

			if (visited[i] == false) {

				recursive_DFS(i, visited);
			}
		}
	}

	/**
	 * A function used by DFS() to print the vertices of the graph.
	 * 
	 * @param v
	 *            int - A value that represents the vertex.
	 * @param visited
	 *            boolean - Array of vertices visited.
	 */
	private void recursive_DFS(int v, boolean visited[]) {

		// Mark the current vertex as visited.
		visited[v] = true;

		// Now print it.
		System.out.print(v + " ");
		
		this.addInArray(v); // Add vertex in array.

		// Recur for all the vertices adjacent to this vertex.
		Iterator<Integer> i = adj[v].listIterator();

		// While the vertex i has neighboring vertices.
		while (i.hasNext()) {

			int n = i.next(); // It receives the neighboring vertex of i.

			// Checks if the previously received vertex was not visited.
			if (!visited[n]) {

				recursive_DFS(n, visited); // Call the function again.
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
