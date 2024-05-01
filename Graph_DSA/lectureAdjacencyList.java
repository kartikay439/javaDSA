package Graph_DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class lectureAdjacencyList {
    ArrayList<Integer>[] graph;
    public  lectureAdjacencyList(int v)
    {
        graph = new ArrayList[v];
        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<Integer>();
        }
    }
    public void addEdge(int u,int v)
    {
        graph[u].add(v);
        graph[v].add(u);
    }
    public void print()
    {
        int i=0;
        for (ArrayList<Integer> list:graph)
        {
            System.out.println(i+++" "+list);
        }
    }
    //breadth first search
    public static void bfs(lectureAdjacencyList g,int s)
    {
        boolean []isVisited=new boolean[g.graph.length];
        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(s);
        while(!q.isEmpty())
        {
            int i=q.poll();

            if(!isVisited[i])
            {
                isVisited[i]=true;
                System.out.println(i+" ");
            }
            for(Integer v:g.graph[i])
            {
                q.offer(v);
            }
        }
    }

    public static void main(String[] args) {
        lectureAdjacencyList graph=new lectureAdjacencyList(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        bfs(graph,0);
    }
}
