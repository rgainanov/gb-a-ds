package ru.geekbrains.ads.lesson7;

import java.util.Stack;

public interface Graph {
    void addVertex(String label);

    boolean addEdge(String startLabel, String secondLabel, String... others);

    int getSize();

    void dfs(String startLabel);

    void bfs(String startLabel);

    void display();

//    Stack<String> findShortPathViaBfs(String startLabel, String finishLabel);
}
