package com.javamultiplex.graph;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 18/04/21 3:40 pm
 * @copyright www.javamultiplex.com
 */
public class DijkstraAlgorithmUsingAdjacencyList {
    static class AdjacencyListNode {
        int id;
        int weight;
        AdjacencyListNode next;

        AdjacencyListNode(int id, int weight) {
            this.id = id;
            this.weight = weight;
            this.next = null;
        }
    }

    static class AdjacencyList {
        AdjacencyListNode head;
    }

    static class Graph {
        int vertices;
        AdjacencyList[] adjacencyLists;

        Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyLists = new AdjacencyList[vertices];
            for (int i = 0; i < vertices; i++) {
                this.adjacencyLists[i] = new AdjacencyList();
                this.adjacencyLists[i].head = null;
            }
        }

        //Graph is BiDirectional so adding edges from both sides.
        void addEdge(int source, int destination, int distance) {
            //Add edge from source to destination
            AdjacencyListNode node1 = new AdjacencyListNode(destination, distance);
            node1.next = this.adjacencyLists[source].head;
            this.adjacencyLists[source].head = node1;
            //Add edge from destination to source
            AdjacencyListNode node2 = new AdjacencyListNode(source, distance);
            node2.next = this.adjacencyLists[destination].head;
            this.adjacencyLists[destination].head = node2;
        }

    }

    static class MinHeapNode {
        int id;
        int weight;

        MinHeapNode(int id, int weight) {
            this.id = id;
            this.weight = weight;
        }

    }

    static class MinHeap {
        int capacity;
        int size;
        int[] positions;
        MinHeapNode[] nodes;

        MinHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.positions = new int[capacity];
            this.nodes = new MinHeapNode[capacity];
        }

        boolean isEmpty() {
            return this.size == 0;
        }

        void minHeapify(int index) {
            int smallest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left < this.size && this.nodes[left].weight < this.nodes[smallest].weight) {
                smallest = left;
            }

            if (right < this.size && this.nodes[right].weight < this.nodes[smallest].weight) {
                smallest = right;
            }

            if (smallest != index) {
                MinHeapNode smallestNode = this.nodes[smallest];
                MinHeapNode indexNode = this.nodes[index];
                this.positions[smallestNode.id] = index;
                this.positions[indexNode.id] = smallest;
                swapMinHeapNodes(smallest, index);
                minHeapify(smallest);
            }
        }

        void swapMinHeapNodes(int node1, int node2) {
            MinHeapNode temp = this.nodes[node1];
            this.nodes[node1] = this.nodes[node2];
            this.nodes[node2] = temp;
        }

        MinHeapNode extractMin() {
            if (isEmpty()) {
                return null;
            }
            MinHeapNode rootNode = this.nodes[0];
            MinHeapNode lastNode = this.nodes[this.size - 1];
            this.nodes[0] = lastNode;
            this.positions[rootNode.id] = this.size - 1;
            this.positions[lastNode.id] = 0;
            this.size--;
            minHeapify(0);
            return rootNode;
        }

        void decreaseKey(int vertex, int distance) {
            int index = this.positions[vertex];
            this.nodes[index].weight = distance;
            while (index != 0 && this.nodes[index].weight < this.nodes[(index - 1) / 2].weight) {
                this.positions[this.nodes[index].id] = (index - 1) / 2;
                this.positions[this.nodes[(index - 1) / 2].id] = index;
                swapMinHeapNodes(index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

        public boolean isInMinHeap(int vertex) {
            if (this.positions[vertex] < this.size) {
                return true;
            }
            return false;
        }
    }

    public static int[] dijkstra(Graph graph, int source) {
        int vertices = graph.vertices;
        int[] distances = new int[vertices];
        MinHeap minHeap = new MinHeap(vertices);
        for (int i = 0; i < vertices; i++) {
            distances[i] = Integer.MAX_VALUE;
            minHeap.nodes[i] = new MinHeapNode(i, distances[i]);
            minHeap.positions[i] = i;
        }
        distances[source] = 0;
        minHeap.decreaseKey(source, distances[source]);
        minHeap.size = vertices;

        while (!minHeap.isEmpty()) {
            MinHeapNode min = minHeap.extractMin();
            int u = min.id;
            AdjacencyListNode adjacencyListNode = graph.adjacencyLists[u].head;
            while (adjacencyListNode != null) {
                int v = adjacencyListNode.id;
                if (minHeap.isInMinHeap(v)
                        && distances[u] != Integer.MAX_VALUE
                        && adjacencyListNode.weight + distances[u] < distances[v]) {
                    distances[v] = adjacencyListNode.weight + distances[u];
                    minHeap.decreaseKey(v, distances[v]);
                }
                adjacencyListNode = adjacencyListNode.next;
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int V = 9;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 8, 2);
        graph.addEdge(2, 5, 4);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);
        int[] dijkstra = dijkstra(graph, 0);
        System.out.println(Arrays.toString(dijkstra));
    }

}
