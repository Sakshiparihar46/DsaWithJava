package Graph;

import java.util.*;

public class graph20 {
     static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));

        graph[4].add(new Edge(4,3));

    }

    public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr){
         vis[curr]=true;
         System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, vis, e.dest);
            }
        }
    }
    
    public static void topSort(ArrayList<Edge> graph[],boolean vis[],int curr,Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, vis, e.dest, s);
            }
        }
        s.push(curr);
    }

    public static void kosaraju(ArrayList<Edge> graph[],int V){
        //step1
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for (int i = 0; i <V; i++) {
            topSort(graph, vis, i, s);
        }
        //step2 transpose graph
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for (int i = 0; i <graph.length; i++) {
            vis[i]=false;
            transpose[i]=new ArrayList<Edge>();  
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        //step 3
        while (!s.isEmpty()) {
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("scc  ");
                dfs(transpose,vis, curr);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
