package ru.geekbrains.ads.lesson7.homework;

import java.util.LinkedList;

public class MyGraph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] adjLists;
    private int[][] adjMatrix;

    public MyGraph(int vertexCount) {
        if (vertexCount < 0) {
            throw new IllegalArgumentException("Vertex count can't be less then 1");
        }

        this.vertexCount = vertexCount;
        this.adjLists = new LinkedList[vertexCount];
        this.adjMatrix = new int[vertexCount][vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public LinkedList<Integer> getAdjLists(int vertex) {
        if (vertexCount < 0 || vertex > vertexCount -1) {
            throw new IllegalArgumentException("Incorrect vertex index");
        }
        return adjLists[vertex];
    }

    public int getWeight(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 > vertexCount - 1 || vertex2 > vertexCount - 1) {
            throw new IllegalArgumentException("Incorrect vertex index");
        }
        return adjMatrix[vertex1][vertex2];
    }

    public void displayAdjMatrix() {
        System.out.print("  ");
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void addEdge(int vertex1, int vertex2, int weight) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 > vertexCount - 1 || vertex2 > vertexCount - 1) {
            throw new IllegalArgumentException("Incorrect vertex index");
        }

        adjLists[vertex1].add(vertex2);
        adjLists[vertex2].add(vertex1);

        adjMatrix[vertex1][vertex2] = weight;
        edgeCount++;
    }
}
