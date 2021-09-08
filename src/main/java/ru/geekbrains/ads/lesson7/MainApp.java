package ru.geekbrains.ads.lesson7;

public class MainApp {
    public static void main(String[] args) {
//        testGraph();
//        testDfs();
        testBfs();
    }

    private static void testBfs() {
        Graph graph = new GraphImpl(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("E", "H");
        graph.addEdge("C", "F");
        graph.addEdge("D", "G");

        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new GraphImpl(7);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.dfs("A");
    }

    private static void testGraph() {
        Graph graph = new GraphImpl(4);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", "C");
        graph.addEdge("B", "C", "D");
        graph.addEdge("C", "A", "B", "D");
        graph.addEdge("D", "B", "C");

        System.out.println("Graph size: " + graph.getSize());
        graph.display();
    }
}
