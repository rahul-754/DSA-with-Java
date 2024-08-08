package graphs;
import java.util.*;

public class graph {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storedVis, boolean vis[]) {
        storedVis.add(node);
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, adj, storedVis, vis);
            }
        }
    }

    public static void bfs(int node, Queue<Integer> q, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> bfsOrder) {
        q.add(node);
        vis[node] = true;
        while (!q.isEmpty()) {
            int s = q.poll();
            bfsOrder.add(s); // Store the node in BFS order list
            System.out.println(s);
            for (Integer it : adj.get(s)) {
                if (!vis[it]) {
                    q.add(it);
                    vis[it] = true; // Mark the node as visited when adding to the queue
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter the number of edges:");
        int E = sc.nextInt();
        System.out.println("Enter the edges (format: u v):");
        for (int i = 0; i < E; i++) {
            // write for the connections between the nodes 
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // Fixed to add the edge correctly
        }
        boolean vis[] = new boolean[V + 1]; // Adjusting size for 1-based index
        ArrayList<Integer> storedVis = new ArrayList<>();

        // DFS Traversal
        dfs(1, adj, storedVis, vis);
        System.out.println("DFS Traversal: " + storedVis);

        // Reset visited array for BFS
        Arrays.fill(vis, false);
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> bfsOrder = new ArrayList<>();

        // BFS Traversal
        bfs(1, q, adj, vis, bfsOrder);
        System.out.println("BFS Traversal: " + bfsOrder);
    }
}
