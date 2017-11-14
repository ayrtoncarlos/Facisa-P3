package br.cesed.unifacisa.si.example;

public class Graph {

	
	public class Edge {

		int source;
		int destiny;
		int weight;

		public Edge() {

			this.source = this.destiny = this.weight = 0;
		}
	};
	
	int V;
	int E;
	Edge edge[];

	public Graph(int v, int e) {

		this.V = v;
		this.E = e;
		this.edge = new Edge[e];

		for (int i = 0; i < e; ++i) {

			edge[i] = new Edge();
		}
	}

	public void bellmanFord(Graph graph, int source) {

		int V = graph.V;
		int E = graph.E;
		int distances[] = new int[V];

		for (int i = 0; i < V; ++i) {

			distances[i] = Integer.MAX_VALUE;
		}

		distances[source] = 0;

		for (int i = 1; i < V; ++i) {

			for (int j = 0; j < E; ++j) {

				int u = graph.edge[j].source;
				int v = graph.edge[j].destiny;
				int w = graph.edge[j].weight;

				if (distances[u] != Integer.MAX_VALUE && distances[u] + w < distances[v]) {

					distances[v] = distances[u] + w;
				}
			}
		}

		for (int j = 0; j < E; ++j) {

			int u = graph.edge[j].source;
			int v = graph.edge[j].destiny;
			int w = graph.edge[j].weight;

			if (distances[u] != Integer.MAX_VALUE && distances[u] + w < distances[v]) {

				System.out.println("The graph contains negative weight cycle");
			}
		}

		printArray(distances, V);
	}

	public void printArray(int[] distances, int V) {

		System.out.println("Vertex   Distance from Source");

		for (int i = 0; i < V; ++i) {

			System.out.println(i + "\t\t" + distances[i]);
		}

	}

}
