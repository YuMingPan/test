package com.pym._102_二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelSize = queue.size();   // 初始为1

        List<Integer> levelList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            levelList.add(node.val);
            levelSize--;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            // 一层完毕
            if (levelSize == 0) {
                levelSize = queue.size();
                list.add(levelList);
                levelList = new ArrayList<>();
            }
        }
        return list;
    }
}
