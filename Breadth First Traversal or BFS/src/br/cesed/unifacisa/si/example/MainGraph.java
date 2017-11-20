package br.cesed.unifacisa.si.example;

/**
 * Represents the Main Class of Breadth First Traversal or BFS.
 * 
 * @author Ayrton Carlos
 *
 */
public class MainGraph {

	public static void main(String[] args) {

		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		System.out.print("Following is Breadth First Traversal " + "(starting from vertex 2): ");

		bfs.BFS(0);
	}
}
