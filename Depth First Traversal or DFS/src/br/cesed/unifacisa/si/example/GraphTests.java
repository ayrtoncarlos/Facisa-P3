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

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS();

		String array = "0 1 2 3";
		assertEquals(array, dfs.getArray());
	}

	@Test
	void testGraph2() {

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS(2);

		String array = "2 0 1 3";
		assertEquals(array, dfs.getArray());
	}

	@Test
	void testGraph3() {

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS(1);

		String array = "1 2 0 3";
		assertEquals(array, dfs.getArray());
	}

	@Test
	void testGraph4() {

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS(3);

		String array = "3";
		assertEquals(array, dfs.getArray());
	}

	@Test
	void testGraph5() {

		Graph dfs = new Graph(4);

		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);

		dfs.DFS(0);

		String array = "0 1 2 3";
		assertEquals(array, dfs.getArray());
	}

}
