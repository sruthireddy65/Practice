package com.practice.solve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TreeLevelOrderTest {

    private Node root1;

    private Node root2;

    @BeforeEach
    public void setup(){
        root1 = new Node(2);
        root1.left = new Node(10);
        root1.right = new Node(7);
        root1.left.left = new Node(1);
        root1.left.right = new Node(3);
        root1.right.left = new Node(4);
        root1.right.right = new Node(5);

        root2 = new Node(2);
        root2.left = new Node(8);
        root2.right = new Node(9);
        root2.left.right = new Node(3);
        root2.right.right = new Node(3);
        root2.left.right.left = new Node(4);
        root2.right.right.right = new Node(7);
        root2.left.right.left.left = new Node(5);
    }

    @Test
    public void testLevelOrder(){
        TreeLevelOrder levelOrder = new TreeLevelOrder();
        assertIterableEquals(Arrays.asList(2, 10, 7, 1, 3, 4, 5), levelOrder.levelOrder(root1));
        assertIterableEquals(Arrays.asList(2, 8, 9, 3, 3, 4, 7, 5), levelOrder.levelOrder(root2));
    }
}