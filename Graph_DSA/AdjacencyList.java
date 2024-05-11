package Graph_DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  AdjacencyList {
    class Edge
    {
        int src;
        int des;
        int wt;
        public Edge(int src,int des,int wt )
        {
            this.des=des;
            this.src=src;
            this.wt=wt;
        }
    }
    ArrayList<Edge>[] graph;
    public  AdjacencyList(int v)
    {
        graph = new ArrayList[v];
        for (int i = 0; i <graph.length ; i++) {
            graph[i]=new ArrayList<Edge>();
        }
    }
    public void addEdge(int u,int v,int w)
    {
        graph[u].add(new Edge(u,v,w));
    }
    public void print()
    {
        for (ArrayList<Edge> list:graph)
        {
            for (Edge i:list) {
                System.out.println("Source : "+i.src+"   Destination : "+i.des+"   Weight : "+i.wt);
            }
            System.out.println();
        }
    }

    //
    public void printNeighbours(int n)
    {
        for(Edge i: graph[n])
        {
            System.out.println(i.des);
        }
    }

    //breadth first search
    public static void bfs(AdjacencyList g) {
boolean vis[] = new boolean[g.graph.length];
        for (int i = 0; i <g.graph.length ; i++) {
            if(!vis[i])
            {
                Utilbfs(g,i,vis);
            }
        }

        {

        }

    }


    public static void Utilbfs(AdjacencyList g,int s,boolean isVisited[])
    {

        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(s);
        while(!q.isEmpty())
        {
            int i=q.poll();

            if(!isVisited[i])
            {
                isVisited[i]=true;
                System.out.print(i+" -->");
                for(Edge v:g.graph[i])
                {
                    q.offer(v.des);
                }
            }


        }
    }

    //DEPTH FIRST SEARCH
    public static void dfs(AdjacencyList g,int curr,boolean[] vis)
    {
        System.out.print(curr+" ");
        vis[curr]=true;
        for(Edge i:g.graph[curr])
        {
            if(!vis[i.des])
            {
                dfs(g,i.des,vis);
            }
        }
    }

    //HAS PATH
    public static boolean hasPath(AdjacencyList graph,int src,int des,boolean visit[])
    {
        if(src==des)return true;
        visit[src]=true;
        for(Edge i:graph.graph[src])
        {
            int neigh=i.des;
            if(!visit[neigh] && hasPath(graph,neigh,des,visit))
                return true;
        }
        return false;


    }

    //CYCLE EXISTENCE WITH UNDIRECTED GRAPH
    public static boolean containsCycle(AdjacencyList g)
    {
        boolean isVisited[]=new boolean[g.graph.length];
        for (int i = 0; i <g.graph.length ; i++) {
            if(!isVisited[i])
            {
                if(containsCycleUtil(g,isVisited,i, -1))
                    return true;
            }

        }
        return false;
    }

    private static boolean containsCycleUtil(AdjacencyList g,boolean isVisited[], int curr,int parent) {
isVisited[curr]=true;
        for (int i = 0; i <g.graph[curr].size() ; i++) {
            Edge e=g.graph[curr].get(i);
            //case 3
            if(!isVisited[e.des])
            {
                if(containsCycleUtil(g,isVisited,e.des,curr)) {
                    return true;
                }
            }
            //case2
           else if(isVisited[e.des] && e.des!=parent)
            {
                return true;
            }
            //case 1 --> continue
        }
        return false;
    }


    public static void main(String[] args) {
        AdjacencyList graph=new AdjacencyList(6);
        graph.addEdge(0,1,5);
        graph.addEdge(1,0,5);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,3);
        graph.addEdge(2,1,1);
        graph.addEdge(2,4,2);
        graph.addEdge(2,3,1);
        graph.addEdge(3,1,3);
        graph.addEdge(3,2,1);
        graph.addEdge(4,2,2);
        graph.addEdge(5,5,0);

//        graph.printNeighbours(1);
        AdjacencyList.Utilbfs(graph,0,new boolean[6]);
//        System.out.println();
//        AdjacencyList.dfs(graph,0,new boolean[5]);

//        System.out.println(AdjacencyList.hasPath(graph,0,3,new  boolean[5]));
//        bfs(graph,0);
    }
}
