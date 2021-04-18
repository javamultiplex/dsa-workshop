package com.javamultiplex.graph;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 18/04/21 3:40 pm
 * @copyright www.javamultiplex.com
 */
public class DijkstraAlgorithmUsingAdjacencyList {
    static class ListNode {
        int destination;
        int distance;
        ListNode next;

        ListNode(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
            this.next = null;
        }
    }

    static class List {
        ListNode head;
    }

    static class Graph {
        int vertices;
        List[] lists;

        Graph(int vertices) {
            this.vertices = vertices;
            this.lists = new List[vertices];
            for (int i = 0; i < vertices; i++) {
                this.lists[i] = new List();
                this.lists[i].head = null;
            }
        }

        //Graph is BiDirectional so adding edges from both sides.
        void addEdge(int source, int destination, int distance) {
            //Add edge from source to destination
            ListNode node1 = new ListNode(destination, distance);
            node1.next = this.lists[source].head;
            this.lists[source].head = node1;
            //Add edge from destination to source
            ListNode node2 = new ListNode(source, distance);
            node2.next = this.lists[destination].head;
            this.lists[destination].head = node2;
        }

    }

    static class MinHeapNode {
        int vertex;
        int distance;

        MinHeapNode(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

    }

    static class MinHeap {
        int capacity;
        int size;
        int[] positions;
        MinHeapNode[] minHeapNodes;

        MinHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.positions = new int[capacity];
            this.minHeapNodes = new MinHeapNode[capacity];
        }

        boolean isEmpty() {
            return this.size == 0;
        }

        void minHeapify(int index) {
            int smallest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left < this.size && this.minHeapNodes[left].distance < this.minHeapNodes[smallest].distance) {
                smallest = left;
            }

            if (right < this.size && this.minHeapNodes[right].distance < this.minHeapNodes[smallest].distance) {
                smallest = right;
            }

            if (smallest != index) {
                MinHeapNode smallestNode = this.minHeapNodes[smallest];
                MinHeapNode indexNode = this.minHeapNodes[index];
                this.positions[smallestNode.vertex] = index;
                this.positions[indexNode.vertex] = smallest;
                swapMinHeapNodes(smallest, index);
                minHeapify(smallest);
            }
        }

        void swapMinHeapNodes(int node1, int node2) {
            MinHeapNode temp = this.minHeapNodes[node1];
            this.minHeapNodes[node1] = this.minHeapNodes[node2];
            this.minHeapNodes[node2] = temp;
        }

        MinHeapNode extractMin() {
            if (isEmpty()) {
                return null;
            }
            MinHeapNode rootNode = this.minHeapNodes[0];
            MinHeapNode lastNode = this.minHeapNodes[this.size - 1];
            this.minHeapNodes[0] = lastNode;
            this.positions[rootNode.vertex] = this.size - 1;
            this.positions[lastNode.vertex] = 0;
            this.size--;
            minHeapify(0);
            return rootNode;
        }

        void decreaseKey(int vertex, int distance) {
            int index = this.positions[vertex];
            this.minHeapNodes[index].distance = distance;
            while (index != 0 && this.minHeapNodes[index].distance < this.minHeapNodes[(index - 1) / 2].distance) {
                this.positions[this.minHeapNodes[index].vertex] = (index - 1) / 2;
                this.positions[this.minHeapNodes[(index - 1) / 2].vertex] = index;
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
            minHeap.minHeapNodes[i] = new MinHeapNode(i, distances[i]);
            minHeap.positions[i] = i;
        }
        distances[source] = 0;
        minHeap.decreaseKey(source, distances[source]);
        minHeap.size = vertices;

        while (!minHeap.isEmpty()) {
            MinHeapNode min = minHeap.extractMin();
            int u = min.vertex;
            ListNode listNode = graph.lists[u].head;
            while (listNode != null) {
                int v = listNode.destination;
                if (minHeap.isInMinHeap(v)
                        && distances[u] != Integer.MAX_VALUE
                        && listNode.distance + distances[u] < distances[v]) {
                    distances[v] = listNode.distance + distances[u];
                    minHeap.decreaseKey(v, distances[v]);
                }
                listNode = listNode.next;
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
