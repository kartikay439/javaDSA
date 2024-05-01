package Graph_DSA;

import java.util.ArrayList;
import java.util.List;

public class adjacencyList {
    class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }
    List<Edge> graph = new ArrayList<Edge>();

    public void addEdge(int s, int d, int w) {
        Edge e = new Edge(s, d, w);
        graph.add(e);
    }

    public void iterate() {
        for (Edge e : graph) {
            System.out.println("source: " + e.source + " destination: " + e.destination + " weight: " + e.weight);
        }
    }
    public static void main(String[] args) {
    adjacencyList graph=new adjacencyList();
    graph.addEdge(0,1,3);
    graph.addEdge(0,1,3);
    graph.addEdge(0,1,3);
    graph.iterate();
    }
}






