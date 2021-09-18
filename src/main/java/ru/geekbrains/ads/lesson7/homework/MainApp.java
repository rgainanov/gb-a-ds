package ru.geekbrains.ads.lesson7.homework;

import ru.geekbrains.ads.lesson7.Graph;
import ru.geekbrains.ads.lesson7.GraphImpl;

public class MainApp {
    public static void main(String[] args) {

        MyGraph graph = new MyGraph(10);

        graph.addEdge(0,1, 9);
        graph.addEdge(0,2, 2);
        graph.addEdge(0,3, 3);
        graph.addEdge(1,4, 4);
        graph.addEdge(2,5, 1);
        graph.addEdge(3,6, 2);
        graph.addEdge(4,7, 3);
        graph.addEdge(5,8, 8);
        graph.addEdge(6,9, 4);
        graph.addEdge(8,7, 2);
        graph.addEdge(9,7, 2);

        graph.displayAdjMatrix();
        System.out.println();
        System.out.println();

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(7));
        System.out.println(bfp.pathTo(7));
        System.out.println(bfp.distTo(7));






//        graph.bfs2("Moscow");
//        System.out.println(graph.findPath("Moscow", "Voronezh"));
//
//        System.out.println(graph.labelOf(1));
//        System.out.println(graph.labelOf(2));
//        System.out.println(graph.labelOf(9));
//
//        System.out.println(graph.destTo(graph.indexOf("Voronezh")));


//        graph.bfs("Moscow");

//        Integer[][] adjMatrix = graph.getAdjMatrix();

//        for (int i = 0; i < adjMatrix.length; i++) {
//            for (int j = 0; j < adjMatrix.length; j++) {
//                System.out.print(adjMatrix[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

    }

    public static Graph initGraph() {
        Graph graph = new GraphImpl(10);

        graph.addVertex("Moscow");
        graph.addVertex("Tula");
        graph.addVertex("Lipetsk");
        graph.addVertex("Ryazan");
        graph.addVertex("Tabmov");
        graph.addVertex("Saratov");
        graph.addVertex("Kaluga");
        graph.addVertex("Oryol");
        graph.addVertex("Kursk");
        graph.addVertex("Voronezh");

//        graph.addEdge("Moscow", "Tula", 100);
//        graph.addEdge("Moscow", "Ryazan", 100);
//        graph.addEdge("Moscow", "Kaluga", 300);
//
//        graph.addEdge("Tula", "Lipetsk", 200);
//        graph.addEdge("Ryazan", "Tabmov", 100);
//        graph.addEdge("Kaluga", "Oryol", 100);
//
//        graph.addEdge("Tabmov", "Saratov", 100);
//        graph.addEdge("Oryol", "Kursk", 50);
//
//        graph.addEdge("Lipetsk", "Voronezh", 300);
//        graph.addEdge("Saratov", "Voronezh", 200);
//        graph.addEdge("Kursk", "Voronezh", 40);

        return graph;
    }
}
