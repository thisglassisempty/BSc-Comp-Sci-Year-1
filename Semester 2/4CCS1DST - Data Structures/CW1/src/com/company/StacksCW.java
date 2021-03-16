package com.company;
import net.datastructures.Stack;
import net.datastructures.ArrayStack;

public class StacksCW {

    public static void compress(Stack<Integer> s1, Stack<Integer> s2) {

        // record initial size to know where to stop
        int initialSize = s2.size();

        while(!s1.isEmpty()) {

            if(s1.top() != null) {
                s2.push(s1.pop());
            }
            else { s1.pop(); }
        }

        // put s1 values that are currently in s2 back into s1
        while(s2.size() != initialSize) {
            s1.push(s2.pop());
        }
    }



    public static void main(String[] args) {

        // test method compress

        Stack<Integer> S = new ArrayStack<Integer>(10);
        S.push(2); S.push(null); S.push(null); S.push(4); S.push(6); S.push(null);
        Stack<Integer> X = new ArrayStack<Integer>(10);
        X.push(7); X.push(9);
        System.out.println("stack S: " + S);
        // prints: "stack S: [2, null, null, 4, 6, null]"

        System.out.println("stack X: " + X);
        // prints: "stack X: [7, 9]"
        compress(S, X);

        System.out.println("stack S: " + S);
        // should print: "stack S: [2, 4, 6]"

        System.out.println("stack X: " + X);
        // should print: "stack X: [7, 9]"
    }


}
