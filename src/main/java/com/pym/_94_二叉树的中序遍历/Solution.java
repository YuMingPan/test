package com.pym._94_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();  // 显示栈
        TreeNode node = root;   // 用于遍历

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);   // 得不到释放
                node = node.left; // 指向左边
            }
            node = stack.pop();
            list.add(node.val); // 访问根
            node = node.right;  // 指向右
        }
        return list;
    }
}
