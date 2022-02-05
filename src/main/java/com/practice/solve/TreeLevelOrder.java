package com.practice.solve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrder {

    public List<Integer> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        if(root == null) {
            return null;
        }
        queue.add(root);
        List<Integer> values = new ArrayList<>();
        while (!queue.isEmpty()){
            Node node = queue.poll();
            values.add(node.data);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return values;
    }
}
