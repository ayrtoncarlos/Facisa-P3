package br.cesed.unifacisa.si.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Represents several graph test cases with JUnit 5.
 * 
 * @author Ayrton Carlos
 * 
 */
class GraphTests {

	@Test
	void testGraph1() {

		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		bfs.BFS(3);
		String array = "3";
		assertEquals(array, bfs.getArray());
	}

	@Test
	void testGraph2() {

		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		bfs.BFS(1);

		String array = "1 2 0 3";
		assertEquals(array, bfs.getArray());

	}

	@Test
	void testGraph3() {

		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		bfs.BFS(2);

		String array = "2 0 3 1";
		assertEquals(array, bfs.getArray());

	}

	@Test
	void testGraph4() {

		Graph bfs = new Graph(4);

		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);

		bfs.BFS(0);

		String array = "0 1 2 3";
		assertEquals(array, bfs.getArray());

	}

}
