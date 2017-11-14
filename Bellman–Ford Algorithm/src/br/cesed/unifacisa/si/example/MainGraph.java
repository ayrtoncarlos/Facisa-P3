package br.cesed.unifacisa.si.example;

public class MainGraph {

	public static void main(String[] args) {
		
		int V = 5;
		int E = 3;
		
		Graph graph = new Graph(V, E);
		
		graph.edge[0].source = 0;
		graph.edge[0].destiny = 1;
		graph.edge[0].weight = -1;
		
		graph.edge[1].source = 0;
		graph.edge[1].destiny = 2;
		graph.edge[1].weight = 4;
		
		graph.edge[2].source = 1;
		graph.edge[2].destiny = 2;
		graph.edge[2].weight = 3;
		
		graph.edge[3].source = 1;
		graph.edge[3].destiny = 3;
		graph.edge[3].weight = 2;
		
		graph.edge[4].source = 1;
		graph.edge[4].destiny = 4;
		graph.edge[4].weight = 2;
		
		graph.edge[5].source = 3;
		graph.edge[5].destiny = 2;
		graph.edge[5].weight = 5;
		
		graph.edge[6].source = 3;
		graph.edge[6].destiny = 1;
		graph.edge[6].weight = 1;
		
		graph.edge[7].source = 4;
		graph.edge[7].destiny = 3;
		graph.edge[7].weight = -3;
		
		graph.bellmanFord(graph, 0);
	}
}
