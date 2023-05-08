package fgbhnhj;

import tree.Tree;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Tree<Integer> tree = new Tree(new IntComparator());

        loop:
        while (true){
            System.out.println("[1] Add 10^5 elements");
            System.out.println("[2] Add 10^6 elements");
            System.out.println("[3] Exit");

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> throwMeSomeNumbers(tree, 100_000, scanner);
                case 2 -> throwMeSomeNumbers(tree, 1_000_000, scanner);
                case 3 -> {break loop;}
            }
        }
    }

    private void throwMeSomeNumbers(Tree<Integer> tree, int howMuchToAdd, Scanner scanner) {

        addRandomNumbers(tree, howMuchToAdd);
        System.out.println("Height: " + tree.getHeight());

        System.out.println("[1] Show tree");
        System.out.println("[2] Go back");
        if (scanner.nextInt() == 1) {
            tree.traverse();
        }
        System.out.println();
    }

    private void addRandomNumbers(Tree<Integer> tree, int howMuchToAdd){
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < howMuchToAdd; i++) {
            tree.add(random.nextInt(-1_000_000, 1_000_000));
        }

        long finish = System.currentTimeMillis();
        System.out.println("Time = " + (finish-start));
    }

}
