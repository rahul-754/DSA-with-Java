        package graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class creategraph{
    static class edge{
        int source;
        int destination;
        int weight;

        edge(int source,int destination,int weight){
            this.source = source;
            this.destination=destination;
            this.weight=weight;
        }
    }
    public static void bfs(ArrayList<edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.println(curr+" ");
                visited[curr] = true;
                for(int i =0;i<graph[curr].size();i++){
                    edge e = graph[curr].get(i);
                    q.add(e.destination);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge>[] graph,int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;
        for(int i = 0 ;i <graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                dfs(graph, e.destination, vis);
            }
        }
    }
    public static boolean haspath(ArrayList<edge>[] graph, int source,int destination,boolean visited[]){
        if(source == destination){
            return true;
        }
        visited[source] = true;
        for(int i = 0; i<graph[source].size();i++){
            edge e = graph[source].get(i);
            if(!visited[e.destination] && haspath(graph, e.destination, destination, visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        ArrayList<edge>[] graph = new ArrayList[v];
        for(int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 5));
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 4));
        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));
        graph[4].add(new edge(4, 2, 2));
      //  for(int i =0;i<graph.)
        //bfs(graph);
       // System.out.println(haspath(graph, 0, 6, new boolean[v]));
        dfs(graph, 05,new boolean[v]);
    }


}