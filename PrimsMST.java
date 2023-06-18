import java.util.*;

class PrimGraph {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void primMST(int[][] graph, int vertices) {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        int[] key = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        key[0] = 0;
        parent[0] = -1;
        minHeap.add(new Edge(0, 0, 0));

        while (!minHeap.isEmpty()) {
            Edge minEdge = minHeap.poll();
            int u = minEdge.dest;
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                int weight = graph[u][v];
                if (weight != 0 && !visited[v] && weight < key[v]) {
                    key[v] = weight;
                    parent[v] = u;
                    minHeap.add(new Edge(u, v, weight));
                }
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (int i = 1; i < vertices; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        int[][] graph = {
            { 0, 2, 3, 0 },
            { 2, 0, 4, 3 },
            { 3, 4, 0, 5 },
            { 0, 3, 5, 0 }
        };

        primMST(graph, vertices);
    }
}
