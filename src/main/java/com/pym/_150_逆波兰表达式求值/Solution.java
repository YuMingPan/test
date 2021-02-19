package com.pym._150_逆波兰表达式求值;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand1;
        int operand2;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {

                case "+":
                     operand1 = stack.pop();
                     operand2 = stack.pop();
                    // 操作数位于叶子节点，操作符位于其他节点
                    // 中序即为日常计算的顺序，后序为逆波兰表达式，以此判断pop出数据的前后运算
                    stack.push(operand2 + operand1);
                    break;
                case "-":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 - operand1);
                    break;
                case "*":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 * operand1);
                    break;
                case "/":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 / operand1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    }
}
