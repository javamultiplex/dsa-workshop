package com.javamultiplex.graph;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 18/04/21 3:02 pm
 * @copyright www.javamultiplex.com
 */
public class DijkstraAlgorithmUsingAdjacencyMatrix {

    //TC - O(V^2), Adjacency Matrix Representation
    public static int[] method1(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices];
        boolean[] finalized = new boolean[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        //O(V^2)
        for (int count = 0; count < vertices - 1; count++) {
            int u = -1;
            //O(V)
            for (int i = 0; i < vertices; i++) {
                if (!finalized[i] && (u == -1 || distance[i] < distance[u])) {
                    u = i;
                }
            }
            finalized[u] = true;
            //O(V)
            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !finalized[v]) {
                    distance[v] = Math.min(distance[v], distance[u] + graph[u][v]);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[] distance = method1(new int[][]{{0, 50, 100, 0},
                {50, 0, 30, 200},
                {100, 30, 0, 20},
                {0, 200, 20, 0},}, 0);
        System.out.println(Arrays.toString(distance));
    }
}
