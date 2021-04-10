package com.javamultiplex.problemoftheday;

import java.util.ArrayList;

/**
 * @author Rohit Agarwal on 10/04/21 3:49 pm
 * @copyright www.javamultiplex.com
 */
public class LeftViewOfBinaryTree {

    public static int MAX_LEVEL = 0;

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        leftView(root, list, 1);
        MAX_LEVEL = 0;
        return list;
    }

    private static void leftView(Node root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }
        if (MAX_LEVEL < level) {
            list.add(root.data);
            MAX_LEVEL = level;
        }

        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(5);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(1);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
        System.out.println(leftView(root));
    }
}
