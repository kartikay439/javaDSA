package Graph_DSA;

public class AdjacencyMatrix {
    private int[][] graph;
    private int vertex;
    public AdjacencyMatrix(int vertex)
    {
        graph=new int[vertex][vertex];
        this.vertex=vertex;
    }
    public void addEdge(int source,int destination)
    {
        //undirected AND unweighted//
        graph[source][destination] = 1;
        graph[destination][source] = 1;
    }
    public void print()
    {
        for (int[] i:graph) {
            for (int j : i) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph=new AdjacencyMatrix(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
    }
}
