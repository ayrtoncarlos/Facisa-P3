package br.cesed.unifacisa.si.example;

/**
 * Represents the Main Class of Depth First Traversal or DFS.
 * 
 * @author Ayrton Carlos
 *
 */
public class MainGraph {

	public static void main(String[] args) {

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS(0);

	}
}
