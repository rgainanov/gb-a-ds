package ru.geekbrains.ads.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        List<Tree> treeList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Tree<Integer> tree = new TreeImpl<>(4);
            for (int j = 0; j < 1000; j++) {
                tree.add(random.nextInt(25 + 25) - 25);
            }
            treeList.add(tree);
        }

        int balanced = 0;
        int notBalanced = 0;
        for (int i = 0; i < treeList.size(); i++) {
//            System.out.println("Tree nr: " + (i + 1) + " ---> is Balanced: " + treeList.get(i).isBalanced(treeList.get(i).getRoot()));
            if (treeList.get(i).isBalanced(treeList.get(i).getRoot())) {
                balanced++;
            } else {
                notBalanced++;
            }
        }
        System.out.println("Percentage of balanced trees: " + (1.0 * balanced / (balanced + notBalanced) * 100) + "%");
    }

    public static void classroomWork() {
        Tree<Integer> tree = new TreeImpl<>(4);

        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(40);
        tree.add(55);
        tree.add(70);
        tree.add(31);
        tree.add(45);
        tree.add(42);
        tree.add(43);
        tree.add(67);
        tree.add(81);
        tree.add(63);

        tree.display();
        tree.remove(67);
        tree.remove(45);
        tree.remove(60);
        tree.display();
        tree.traverse(Tree.TraverseMode.IN_ORDER);
        System.out.println();
        tree.traverse(Tree.TraverseMode.PRE_ORDER);
        System.out.println();
        tree.traverse(Tree.TraverseMode.POST_ORDER);
    }
}
