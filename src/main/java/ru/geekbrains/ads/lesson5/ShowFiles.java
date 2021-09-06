package ru.geekbrains.ads.lesson5;

import java.io.File;

public class ShowFiles {
    public static void main(String[] args) {
        File file = new File("/Users/gainanov/Desktop/workspaces/algoDataStructures");
        viewFiles(file);
    }

    private static void viewFiles(File root, int level) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("\t");
        }

//        prefix.append("\t".repeat(level));

        if (root.isFile()) {
            System.out.println(prefix + "File: " + root.getName());
        } else {
            System.out.println(prefix + "Dir: " + root.getName());
            level++;
            for (File file : root.listFiles()) {
                viewFiles(file, level);
            }
        }
    }

    private static void viewFiles(File root) {
        viewFiles(root, 0);
    }
}
