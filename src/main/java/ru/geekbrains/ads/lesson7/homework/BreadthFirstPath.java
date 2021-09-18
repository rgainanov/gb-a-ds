package ru.geekbrains.ads.lesson7.homework;

import java.util.LinkedList;

public class BreadthFirstPath {
    private MyGraph graph;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private int source;
    private int inf = Integer.MIN_VALUE;

    public BreadthFirstPath(MyGraph graph, int source) {
        this.graph = graph;
        this.source = source;

        if (source < 0) {
            throw new IllegalArgumentException("Invalid source index");
        }

        if (source > graph.getVertexCount() - 1) {
            throw new IndexOutOfBoundsException();
        }

        edgeTo = new int[graph.getVertexCount()];
        distTo = new int[graph.getVertexCount()];
        marked = new boolean[graph.getVertexCount()];
        for (int i = 0; i < graph.getVertexCount(); i++) {
            distTo[i] = inf;
        }

        bfs();
    }

    private void bfs() {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;
        distTo[source] = 0;

        while (!queue.isEmpty()) {
            int currentVertex = queue.removeFirst();
            for (int w : graph.getAdjLists(currentVertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = currentVertex;
                    distTo[w] = distTo[currentVertex] + graph.getWeight(currentVertex, w);
                    queue.addLast(w);
                }
            }
        }
    }

    public boolean hasPathTo(int dest) {
        // ToDo Error handling
        return marked[dest];
    }

    public LinkedList<Integer> pathTo(int dest) {
        if (!hasPathTo(dest)) {
            return null;
        }

        LinkedList<Integer> stack = new LinkedList<>();
        int currentVertex = dest;
        while (currentVertex != source) {
            stack.push(currentVertex);
            currentVertex = edgeTo[currentVertex];
        }
        return stack;
    }

    public int distTo(int dest) {
        //ToDo Error handling
        return distTo[dest];
    }
}
