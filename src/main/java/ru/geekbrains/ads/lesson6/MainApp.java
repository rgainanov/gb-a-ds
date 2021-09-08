package ru.geekbrains.ads.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Tree<Integer> tree = new TreeImpl<>();

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

//        tree.display();
//        tree.remove(67);
//        tree.remove(45);
//        tree.remove(60);
//        tree.display();
        tree.traverse(Tree.TraverseMode.IN_ORDER);
        System.out.println();
        tree.traverse(Tree.TraverseMode.PRE_ORDER);
        System.out.println();
        tree.traverse(Tree.TraverseMode.POST_ORDER);
    }
}
